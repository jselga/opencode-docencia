## Correcció de alumne-07

Nota final: **8,25 / 10**

Compleix les normes generals de lliurament:
Observació: en aquesta correcció anònima no es valoren ni el nom del projecte ni el `sha256sum`; sí que es pot comprovar la identificació als fitxers.

Comentari general: el lliurament està ben resolt a l'exercici 1 i mostra una bona base general, però l'exercici 2 queda afectat per un error important de càlcul i per una sortida poc precisa. Amb una mica més d'atenció als tipus numèrics i al text final, la nota pujaria clarament.

---

**Exercici 1** `Posant preu a vols` - **4,75 / 5** - **Assolit**; el càlcul del vol és correcte i es respecta la restricció de no usar `switch`, però el format de sortida no segueix exactament el model.
Observacions breus:
* calcula correctament el preu base, el descompte Prèmium i els extres;
* la lògica per als casos 1-5 és correcta;
* el que baixa una mica la nota és sobretot el format de sortida;
* l'ús de dos `Scanner` és innecessari.

**Exercici 2** `La balança del supermercat` - **3,5 / 5** - **Parcialment assolit**; la selecció del producte està ben resolta, però el càlcul del cost falla per una divisió entera i la sortida no reflecteix bé el producte triat.
Observacions breus:
* la selecció del preu per producte és correcta;
* `(grams/1000)` amb enters dona 0 per pesos menors de 1000 g;
* a tots els casos imprimeix `tomàquet` encara que el producte sigui un altre;
* manté dues decimals, però el format final no segueix bé el model.

---

## Recomanacions de millora

* A l'exercici 2 força la divisió decimal amb `1000.0` o bé guarda els grams en `double`.
* Revisa que el nom del producte mostrat coincideixi amb l'opció triada.
* Ajusta el text final per apropar-lo més al model de l'enunciat.
* Evita crear més d'un `Scanner` sobre la mateixa entrada si no cal.

## Feedback final per a l'alumne

És un bon lliurament, però cal afinar el càlcul i la sortida perquè sigui del tot correcte.
