## Correcció de alumne-12

Nota final: **7,75 / 10**

Compleix les normes generals de lliurament:
Observació: en aquesta correcció anònima no es valoren ni el nom del projecte ni el `sha256sum`; sí que es pot comprovar la identificació als fitxers.

Comentari general: el lliurament resol bé la part principal dels exercicis, sobretot l'exercici 1, però l'exercici 2 perd punts per un error important de sortida i per menys precisió en el codi. El nivell és correcte, però encara cal més cura en què s'imprimeix exactament.

---

**Exercici 1** `Posant preu a vols` - **4,5 / 5** - **Assolit**; el menú i la lògica del preu funcionen correctament, però la qualitat del codi es podria polir més.
Observacions breus:
* el menú i la lectura de dades funcionen;
* el descompte Prèmium i els extres per continent estan ben aplicats;
* es compleix la restricció de no usar `switch`;
* la qualitat baixa per repetició de blocs i per una sortida menys ajustada al model.

**Exercici 2** `La balança del supermercat` - **3,25 / 5** - **Parcialment assolit**; la idea general és correcta, però hi ha una constant imprecisa i un error clar en la sortida final.
Observacions breus:
* llegeix grams i producte correctament i fa la conversió a kg;
* la selecció del preu és gairebé correcta, però la constant de la pinya no coincideix exactament amb l'enunciat;
* la sortida final és incorrecta perquè imprimeix el número de producte com si fos el pes;
* els noms de variables i el format general del codi són poc clars.

---

## Recomanacions de millora

* Revisa sempre que la variable mostrada per pantalla sigui la correcta.
* Comprova amb cura les constants numèriques de l'enunciat.
* Utilitza noms de variables més descriptius.
* Evita repetir blocs semblants quan la lògica es pot simplificar.

## Feedback final per a l'alumne

La base és bona, però per pujar nota necessites més precisió en la sortida i més netedat en el codi.
