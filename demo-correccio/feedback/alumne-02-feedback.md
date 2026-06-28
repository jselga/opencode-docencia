## Correcció de alumne-02

Nota final: **1,75 / 10**

Compleix les normes generals de lliurament:
Observació: en aquesta correcció anònima no es valoren ni el nom del projecte ni el `sha256sum`; sí que es pot comprovar la identificació al fitxer lliurat.

Comentari general: el lliurament mostra intenció de resoldre l'exercici 1, però la lògica no arriba a funcionar correctament i falta tot l'exercici 2. Cal reforçar sobretot el tractament de condicions i la comprovació real dels casos d'entrada.

---

**Exercici 1** `Posant preu a vols` - **1,75 / 5** - **No assolit**; hi ha una estructura inicial i es planteja el menú, però la lògica no resol correctament el problema i, a més, incompleix una restricció de l'enunciat.
Observacions breus:
* hi ha classe, `main`, `Scanner` i menú bàsic;
* compara cadenes amb `==`, de manera que la detecció de `s/n` no funciona;
* fa servir `switch` tot i que l'enunciat el prohibeix;
* es guarden resultats en una variable i se n'imprimeix una altra, de manera que molts casos acaben malament.

**Exercici 2** `La balança del supermercat` - **0 / 5** - **No assolit**; no s'ha lliurat codi identificable de l'exercici 2 i, per tant, no es pot considerar resolt.
Observacions breus:
* no s'ha detectat cap fitxer separat per a aquest exercici;
* no es pot verificar ni la lectura de grams, ni la selecció del producte, ni el càlcul final.

---

## Recomanacions de millora

* Compara textos amb `.equals()` en lloc de `==`.
* Revisa quina variable imprimeixes al final i comprova casos reals com `5` i `s`.
* Respecta sempre les restriccions de l'enunciat; aquí no es podia usar `switch`.
* Entrega els dos exercicis encara que un quedi incomplet.

## Feedback final per a l'alumne

Cal consolidar la base de condicionals en Java i completar els exercicis per poder pujar nota.
