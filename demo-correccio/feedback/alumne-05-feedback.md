## Correcció de alumne-05

Nota final: **1,75 / 10**

Compleix les normes generals de lliurament:
Observació: en aquesta correcció anònima no es valoren ni el nom del projecte ni el `sha256sum`; sí que es pot comprovar la identificació als fitxers.

Comentari general: el lliurament mostra intenció de començar els dos exercicis, però els errors de sintaxi i de construcció impedeixen considerar-los funcionals. La prioritat és reforçar la base de Java perquè el codi arribi a compilar i executar-se.

---

**Exercici 1** `Posant preu a vols` - **0,75 / 5** - **No assolit**; hi ha classe, `main`, `Scanner` i menú inicial, però la implementació no arriba a ser funcional.
Observacions breus:
* la condició `if (targetapremium) = true;` és sintàcticament incorrecta;
* la targeta Prèmium no es llegeix ni es tracta correctament;
* no s'arriba a calcular ni mostrar el preu final del vol;
* no es fa servir `switch`, però això no compensa la manca de resolució funcional.

**Exercici 2** `La balança del supermercat` - **1 / 5** - **No assolit**; es demanen les dades inicials i es defineixen els preus, però la selecció del producte, el càlcul i la sortida tenen errors de sintaxi importants.
Observacions breus:
* la lectura inicial de pes i producte està plantejada;
* les condicions `if sc.nextInt("1");` no són sintaxi vàlida en Java;
* no es fa la conversió de grams a kg per calcular el cost;
* les línies de sortida també tenen errors de construcció.

---

## Recomanacions de millora

* Repassa la sintaxi bàsica de `if`, comparacions i `System.out.println`.
* Treballa cada exercici en tres fases clares: entrada, càlcul i sortida.
* Comprova sempre la compilació abans d'entregar.
* Practica conversions bàsiques com passar de grams a kg.

## Feedback final per a l'alumne

Cal consolidar els fonaments de Java perquè els teus plantejaments puguin arribar a ser funcionals.
