## Correcció de alumne-06

Nota final: **5,25 / 10**

Compleix les normes generals de lliurament:
Observació: en aquesta correcció anònima no es valoren ni el nom del projecte ni el `sha256sum`; sí que es pot comprovar la identificació als fitxers.

Comentari general: hi ha una base funcional millor a l'exercici 2 que a l'exercici 1, però encara tens errors de lògica importants en comparació de cadenes i en el càlcul del pes. El següent pas és revisar bé com funciona cada operació abans de donar el programa per bo.

---

**Exercici 1** `Posant preu a vols` - **2,25 / 5** - **No assolit**; el menú i la lectura de dades estan ben plantejats, però la lògica principal falla en punts clau.
Observacions breus:
* la lectura de continent i targeta està ben plantejada;
* compara cadenes amb `==`, i això fa que les condicions no funcionin com toca en Java;
* als casos amb `n` també restes 50 Geo, així que el descompte Prèmium queda mal aplicat;
* es respecta la restricció de no usar `switch`.

**Exercici 2** `La balança del supermercat` - **3 / 5** - **Parcialment assolit**; l'entrada i la selecció del producte estan ben encaminades, però el càlcul del cost és incorrecte.
Observacions breus:
* l'entrada de grams i producte és correcta;
* la selecció del preu per producte està ben plantejada;
* el càlcul fa servir `preu / 10` en comptes de convertir `grams / 1000`;
* la sortida té dues decimals, però els noms de variables i el format es podrien millorar.

---

## Recomanacions de millora

* En Java compara textos amb `.equals(...)` i no amb `==`.
* Separa el càlcul del descompte i el de l'extra del continent per comprovar-los millor.
* A l'exercici 2 converteix primer grams a kg i després multiplica pel preu/kg.
* Millora els noms de variables perquè el codi sigui més fàcil de seguir.

## Feedback final per a l'alumne

Tens part de la idea ben orientada, però necessites més precisió en la lògica perquè el resultat sigui correcte.
