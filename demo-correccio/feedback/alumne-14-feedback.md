## Correcció de alumne-14

Nota final: **9,25 / 10**

Compleix les normes generals de lliurament:
Observació: en aquesta correcció anònima no es valoren ni el nom del projecte ni el `sha256sum`; sí que es pot comprovar la identificació als fitxers.

Comentari general: el lliurament resol bé la part funcional dels dos exercicis. Per pujar qualitat, cal cuidar més el tractament d'entrades invàlides i el format exacte de la sortida.

---

**Exercici 1** `Posant preu a vols` - **4,75 / 5** - **Assolit**; el càlcul dels casos vàlids està ben resolt i es respecta la restricció de l'enunciat, però no es tracta prou bé una opció invàlida.
Observacions breus:
* el menú i el càlcul dels cinc continents vàlids estan ben resolts;
* aplica correctament el descompte si la resposta és `s`;
* compleix la restricció de no usar `switch`;
* si el continent és invàlid, el programa igualment continua i acaba mostrant un preu.

**Exercici 2** `La balança del supermercat` - **4,5 / 5** - **Assolit**; demana correctament les dades i calcula bé el cost, però falta ajustar l'arrodoniment i simplificar el codi.
Observacions breus:
* demana pes i producte i selecciona bé el preu de cada opció;
* el càlcul és correcte perquè equival a passar grams a kg;
* la sortida no arrodoneix a dues decimals com demana l'enunciat;
* el codi repeteix molt la mateixa estructura en cada cas.

---

## Recomanacions de millora

* Formata els preus amb `%.2f` per complir l'arrodoniment a centèsimes.
* Evita continuar el càlcul quan l'opció introduïda no és vàlida.
* Simplifica l'exercici 2 guardant només un preu i un nom de producte en lloc de moltes variables.

## Feedback final per a l'alumne

Bona resolució general, amb marge clar de millora en el format i els casos invàlids.
