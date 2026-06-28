#!/usr/bin/env python3
"""Copia lliuraments Java de NetBeans en una carpeta anonimitzada.

Ús habitual:
    python3 anonimitza_lliuraments.py carpeta_amb_lliuraments

Per defecte genera:
    lliuraments-anonims/          Carpeta que es pot passar a l'agent
    mapping-anonimitzacio.csv     Fitxer privat per al professor

Opcions útils:
    --desti carpeta_sortida        Canvia la carpeta anonimitzada
    --mapping mapping.csv          Canvia el fitxer de correspondència
    --force                        Sobreescriu la sortida si ja existeix

El script copia només fitxers .java dins de src, canvia el package a alumne_XX
i substitueix @author per alumne-XX. No renombra classes ni fitxers.
"""

from __future__ import annotations

import argparse
import csv
import re
import shutil
import sys
from pathlib import Path


DEFAULT_OUTPUT_DIR = "lliuraments-anonims"
DEFAULT_MAPPING_FILE = "mapping-anonimitzacio.csv"


PACKAGE_RE = re.compile(r"^\s*package\s+[A-Za-z_]\w*(?:\.[A-Za-z_]\w*)*\s*;\s*$", re.MULTILINE)
AUTHOR_RE = re.compile(r"^([ \t]*\*?[ \t]*)@author\b.*$", re.MULTILINE)


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser(
        description="Anonimitza lliuraments NetBeans copiant només els fitxers .java de src."
    )
    parser.add_argument("origen", help="Carpeta que conté els projectes lliurats pels alumnes")
    parser.add_argument(
        "--desti",
        default=DEFAULT_OUTPUT_DIR,
        help=f"Carpeta de sortida anonimitzada (per defecte: {DEFAULT_OUTPUT_DIR})",
    )
    parser.add_argument(
        "--mapping",
        default=DEFAULT_MAPPING_FILE,
        help=f"Fitxer CSV privat de correspondència (per defecte: {DEFAULT_MAPPING_FILE})",
    )
    parser.add_argument(
        "--force",
        action="store_true",
        help="Sobreescriu la carpeta de sortida i el mapping si ja existeixen",
    )
    return parser.parse_args()


def anonymize_java(content: str, package_name: str, author_name: str) -> str:
    package_line = f"package {package_name};"

    if PACKAGE_RE.search(content):
        content = PACKAGE_RE.sub(package_line, content, count=1)
    else:
        content = f"{package_line}\n\n{content.lstrip()}"

    content = AUTHOR_RE.sub(rf"\1@author {author_name}", content)
    return content


def prepare_output(output_dir: Path, mapping_file: Path, force: bool) -> None:
    if force:
        if output_dir.exists():
            shutil.rmtree(output_dir)
        if mapping_file.exists():
            mapping_file.unlink()
        return

    existing = [str(path) for path in (output_dir, mapping_file) if path.exists()]
    if existing:
        raise FileExistsError(
            "Ja existeix: "
            + ", ".join(existing)
            + ". Esborra-ho manualment o executa amb --force."
        )


def collect_projects(source_dir: Path) -> list[Path]:
    return sorted(
        (path for path in source_dir.iterdir() if path.is_dir() and (path / "src").is_dir()),
        key=lambda path: path.name.lower(),
    )


def copy_project(project_dir: Path, output_dir: Path, anonymous_id: str, package_name: str) -> list[str]:
    java_files = sorted((project_dir / "src").rglob("*.java"), key=lambda path: str(path).lower())
    student_dir = output_dir / anonymous_id
    student_dir.mkdir(parents=True, exist_ok=True)

    copied_files: list[str] = []
    used_names: dict[str, int] = {}

    for java_file in java_files:
        destination_name = unique_name(java_file.name, used_names)
        destination = student_dir / destination_name
        content = java_file.read_text(encoding="utf-8", errors="replace")
        destination.write_text(anonymize_java(content, package_name, anonymous_id), encoding="utf-8")
        copied_files.append(destination_name)

    return copied_files


def unique_name(filename: str, used_names: dict[str, int]) -> str:
    count = used_names.get(filename, 0)
    used_names[filename] = count + 1
    if count == 0:
        return filename

    path = Path(filename)
    return f"{path.stem}_{count + 1}{path.suffix}"


def write_mapping(mapping_file: Path, rows: list[dict[str, str]]) -> None:
    with mapping_file.open("w", newline="", encoding="utf-8") as csvfile:
        writer = csv.DictWriter(
            csvfile,
            fieldnames=["anonymous_id", "package_name", "original_folder", "files"],
        )
        writer.writeheader()
        writer.writerows(rows)


def main() -> int:
    args = parse_args()
    source_dir = Path(args.origen).resolve()
    output_dir = Path(args.desti).resolve()
    mapping_file = Path(args.mapping).resolve()

    if not source_dir.is_dir():
        print(f"Error: l'origen no és una carpeta: {source_dir}", file=sys.stderr)
        return 1

    try:
        prepare_output(output_dir, mapping_file, args.force)
    except FileExistsError as error:
        print(f"Error: {error}", file=sys.stderr)
        return 1

    projects = collect_projects(source_dir)
    if not projects:
        print(f"Error: no s'han trobat projectes amb carpeta src dins {source_dir}", file=sys.stderr)
        return 1

    output_dir.mkdir(parents=True)
    mapping_rows: list[dict[str, str]] = []

    for index, project_dir in enumerate(projects, start=1):
        anonymous_id = f"alumne-{index:02d}"
        package_name = f"alumne_{index:02d}"
        copied_files = copy_project(project_dir, output_dir, anonymous_id, package_name)
        mapping_rows.append(
            {
                "anonymous_id": anonymous_id,
                "package_name": package_name,
                "original_folder": project_dir.name,
                "files": ";".join(copied_files),
            }
        )

    write_mapping(mapping_file, mapping_rows)
    print(f"Projectes anonimitzats: {len(mapping_rows)}")
    print(f"Sortida per a l'agent: {output_dir}")
    print(f"Mapping privat: {mapping_file}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
