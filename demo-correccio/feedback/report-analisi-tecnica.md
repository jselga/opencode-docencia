# Informe tècnic de desviació entre correcció automàtica i manual

## Objectiu

Aquest informe analitza la diferència entre la qualificació automàtica generada a partir dels feedbacks i la qualificació manual recollida a `feedback/analsis.csv`.

L'objectiu no és recalcular totes les notes, sinó identificar patrons de desviació i proposar ajustos tècnics per millorar la calibració de futures correccions automàtiques.

## Dades de partida

La desviació es calcula com:

`desviació = nota_automàtica - nota_manual`

Per tant:

* una desviació negativa indica que la correcció automàtica ha puntuat més baix que la manual;
* una desviació positiva indica que la correcció automàtica ha puntuat més alt que la manual.

## Resum quantitatiu

| Indicador | Valor |
|---|---:|
| Nombre de lliuraments analitzats | 17 |
| Desviació mitjana signada | -0,044 |
| Error absolut mitjà | 0,632 |
| Casos amb desviació forta `\|des\| >= 1` | 4 |
| Casos amb infraavaluació forta | 3 |
| Casos amb sobreavaluació forta | 1 |

La mitjana signada és pràcticament nul·la. Això indica que no hi ha un biaix global fort cap a notes més altes o més baixes. El problema principal és de calibratge en casos concrets.

## Taula comparativa per alumne

| Alumne | Auto | Manual | Desviació | Magnitud | Diagnòstic curt |
|---|---:|---:|---:|---:|---|
| alumne_01 | 8,5 | 8,5 | 0 | 0 | Coincidència exacta. |
| alumne_02 | 1,75 | 4 | -2,25 | Forta | Infraavaluació: s'ha penalitzat massa la no funcionalitat i la manca d'exercici 2 separat. |
| alumne_03 | 9,5 | 9 | 0,5 | Lleu | Sobreavaluació menor: format i ajust al model probablement s'han penalitzat poc. |
| alumne_04 | 9,25 | 8 | 1,25 | Forta | Sobreavaluació: error de flux amb `else` associat incorrectament. |
| alumne_05 | 1,75 | 3 | -1,25 | Forta | Infraavaluació: codi no funcional, però amb estructura i plantejament parcial visibles. |
| alumne_06 | 5,25 | 5 | 0,25 | Lleu | Diferència acceptable. |
| alumne_07 | 8,25 | 8 | 0,25 | Lleu | Diferència acceptable. |
| alumne_08 | 9 | 8,5 | 0,5 | Lleu | Sobreavaluació menor per format de sortida. |
| alumne_09 | 2 | 3,5 | -1,5 | Forta | Infraavaluació: errors de compilació, però hi ha inici d'estructura i lògica parcial. |
| alumne_10 | 2,25 | 2 | 0,25 | Lleu | Diferència acceptable. |
| alumne_11 | 9,75 | 9,5 | 0,25 | Lleu | Diferència acceptable. |
| alumne_12 | 7,75 | 7,5 | 0,25 | Lleu | Diferència acceptable. |
| alumne_13 | 9,75 | 10 | -0,25 | Lleu | Diferència acceptable. |
| alumne_14 | 9,25 | 8,75 | 0,5 | Lleu | Sobreavaluació menor per format i validació d'entrades. |
| alumne_15 | 9 | 8,75 | 0,25 | Lleu | Diferència acceptable. |
| alumne_16 | 8,25 | 8,75 | -0,5 | Lleu | Infraavaluació menor: probablement s'ha penalitzat massa l'error parcial de continents. |
| alumne_17 | 10 | 9,25 | 0,75 | Moderada | Sobreavaluació: no es penalitzen prou els casos invàlids tractats com a vàlids. |

## Classificació per tipus de desviació

| Tipus | Alumnes | Patró principal |
|---|---|---|
| Coincidència exacta | alumne_01 | Criteri automàtic alineat amb el manual. |
| Diferència lleu `0 < \|des\| < 1` | alumne_03, alumne_06, alumne_07, alumne_08, alumne_10, alumne_11, alumne_12, alumne_13, alumne_14, alumne_15, alumne_16 | Variacions normals de criteri, sobretot en format, qualitat de codi o severitat menor. |
| Infraavaluació forta | alumne_02, alumne_05, alumne_09 | La correcció automàtica és massa severa amb codi parcial, incomplet o que no compila. |
| Sobreavaluació forta | alumne_04 | La correcció automàtica no penalitza prou un error real de control de flux. |
| Sobreavaluació moderada | alumne_17 | La correcció automàtica atorga nota màxima tot i defaults o `else` massa permissius. |

## Diagnòstic tècnic

### 1. Penalització excessiva de codi no funcional però parcialment estructurat

Els casos `alumne_02`, `alumne_05` i `alumne_09` mostren el mateix patró: el codi té errors greus, però conté evidències de treball valorables segons la rúbrica.

Evidències que la correcció manual sembla haver valorat més:

* presència de classe, `main` i imports;
* ús de `Scanner`;
* menú o constants de l'enunciat;
* lectura parcial de dades;
* inici d'estructures condicionals;
* separació parcial dels casos de l'exercici.

La correcció automàtica ha interpretat massa sovint aquests casos com a gairebé no resolts. Això produeix infraavaluacions fortes quan el criteri manual dona crèdit parcial encara que el programa no compili o no sigui funcional.

### 2. Penalització insuficient d'errors de flux en solucions altes

El cas més clar és `alumne_04`.

