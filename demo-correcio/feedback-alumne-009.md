## Correcció de alumne-09

Nota orientativa: **9,25 / 10**

Comentari general: Els dos exercicis estan ben resolts a nivell de lògica i càlculs. El que més penalitza és que el format de sortida no segueix exactament l'enunciat en alguns punts i hi ha petits detalls de qualitat/escriptura. No puc verificar des d'aquí si el `zip`, el `sha256sum` i el nom exacte del projecte compleixen els requisits generals.

---

**Exercici 1** `Posant preu a vols` - **4,75 / 5** - **Assolit**; calcula correctament el preu final, aplica bé el descompte Prèmium i l'extra de cada continent, i respecta la restricció de no fer servir `switch`. Com a detall a millorar, el text d'entrada/sortida no segueix exactament el model de l'enunciat i hi ha una errada tipogràfica a `tergeta`.

Observacions breus:
* estructura del programa correcta, amb `main`, `Scanner` i variables ben organitzades,
* càlculs correctes tant del continent com del descompte Prèmium,
* bona resolució amb `if / else if`, tal com demanava l'exercici,
* el format del menú i del missatge de la targeta no és exactament igual al de l'exemple.

**Exercici 2** `La balança del supermercat` - **4,50 / 5** - **Assolit**; llegeix correctament el pes i el producte, selecciona bé el preu per kg i calcula correctament el cost final amb dues decimals. La principal desviació és el format de sortida: es mostra `%.1fgr`, el nom del producte surt amb majúscula inicial i no coincideix exactament amb l'estil de l'enunciat.

Observacions breus:
* estructura correcta i càlcul de grams a kg ben fet,
* selecció del producte correcta amb `switch`,
* preus aplicats correctament segons el producte,
* bona decisió d'usar `printf` per controlar decimals,
* el comentari indica que s'ha decidit mostrar un decimal al pes, però això s'allunya del model demanat.

---

## Punts forts

* Els dos exercicis funcionen correctament a nivell de lògica.
* Els càlculs principals estan ben resolts.
* A l'exercici 1 es respecta correctament la restricció de no usar `switch`.
* El codi és entenedor en general i està prou ben estructurat.

## Errors detectats

* El format de sortida no segueix exactament l'enunciat en alguns textos i salts de línia.
* A l'exercici 1 hi ha l'errada tipogràfica `tergeta` en comptes de `targeta`.
* A l'exercici 2 es mostra el pes amb decimal (`200.0gr`) encara que l'exemple treballa amb grams enters.
* A l'exercici 2 el nom del producte surt amb majúscula inicial (`Ceba`, `Pinya`...) i no exactament com al model.
* No es pot comprovar amb la informació disponible si s'han complert els requisits del `sha256sum` i del nom del projecte.

## Recomanacions de millora

* Repassa sempre el text literal de l'enunciat i intenta copiar exactament el format de missatges i resultats.
* Evita afegir decisions pròpies de format si l'exercici demana seguir l'exemple com un contracte.
* Revisa ortografia de missatges i noms visibles per pantalla.
* Mantén coherència entre el que entra l'usuari i com ho mostres després, especialment en unitats com grams i en l'ús de majúscules/minúscules.

## Feedback final per a l'alumne

Has fet una bona feina: els dos exercicis estan correctament plantejats i els càlculs importants surten bé. La nota és alta perquè es veu que entens les condicionals i saps estructurar el programa. Per pujar encara més el nivell, cal cuidar els petits detalls de presentació i ajustar-te de manera més estricta al format exacte que demana l'enunciat.
