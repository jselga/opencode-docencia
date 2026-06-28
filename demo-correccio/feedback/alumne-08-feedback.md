## Correcció de alumne-08

Nota final: **9 / 10**

Compleix les normes generals de lliurament:
Observació: en aquesta correcció anònima no es valoren ni el nom del projecte ni el `sha256sum`; sí que es pot comprovar la identificació als fitxers.

Comentari general: és un lliurament funcional i ben resolt en la part de càlculs als dos exercicis. El principal marge de millora és ajustar més el format de sortida al contracte de l'enunciat.

---

**Exercici 1** `Posant preu a vols` - **4,5 / 5** - **Assolit**; la lectura de dades i la lògica del preu final estan ben resoltes, però la sortida no segueix exactament el model.
Observacions breus:
* aplica bé el descompte Prèmium i els extres de cada continent;
* compleix la restricció de no fer servir `switch`;
* la penalització és sobretot de format;
* falta mostrar `Geo` a la sortida final.

**Exercici 2** `La balança del supermercat` - **4,5 / 5** - **Assolit**; el càlcul del cost és correcte, però la presentació final es podria ajustar millor al model demanat.
Observacions breus:
* llegeix correctament el pes i el producte;
* selecciona bé el preu per kg i calcula correctament el cost amb `grams / 1000`;
* la sortida mostra dues decimals;
* el text final no segueix prou el model en `gr`, `€`, nom del producte i presentació del pes.

---

## Recomanacions de millora

* Afegeix sempre les unitats finals que demana l'enunciat, com `Geo`, `gr` i `€`.
* Revisa el text exacte de la sortida abans d'entregar.
* Mantén noms de producte i missatges el més fidels possible al model.

## Feedback final per a l'alumne

La resolució és bona i només et falta afinar el format per arrodonir del tot el lliurament.
