# Rúbrica d'avaluació — Examen: Estructures de selecció en Java

## Relació amb Resultats d'Aprenentatge

| RA | Descripció | Punts |
|----|-----------|-------|
| **RA1** | Reconeix l'estructura d'un programa informàtic, identificant i relacionant els elements propis del llenguatge de programació utilitzat. | 3 |
| **RA3** | Escriu i depura codi, analitzant i utilitzant les estructures de control del llenguatge. | 7 |
| | **Total** | **10** |

---

## Exercici 1: Màquina expenedora — `switch` [5 punts]

### Taula de criteris

| # | Criteri | RA | Assoliment | Punts |
|---|---------|----|-----------|-------|
| 1 | Estructura del programa | RA1 | La classe, el mètode `main` i els imports (`Scanner`) són correctes. | 0.50 |
| 2 | Variables i lectura de dades | RA1 | Tipus adequats, noms descriptius; el `Scanner` llegeix correctament codi i quantitat. | 0.50 |
| 3 | Menú de productes | RA3 | Es mostra el menú complet amb codi, producte i preu exactament com a l'enunciat. | 0.50 |
| 4 | Ús del `switch` per al preu unitari | RA3 | El `switch` (clàssic amb `break` o arrow syntax) assigna correctament el preu a cada codi (1–5). | 1.50 |
| 5 | Càlcul del total i format | RA3 | `preu × quantitat` correcte; es mostra amb dos decimals (`printf` o `String.format`). | 1.00 |
| 6 | Validació de codi no disponible | RA3 | Per a codis fora de l'1–5 es mostra "Producte no disponible" (ús de `default`). | 0.50 |
| 7 | Qualitat i documentació | RA1/RA3 | Indentació coherent, noms de variables significatius, comentari amb el nom de l'alumne. | 0.50 |

### Qualificació fina

| # | Criteri | Punts màx. | 0% | 25% | 50% | 75% | 100% |
|---|---------|:-----------:|:--:|:---:|:---:|:---:|:----:|
| 1 | Estructura del programa | 0.50 | 0.00 | — | 0.25 | — | 0.50 |
| 2 | Variables i lectura | 0.50 | 0.00 | — | 0.25 | — | 0.50 |
| 3 | Menú de productes | 0.50 | 0.00 | — | 0.25 | — | 0.50 |
| 4 | Ús del `switch` | 1.50 | 0.00 | — | 0.50 | 1.00 | 1.50 |*
| 5 | Càlcul i format | 1.00 | 0.00 | 0.25 | 0.50 | 0.75 | 1.00 |
| 6 | Validació codi no disponible | 0.50 | 0.00 | — | 0.25 | — | 0.50 |
| 7 | Qualitat i documentació | 0.50 | 0.00 | — | 0.25 | — | 0.50 |

***Nivells d'assoliment per al criteri 4 (passos de 0.50):**
| Nivell | Descripció | Punts |
|--------|-----------|:-----:|
| No assolit | No usa `switch` o el codi no compila | 0.00 |
| Parcial | `switch` present però incomplet o amb errors en diversos casos | 0.50 |
| Assolit amb errors menors | `switch` correcte però falta algun `break`, `default`, o els casos no cobreixen tots els codis | 1.00 |
| Totalment assolit | `switch` ben estructurat, cobrint els 5 codis amb `break` i/o `default` adequats | 1.50 |

---

## Exercici 2: Càlcul d'impostos — `if-else if-else` [5 punts]

### Taula de criteris

| # | Criteri | RA | Assoliment | Punts |
|---|---------|----|-----------|-------|
| 1 | Estructura del programa | RA1 | La classe, el mètode `main` i els imports són correctes. | 0.50 |
| 2 | Variables i lectura de dades | RA1 | Variables amb tipus adequat i noms descriptius; es llegeix un `double` per ingressos i un `char`/`String` per a autònom. | 0.50 |
| 3 | Estructura `if-else if-else` encadenat | RA3 | La cadena `if-else if-else` cobreix tots els trams d'ingressos sense redundàncies ni condicions impossibles. | 2.00 |
| 4 | Càlcul de l'impost segons situació | RA3 | Percentatge correcte segons tram i situació (autònom/general); es mostra amb dos decimals. | 1.00 |
| 5 | Validació d'ingressos negatius | RA3 | Si els ingressos són negatius es mostra "Ingressos no vàlids". | 0.50 |
| 6 | Qualitat i documentació | RA1/RA3 | Indentació coherent, noms de variables significatius, comentari amb el nom de l'alumne. | 0.50 |

### Qualificació fina

| # | Criteri | Punts màx. | 0% | 25% | 50% | 75% | 100% |
|---|---------|:-----------:|:--:|:---:|:---:|:---:|:----:|
| 1 | Estructura del programa | 0.50 | 0.00 | — | 0.25 | — | 0.50 |
| 2 | Variables i lectura | 0.50 | 0.00 | — | 0.25 | — | 0.50 |
| 3 | `if-else if-else` encadenat | 2.00 | 0.00 | 0.50 | 1.00 | 1.50 | 2.00 |
| 4 | Càlcul de l'impost | 1.00 | 0.00 | 0.25 | 0.50 | 0.75 | 1.00 |
| 5 | Validació ingressos negatius | 0.50 | 0.00 | — | 0.25 | — | 0.50 |
| 6 | Qualitat i documentació | 0.50 | 0.00 | — | 0.25 | — | 0.50 |

**Nivells d'assoliment per al criteri 3 (passos de 0.50):**
| Nivell | Descripció | Punts |
|--------|-----------|:-----:|
| No assolit | No usa `if-else` o l'estructura no cobreix cap tram | 0.00 |
| Parcial | Cobreix alguns trams però en falten o les condicions són incorrectes | 0.50 |
| Assolit amb mancances | Tots els trams presents però l'ordre o les condicions tenen errors | 1.00 |
| Assolit amb errors menors | Estructura correcta amb errors menors (ex.: límit d'un tram mal posat) | 1.50 |
| Totalment assolit | Cobreix tots els trams, condicions correctes i ben ordenades, sense redundàncies | 2.00 |

---

## Resum de puntuació

| Exercici | RA1 | RA3 | Total |
|----------|:---:|:---:|:-----:|
| 1. Màquina expenedora | 1.50 | 3.50 | 5.00 |
| 2. Càlcul d'impostos | 1.50 | 3.50 | 5.00 |
| **Total** | **3.00** | **7.00** | **10.00** |

## Notes d'aplicació

- Cada criteri s'avalua de forma independent segons la graella de qualificació fina.
- La nota final de cada exercici és la suma dels punts obtinguts en tots els seus criteris.
- No hi ha arrodoniment automàtic: la nota final reflecteix la suma exacta.
- Per aprovar l'examen cal una nota global ≥ 5.00 sobre 10.00.
