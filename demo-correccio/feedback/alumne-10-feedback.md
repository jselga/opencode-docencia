## Correcció de alumne-10

Nota final: **2,25 / 10**

Compleix les normes generals de lliurament:
Observació: en aquesta correcció anònima no es valoren ni el nom del projecte ni el `sha256sum`; sí que es pot comprovar la identificació als fitxers.

Comentari general: el lliurament sembla més una maqueta de sortida que no pas la resolució dels exercicis. Cal passar de textos fixos a un programa que llegeixi dades i calculi el resultat segons el cas.

---

**Exercici 1** `Posant preu a vols` - **1,25 / 5** - **No assolit**; el fitxer compila i mostra el menú, però no hi ha resolució real del problema.
Observacions breus:
* crea un `Scanner`, però no llegeix cap dada real de l'usuari;
* la sortida està totalment fixada a un únic exemple;
* no hi ha condicionals ni càlcul del preu;
* no usa `switch`, però això no resol l'exercici.

**Exercici 2** `La balança del supermercat` - **1 / 5** - **No assolit**; el programa mostra un cas d'exemple, però no és una solució funcional.
Observacions breus:
* compila i mostra el menú de productes;
* no llegeix grams ni opció de producte;
* no hi ha selecció del preu per kg ni càlcul a partir dels grams introduïts;
* la línia final s'assembla al model, però no surt d'un programa funcional.

---

## Recomanacions de millora

* Fes servir realment el `Scanner` per llegir les opcions i no escriguis les respostes dins dels `println`.
* Implementa condicionals perquè el programa respongui a diferents entrades.
* Calcula els resultats amb variables en lloc d'imprimir directament l'exemple.
* Comprova els teus programes amb almenys dos casos diferents abans d'entregar.

## Feedback final per a l'alumne

El següent pas és convertir aquests exemples impresos en programes reals que reaccionin a l'entrada de l'usuari.
