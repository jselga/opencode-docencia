# Feedback — Chuck Borris

**Nota global: 7.00 / 10.00**

---

## Ex1: Màquina expenedora — 3.25/5.00

### Errors a corregir

| On | Què passa | Com arreglar-ho |
|----|-----------|-----------------|
| `switch` cas 2 (línia 24) | Falta `break`: si tries Refresc (codi 2), el programa continua al cas 3 i et dona Café (1.80€) en lloc de 2.50€. | Afegeix `break;` al final del `case 2`. |
| Condició línia 17 | `codi > 0 && codi < 5` exclou el codi 5 (Barreta mai funcionarà). | Canvia a `codi >= 1 && codi <= 5`. |
| Validació (línies 17-35) | La rúbrica demana usar `default` dins el `switch` per al missatge d'error, no un `if-else` fora. | Mou la validació dins el `switch` amb `default: System.out.println("Producte no disponible");`. |
| Format del total (línia 32) | Mostra "3.6" en lloc de "3.60". | Usa `System.out.printf("Total: %.2f€%n", total);` |

### Consell
Prova el programa amb **codi=2, quantitat=1** i **codi=5, quantitat=1**. Veuràs els dos errors.

---

## Ex2: Càlcul d'impostos — 3.75/5.00

### Errors a corregir

| On | Què passa | Com arreglar-ho |
|----|-----------|-----------------|
| Línia 17 | `res == "s"` compara referències, no el contingut. A Java les strings es comparen amb `.equals()`. | Canvia a `res.equals("s")` o `res.equalsIgnoreCase("s")`. |
| Format (línia 33) | Mostra "5250.0" en lloc de "5250.00". | Usa `System.out.printf("Impost: %.2f euros%n", impost);` |

### Consell
Prova amb **ingressos=35000, autònom=s** i comprova si `autonom` es posa a `true`.

---

## Millores generals

| Aspecte | Per què millorar-ho | Exemple |
|---------|--------------------|---------|
| Noms de variables | `pr`, `in`, `p`, `res` no expliquen què guarden. El codi s'ha de llegir com una frase. | `preu` en lloc de `pr`, `ingressos` en lloc de `in`, `percentatge` en lloc de `p` |
| Provar abans de lliurar | Tots els errors d'Ex1 i Ex2 es veuen executant el programa 2 minuts. | Prova sempre codi=1,2,3,4,5,6 per veure que tot funciona. |

---

**Punts forts:**
- Estructura de classes i imports correcta
- Ús correcte de `Scanner`
- Lògica general dels trams d'impostos ben plantejada
- Comentari identificatiu present
