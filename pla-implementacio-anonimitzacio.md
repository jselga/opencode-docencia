# Pla d'implementació del script d'anonimització

## Objectiu

Preparar una còpia anònima dels lliuraments de l'alumnat per poder revisar-los amb un agent d'IA sense exposar dades personals ni fitxers innecessaris del projecte original.

El cas previst són projectes Java de NetBeans amb estructura similar a:

```text
ProjecteAlumne/
├── build.xml
├── manifest.mf
├── nbproject/
├── src/
│   └── paquet_alumne/
│       ├── E1.java
│       └── E2.java
└── test/
```

La sortida esperada és una carpeta amb només els fitxers Java necessaris per a la correcció:

```text
lliuraments-anonims/
├── alumne-01/
│   ├── E1.java
│   └── E2.java
├── alumne-02/
│   ├── Ex01.java
│   └── Ex02.java
└── ...
```

## Llenguatge triat

S'ha triat Python perquè permet tractar fitxers, carpetes, CSV i expressions regulars de manera clara i portable.

Alternatives considerades:

* Bash: més curt, però més fràgil amb espais, accents i casos especials en noms de fitxer.
* JavaScript: viable, però sense avantatge clar per a una tasca local de còpia i transformació de fitxers.

## Funcionament previst

El script rep com a argument obligatori la carpeta que conté els projectes originals dels alumnes.

Ús habitual:

```bash
python3 anonimitza_lliuraments.py carpeta_amb_lliuraments
```

Per defecte genera:

```text
lliuraments-anonims/
mapping-anonimitzacio.csv
```

Opcions disponibles:

```bash
python3 anonimitza_lliuraments.py carpeta_amb_lliuraments --desti sortida --mapping mapping.csv --force
```

## Decisions de disseny

El script fa una transformació mínima i conservadora:

* detecta projectes que tenen carpeta `src/`;
* busca tots els fitxers `*.java` dins `src/`, recursivament;
* ignora `build.xml`, `manifest.mf`, `nbproject/`, `test/`, `build/`, `dist/` i qualsevol altre fitxer que no sigui Java;
* crea identificadors anònims seqüencials: `alumne-01`, `alumne-02`, etc.;
* copia cada lliurament en una carpeta pròpia;
* genera un mapping privat perquè el professor pugui relacionar cada identificador anònim amb la carpeta original.

El mapping no s'ha de passar a l'agent.

## Anonimització aplicada

Per cada fitxer Java copiat, el script:

* substitueix el `package` original per un paquet anònim;
* afegeix un `package` anònim si el fitxer no en tenia;
* substitueix la línia `@author` per un autor anònim.

Exemple:

```java
package alumne_01;

/**
 * @author alumne-01
 */
```

S'utilitza `alumne_01` com a nom de paquet perquè Java no permet guions en identificadors de `package`. En canvi, la carpeta i l'autor poden usar el format `alumne-01`.

## Fitxer de mapping

El fitxer `mapping-anonimitzacio.csv` conté la correspondència privada:

```csv
anonymous_id,package_name,original_folder,files
alumne-01,alumne_01,NomOriginalAlumne,E1.java;E2.java
```

Aquest fitxer és només per al professorat i s'ha de mantenir fora del context que es lliura a l'agent.

## Limitacions acceptades

Per mantenir el script simple, no renombra classes ni fitxers Java.

Això vol dir que si un alumne escriu el seu nom real dins:

* el nom del fitxer;
* el nom de la classe;
* un comentari lliure;
* un literal de text;
* una variable o mètode;

el script no ho eliminarà automàticament.

En el flux docent previst, aquesta limitació és acceptable perquè es demanarà a l'alumnat que lliuri fitxers amb noms neutres i sense dades personals dins el codi.

## Verificació recomanada

Després d'executar el script, convé revisar una mostra de la carpeta anonimitzada abans de passar-la a l'agent:

* comprovar que només hi ha fitxers `.java`;
* comprovar que no hi ha `mapping.csv` dins la carpeta lliurada a l'agent;
* revisar que els `package` són `alumne_XX`;
* revisar que els `@author` són `alumne-XX`;
* buscar noms propis evidents en noms de fitxer, classes, comentaris o strings.

## Paper dins la sessió

Aquest script forma part de la preparació prèvia dels materials de correcció. No és l'objectiu central de la sessió, però permet treballar amb lliuraments reals de manera més segura i respectuosa amb la privacitat de l'alumnat.
