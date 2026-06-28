## Correcció de alumne-04

Nota final: **9,25 / 10**

Compleix les normes generals de lliurament:
Observació: en aquesta correcció anònima no es valoren ni el nom del projecte ni el `sha256sum`; sí que es pot comprovar la identificació als fitxers.

Comentari general: el lliurament està ben resolt i l'exercici 2 és completament funcional. La principal incidència és un error d'estructura condicional a l'exercici 1 que afecta la sortida final.

---

**Exercici 1** `Posant preu a vols` - **4,25 / 5** - **Parcialment assolit**; la lògica del descompte i dels extres és correcta, però hi ha un error de control de flux que fa aparèixer un missatge incorrecte en casos vàlids.
Observacions breus:
* demana la targeta amb `s/n` i resol sense `switch`;
* la lògica del preu final per continent està ben resolta;
* l'`else` final queda associat només a `if (continent == 5)`;
* en continents vàlids com 1, 2, 3 o 4 també imprimeix `No has seleccionat cap continent`.

**Exercici 2** `La balança del supermercat` - **5 / 5** - **Assolit**; és un exercici completament funcional i ajustat al que es demanava.
Observacions breus:
* llegeix correctament el pes i el producte;
* selecciona bé el preu per kg;
* el càlcul del cost i l'arrodoniment a dues decimals són correctes;
* la sortida és coherent amb el model i mostra pes, producte i preu.

---

## Recomanacions de millora

* Revisa l'associació dels `else` amb els `if` per evitar missatges contradictoris.
* Evita repetir tant codi a l'exercici 1 perquè així és més fàcil detectar errors lògics.
* Prova com a mínim un cas per cada continent abans d'entregar.

## Feedback final per a l'alumne

Molt bon nivell general; corregint aquest detall de control de flux el lliurament quedaria molt sòlid.
