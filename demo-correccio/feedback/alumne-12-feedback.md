## Correcció de alumne-12

Nota final: **7,75 / 10**

Compleix les normes generals de lliurament:
Observació: en aquesta correcció anònima no es valoren ni el nom del projecte ni el `sha256sum`; sí que es pot observar la identificació als fitxers.

Comentari general: el lliurament resol la part principal dels exercicis, especialment l'exercici 1, però hi ha diferències clares de qualitat i de format a l'exercici 2. El nivell és correcte, però encara cal més precisió en la sortida i més claredat en el codi.

---

**Exercici 1** `Posant preu a vols` - **4,5 / 5** - **Assolit**; el càlcul del preu és correcte per als casos previstos i es respecta la restricció de no usar `switch`, però el codi és força repetitiu i poc net.
Observacions breus:
* el menú i la lectura de dades són funcionals;
* el descompte Prèmium i els extres per continent estan ben aplicats;
* la qualitat del codi baixa per repetició de blocs i noms de variables poc descriptius.

**Exercici 2** `La balança del supermercat` - **3,25 / 5** - **Parcialment assolit**; la idea general és correcta i hi ha conversió de grams a kg, però la sortida final mostra dades incorrectes i hi ha una petita imprecisió en una constant.
Observacions breus:
* l'entrada de grams i producte és correcta;
* la selecció del producte és gairebé correcta, però el preu de la pinya no coincideix exactament amb l'enunciat;
* el càlcul està ben encaminat, però la sortida falla perquè imprimeix el número de producte on hauria d'aparèixer el pes;
* aquest error de sortida afecta un criteri important del model d'execució.

---

## Recomanacions de millora

* Revisa sempre quina variable mostres per pantalla abans de donar per bo l'exercici.
* Millora els noms de variables perquè el codi sigui més entenedor.
* Evita repetir blocs semblants quan la lògica es pot simplificar.
* Comprova amb cura les constants numèriques de l'enunciat.

## Feedback final per a l'alumne

La base és bona, però per pujar nota necessites més precisió en la sortida i una estructura de codi més clara.
