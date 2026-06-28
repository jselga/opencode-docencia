## Correcció de alumne-01

Nota final: **8,5 / 10**

Compleix les normes generals de lliurament:
Observació: en aquesta correcció anònima no es valoren ni el nom del projecte ni el `sha256sum`; sí que es pot comprovar la identificació als fitxers.

Comentari general: el lliurament resol bé la lògica principal dels dos exercicis, especialment els càlculs. La millora prioritària és ajustar millor l'entrada i la sortida al contracte exacte de l'enunciat.

---

**Exercici 1** `Posant preu a vols` - **3,75 / 5** - **Parcialment assolit**; la lògica del preu i dels continents està ben encaminada, però l'entrada de la targeta no segueix el model demanat i això afecta el funcionament real.
Observacions breus:
* l'estructura base del programa és correcta;
* calcula bé l'extra segons el continent i resol sense `switch`;
* la targeta Prèmium es demana amb `1/2` en lloc de `s/n`;
* si l'usuari escriu `s` o `n` tal com marca l'enunciat, el programa falla.

**Exercici 2** `La balança del supermercat` - **4,75 / 5** - **Assolit**; el càlcul del cost és correcte, però la sortida final és massa mínima i no segueix el model complet de l'enunciat.
Observacions breus:
* llegeix correctament pes i producte;
* selecciona bé el preu segons l'opció;
* el càlcul del cost final és correcte perquè converteix grams a kg;
* només mostra el preu final i no indica ni els grams ni el nom del producte.

---

## Recomanacions de millora

* Fes servir exactament el tipus d'entrada que demana l'enunciat, com ara `s/n` a l'exercici 1.
* Prova sempre els programes amb els exemples d'execució abans d'entregar-los.
* A l'exercici 2 mostra també el pes i el nom del producte a la frase final.

## Feedback final per a l'alumne

Bona base de càlcul; ara et falta més precisió en el contracte d'entrada i sortida.
