# Estructures de selecció en Java

Resum teòric per a CFGS DAM/DAW.  
Durada orientativa: 2 hores.  
RA relacionats: RA1 (reconeixement d'estructures del llenguatge) i RA3 (escriptura i depuració de codi amb estructures de control).

---

## 1. Introducció

Fins ara els teus programes s'executaven de forma **seqüencial**: línia a línia, de dalt a baix, sense desviacions.

Les **estructures de selecció** (o condicionals) permeten alterar aquest flux: el programa pren decisions basades en **condicions** i executa un bloc de codi o un altre segons si la condició és certa o falsa.

```
if (condició) {
    // codi si la condició és certa
} else {
    // codi si la condició és falsa
}
```

---

## 2. Operadors relacionals i lògics

Tota condició avalua una expressió **booleana** (`true` o `false`). Per construir-la necessitem operadors:

### Relacionals (comparem valors)

| Operador | Significat         |
|----------|--------------------|
| `==`     | igual a            |
| `!=`     | diferent de        |
| `<`      | menor que          |
| `>`      | major que          |
| `<=`     | menor o igual que  |
| `>=`     | major o igual que  |

```java
int edat = 18;
boolean potConduir = edat >= 18;   // true
```

### Lògics (combinen condicions)

| Operador | Nom     | Exemple                | Resultat                     |
|----------|---------|------------------------|------------------------------|
| `&&`     | AND     | `a > 0 && b > 0`       | cert només si ambdues certes |
| `\|\|`   | OR      | `a > 0 \|\| b > 0`     | cert si una o ambdues certes |
| `!`      | NOT     | `!(a > 0)`             | inverteix el valor booleà    |

```java
int edat = 18;
boolean teCarnet = true;

if (edat >= 18 && teCarnet) {
    System.out.println("Pot conduir legalment");
}
```

---

## 3. `if` simple

Executa un bloc **només si** la condició és certa.

```java
int temperatura = 30;

if (temperatura > 25) {
    System.out.println("Fa calor!");
}
```

Si `temperatura` fos 20, el missatge **no** s'executaria.

---

## 4. `if-else`

Executa un bloc si la condició és certa, i **un altre** si és falsa.

```java
int nota = 6;

if (nota >= 5) {
    System.out.println("Aprovat");
} else {
    System.out.println("Suspès");
}
```

---

## 5. `else if` encadenat

Quan hi ha **més de dues alternatives** que depenen de condicions diferents.

```java
int nota = 8;

if (nota >= 9) {
    System.out.println("Excel·lent");
} else if (nota >= 7) {
    System.out.println("Notable");
} else if (nota >= 5) {
    System.out.println("Suficient");
} else {
    System.out.println("Suspès");
}
```

L'ordre **importa**: Java avalua les condicions de dalt a baix i s'atura a la primera que siga certa.

---

## 6. `switch`

Permet seleccionar entre múltiples **valors fixos** d'una variable. Molt útil quan es compara la mateixa expressió amb moltes alternatives.

### Sintaxi clàssica

```java
int dia = 3;

switch (dia) {
    case 1:
        System.out.println("Dilluns");
        break;
    case 2:
        System.out.println("Dimarts");
        break;
    case 3:
        System.out.println("Dimecres");
        break;
    default:
        System.out.println("Dia no vàlid");
}
```

`break` evita el *fall-through* (que s'executin els casos següents). `default` captura qualsevol valor no contemplat.

### Arrow syntax (Java 14+)

Més neta: no cal `break`, no hi ha *fall-through*.

```java
String color = "verd";

switch (color) {
    case "vermell" -> System.out.println("Atura't");
    case "groc"    -> System.out.println("Precaució");
    case "verd"    -> System.out.println("Avança");
    default        -> System.out.println("Color desconegut");
}
```

### `switch` com a expressió (Java 14+)

Pot retornar un valor directament.

```java
int dia = 2;
String nom = switch (dia) {
    case 1 -> "Dilluns";
    case 2 -> "Dimarts";
    case 3 -> "Dimecres";
    default -> "Desconegut";
};
System.out.println(nom); // Dimarts
```

---

## 7. Errors habituals

### Confondre `=` amb `==`

`=` és assignació, `==` és comparació.

```java
// ERROR: if (edat = 18) — error de compilació
```

Java **no** accepta un `int` dins d'un `if` (a diferència de C/C++), així que aquest error el detecta el compilador.

### Oblidar `break` al `switch` clàssic

```java
switch (x) {
    case 1:
        System.out.println("Un");
        // falta break! s'executa també case 2
    case 2:
        System.out.println("Dos");
}
```

Això s'anomena **fall-through**. De vegades és intencionat, però sovint és un error.

### Comparar `String` amb `==`

`==` compara **referències** (adreces de memòria), no el contingut.

```java
String nom = "Joan";

if (nom == "Joan") { ... }   // Incorrecte!
if (nom.equals("Joan")) { ... } // Correcte
```

Excepció: si el `String` prové d'un literal, `==` pot funcionar per l'*String pool*, però mai confieu-hi.

### Condicions redundants o impossibles

```java
if (x > 5) { ... }
else if (x > 10) { ... }  // Mai s'executarà: si x > 10 ja hauria entrat al primer if
```

### Anidament excessiu

```java
// Difícil de llegir i depurar:
if (a > 0) {
    if (b > 0) {
        if (c > 0) {
            System.out.println("Tots positius");
        }
    }
}
```

---

## 8. Bones pràctiques

### Indentació consistent

El codi dins d'un bloc ha d'estar indentat (normalment 4 espais). Millora molt la llegibilitat.

### Condicions positives i clares

```java
if (persona.teEdadLegal()) { ... }          // Millor
if (!persona.esMenor()) { ... }             // Pitjor (doble negació mental)
```



### Usar `switch` per a múltiples valors fixos

Si compares la mateixa variable amb 3+ valors, `switch` és més llegible que una cascada d'`if-else`.

### Extreure condicions complexes a variables

```java
// Mal
if ((edat >= 18 && teCarnet) || (esConductorAcompanyat && edat >= 16)) {
    ...
}

// Millor
boolean potConduir = (edat >= 18 && teCarnet) ||
                     (esConductorAcompanyat && edat >= 16);
if (potConduir) { ... }
```

---

## 9. Comparació `if/else` vs `switch`

| Aspecte                  | `if/else`                          | `switch`                              |
|--------------------------|------------------------------------|---------------------------------------|
| Tipus de condició        | qualsevol expressió booleana       | valors concrets (int, String, enum...) |
| Rang o interval          | sí (`x > 10 && x < 20`)            | no (només igualtat exacta)            |
| Llegibilitat (pocs casos) | bona                               | bona                                  |
| Llegibilitat (molts casos)| empitjora                          | excel·lent                            |
| Fall-through             | no                                 | sí (clàssic); no (arrow syntax)       |
| Cal `break`              | no                                 | sí (clàssic); no (arrow syntax)       |
| Pot retornar valor       | no directament                     | sí (expressió switch, Java 14+)       |

### Quan usar cadascun?

- **`if/else`** — condicions amb intervals, comparacions lògiques combinades (`&&`, `||`), o quan només hi ha 1-2 alternatives.
- **`switch`** — una variable pren molts valors fixos (dies de la setmana, estats d'una màquina, tipus d'usuari...).

---

> **Resum**: les estructures de selecció són la base del control de flux. Un `if` ben escrit val més que cent `else if` mal girats. I un `switch` ben triat pot estalviar-te moltes línies de codi.
