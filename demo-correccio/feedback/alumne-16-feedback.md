## Correcció de alumne-16

Nota final: **8,25 / 10**

Compleix les normes generals de lliurament:
Observació: en aquesta correcció anònima no es valoren ni el nom del projecte ni el `sha256sum`; sí que es pot comprovar la identificació als fitxers.

Comentari general: l'exercici 2 està molt ben resolt, però l'exercici 1 té errors importants en la lògica de continents que fan baixar la nota. Cal revisar millor els valors literals abans d'entregar.

---

**Exercici 1** `Posant preu a vols` - **3,25 / 5** - **Parcialment assolit**; l'estructura i la lectura són correctes, però dos continents no queden ben resolts.
Observacions breus:
* l'estructura, la lectura de dades i la restricció de no usar `switch` són correctes;
* Àfrica, Àsia i Oceania queden ben calculades;
* Amèrica està codificada amb 70 Geo en lloc de 50;
* Europa no té cas propi i acaba entrant a l'`else` d'error.

**Exercici 2** `La balança del supermercat` - **5 / 5** - **Assolit**; és un exercici ben resolt i ajustat al model de l'enunciat.
Observacions breus:
* demana correctament grams i producte;
* selecciona bé el preu per kg de les cinc opcions;
* converteix bé grams a kg i calcula correctament el cost;
* la sortida final segueix bé el model amb dues decimals.

---

## Recomanacions de millora

* Comprova cas per cas que tots els valors de l'enunciat s'han traslladat bé al codi.
* Afegeix un cas específic per a Europa a l'exercici 1.
* Si detectes una opció invàlida, evita continuar fins a imprimir un preu final.

## Feedback final per a l'alumne

Tens una bona resolució a l'exercici 2; revisant millor els casos de l'1, la nota pujaria força.
