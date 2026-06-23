# Exercicis: Estructures de selecció en Java

CFGS DAM/DAW  
RA1 — Reconeix l'estructura d'un programa informàtic.  
RA3 — Escriu i depura codi, analitzant i utilitzant les estructures de control.

No s'inclou la solució.  
Cada exercici indica els conceptes que posa en pràctica i el nivell.

---

## Inicial

### 1. Nombre positiu o negatiu

**Conceptes:** `if`, operadors relacionals (`>`), `Scanner`.

Llegeix un nombre enter per teclat i mostra si és positiu, negatiu o zero.

**Exemple d'execució:**
```
Introdueix un nombre: -3
El nombre és negatiu.
```

---

### 2. Major d'edat

**Conceptes:** `if-else`, operador relacional (`>=`).

Llegeix l'edat d'una persona i mostra si és major d'edat (18 o més) o menor.

**Exemple d'execució:**
```
Quina edat tens? 17
Ets menor d'edat.
```

---

### 3. El més gran de dos nombres

**Conceptes:** `if-else if-else`, operadors relacionals.

Llegeix dos nombres enters i mostra quin és el més gran, o si són iguals.

**Exemple d'execució:**
```
nombre 1: 7
nombre 2: 7
Els dos nombres són iguals.
```

---

### 4. Any de traspàs

**Conceptes:** `if-else`, operadors lògics (`&&`, `||`, `!`), operador mòdul (`%`).

Llegeix un any i determina si és de traspàs.

Un any és de traspàs si és divisible per 4 **i** no per 100, **o** si és divisible per 400.

**Exemple d'execució:**
```
Any: 2024
2024 és un any de traspàs.
```

---

## Intermedi

### 5. Qualificació amb lletra

**Conceptes:** `else if` encadenat.

Llegeix una nota numèrica entre 0 i 10 i mostra la qualificació segons:

| Nota      | Qualificació |
|-----------|-------------|
| 0 - 4.9   | Insuficient |
| 5 - 6.9   | Suficient   |
| 7 - 8.9   | Notable     |
| 9 - 10    | Excel·lent  |

Si la nota no està entre 0 i 10, mostra "Nota no vàlida".

**Exemple d'execució:**
```
Nota: 7.5
Notable.
```

---

### 6. Nom del mes

**Conceptes:** `switch` clàssic, `break`, `default`.

Llegeix un nombre de mes (1-12) i mostra el nom del mes corresponent. Si el nombre no està entre 1 i 12, mostra "Mes no vàlid".

**Exemple d'execució:**
```
Mes (1-12): 4
Abril.
```

---

### 7. Calculadora d'operacions

**Conceptes:** `switch` amb arrow syntax, `default`.

Llegeix un caràcter (`+`, `-`, `*`, `/`) i mostra el nom de l'operació. Si el caràcter no és cap dels quatre, mostra "Operació no vàlida".

**Exemple d'execució:**
```
Operació: /
Divisió.
```

---

### 8. Classificació de triangles

**Conceptes:** `if-else` combinat amb operadors lògics, condicions múltiples.

Llegeix tres nombres enters que representen les longituds dels costats d'un triangle.

Primer comprova si formen un triangle vàlid (cada costat ha de ser menor que la suma dels altres dos). Si no, mostra "No és un triangle vàlid".

Si és vàlid, classifica'l en:
- **Equilàter:** els tres costats iguals.
- **Isòsceles:** dos costats iguals i un de diferent.
- **Escalè:** els tres costats diferents.

**Exemple d'execució:**
```
Costat 1: 5
Costat 2: 5
Costat 3: 8
Triangle isòsceles.
```

---

## Avançat

### 9. Preu amb descompte (switch expressió)

**Conceptes:** `switch` com a expressió (Java 14+), variables, operadors aritmètics.

Llegeix un codi de producte (A, B, C o D) i la quantitat d'unitats.

Usa `switch` com a expressió per assignar el preu base per unitat:

| Codi | Preu base |
|------|-----------|
| A    | 10 €      |
| B    | 20 €      |
| C    | 30 €      |
| D    | 40 €      |

Si la quantitat és major que 10, aplica un 10% de descompte al total.

Si el codi no és vàlid, mostra "Codi de producte no vàlid".

**Exemple d'execució:**
```
Codi de producte: C
Quantitat: 15
Preu total: 405.0 € (amb 10% de descompte)
```

---

### 10. Validació de data completa

**Conceptes:** `if-else` encadenat, operadors lògics, anàlisi de casos, any de traspàs.

Llegeix un any, un mes (1-12) i un dia (1-31). Determina si la data és vàlida i mostra un missatge específic segons el cas.

Casos a considerar:
- L'any ha de ser positiu.
- El mes ha d'estar entre 1 i 12.
- El dia ha de ser vàlid per al mes corresponent:
  - Mesos amb 31 dies: gener (1), març (3), maig (5), juliol (7), agost (8), octubre (10), desembre (12).
  - Mesos amb 30 dies: abril (4), juny (6), setembre (9), novembre (11).
  - Febrer (2): 28 dies normalment, 29 si l'any és de traspàs.

Fes servir `if-else` encadenats amb una profunditat màxima de dos nivells.

**Exemples d'execució:**
```
Any: 2023
Mes: 2
Dia: 29
Data no vàlida: el febrer de 2023 només té 28 dies.
```

```
Any: 2024
Mes: 2
Dia: 29
Data vàlida: 29/2/2024.
```

```
Any: 2025
Mes: 13
Dia: 1
Data no vàlida: el mes ha d'estar entre 1 i 12.
```