El codi resol els càlculs principals, però l'`else` final queda associat només a l'últim `if`. Això provoca que per continents vàlids diferents de 5 també es pugui mostrar el missatge `No has seleccionat cap continent`.

Aquest tipus d'error no és només de format: és un error de comportament observable. La correcció automàtica el va considerar una incidència menor, mentre que la manual el va penalitzar més.

També apareix un patró semblant a `alumne_17`, on les opcions invàlides poden acabar tractades com una opció vàlida per l'ús d'un `else` final massa ampli.

### 3. Diferències petites en format i qualitat

Els casos amb desviació de `0,25` o `0,5` són esperables en una correcció semiautomàtica. Normalment corresponen a:

* diferències en la severitat sobre el format de sortida;
* accents o noms de productes;
* ús de decimals;
* repetició de codi;
* petites diferències en tractament d'entrades invàlides.

Aquestes diferències no indiquen un problema greu de criteri.

## Proposta de calibratge

### Ajust 1: crèdit parcial mínim per estructura observable

Quan un exercici no compila o no és funcional, no s'hauria d'assignar automàticament una nota molt baixa si hi ha evidències estructurals clares.

Proposta de criteri:

| Evidència observable | Crèdit orientatiu |
|---|---:|
| Classe, `main`, imports i estructura bàsica | fins a 0,5 |
| Menú o preguntes d'entrada coherents | fins a 0,5 |
| Variables/constants de l'enunciat ben identificades | fins a 0,5 |
| Lectura de dades parcialment correcta | fins a 0,5 |
| Estructures condicionals iniciades amb intenció clara | fins a 0,5-1 |
| Càlcul parcial recognoscible encara que incomplet | fins a 0,5-1 |

Aquest ajust reduiria infraavaluacions com les de `alumne_02`, `alumne_05` i `alumne_09`.

### Ajust 2: distingir error de compilació d'absència de solució

Cal separar aquests dos casos:

| Situació | Tractament recomanat |
|---|---|
| No hi ha codi o no hi ha exercici lliurat | nota molt baixa o 0 en l'exercici |
| Hi ha codi amb errors de sintaxi però estructura i lògica parcial visibles | assignar crèdit parcial segons la rúbrica |
| Hi ha codi que compila però no calcula res | penalització forta, però valorant estructura i entrada si existeixen |
| Hi ha codi que calcula alguns casos correctament | puntuació parcial funcional, no només estructural |

Això evita que un error de sintaxi arrossegui tota la nota de l'exercici si el plantejament és clar.

### Ajust 3: penalització més forta dels errors de flux en notes altes

Quan una solució sembla completa, cal revisar explícitament:

* si cada `else` està associat al bloc correcte;
* si hi ha missatges contradictoris en casos vàlids;
* si un `else` final tracta qualsevol entrada invàlida com una opció vàlida;
* si hi ha `default` que inventa un resultat en lloc de gestionar error;
* si el programa pot mostrar més d'una sortida final per a una sola execució.

Proposta de penalització:

| Error detectat | Penalització orientativa |
|---|---:|
| Missatge contradictori en un cas vàlid | -0,75 a -1,25 |
| Entrada invàlida tractada com una opció vàlida | -0,25 a -0,75 |
| `else` associat incorrectament però càlcul principal correcte | -0,75 a -1,25 |
| Dues sortides finals incompatibles | -0,75 a -1,5 |

Aquest ajust reduiria sobreavaluacions com `alumne_04` i, en menor grau, `alumne_17`.

### Ajust 4: criteri diferenciat per franges de nota

El sistema hauria d'aplicar criteris lleugerament diferents segons el nivell del lliurament.

| Franja | Prioritat de correcció |
|---|---|
| 0-3 punts | Detectar i premiar estructura, entrada i intenció parcial. |
| 3-6 punts | Valorar funcionalitat parcial i identificar errors de càlcul principals. |
| 6-8 punts | Revisar precisió de càlcul, format i qualitat del codi. |
| 8-10 punts | Ser més estricte amb flux, casos límit, sortida exacta i coherència global. |

Això ajudaria a evitar els dos errors oposats detectats: enfonsar massa els lliuraments febles i regalar massa nota en lliuraments aparentment complets.

## Proposta de text per afegir al prompt de correcció

Es pot afegir una instrucció com aquesta al prompt o a `AGENTS.md`:

```markdown
Quan un exercici no compila o no és plenament funcional, no l'avaluïs automàticament com a zero si hi ha evidències parcials clares. Valora separadament estructura, entrada de dades, constants, menú, condicions i càlculs parcials segons la rúbrica.

En canvi, en exercicis aparentment complets, revisa amb més severitat els errors de control de flux: `else` mal associats, missatges contradictoris, sortides múltiples o opcions invàlides tractades com a vàlides. Aquests errors afecten el comportament real i poden justificar penalitzacions superiors a les de format.
```

## Conclusions tècniques

La correcció automàtica està ben centrada en mitjana, però presenta desviacions en dos escenaris oposats:

* infraavalua codi parcial que no compila o no acaba de funcionar;
* sobreavalua solucions altes amb errors reals de control de flux o validació.

La millora recomanada és recalibrar el sistema en dos punts:

* donar més crèdit parcial a evidències estructurals i lògiques en lliuraments febles;
* penalitzar més els errors de comportament observable en lliuraments bons.

Amb aquests ajustos, és probable que les desviacions fortes es redueixin sense canviar de manera significativa la mitjana global de les qualificacions.
