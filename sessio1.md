# Workshop OpenCode per a Docents

## Sessió 1 (2 hores)

### Objectiu

Aprendre a utilitzar OpenCode per generar i refinar materials docents a partir de documents propis del centre, treballant sobre fitxers locals i amb context de projecte.

Al final de la sessió els participants seran capaços de:

* Instal·lar OpenCode.
* Connectar un proveïdor de models.
* Obrir un projecte local i inicialitzar-lo.
* Fer servir fitxers com a context real de treball.
* Generar materials de teoria, exercicis i exàmens a partir de RAs i context específic.
* Refinar el resultat afegint més context.
* Entendre la diferència entre un xat generalista i un entorn orientat a projectes.

---

## Estructura de la sessió

### Bloc 1. Què és OpenCode? (10 min)

OpenCode és una eina que permet treballar amb IA directament sobre carpetes i fitxers del nostre ordinador.

En lloc de copiar i enganxar documents en un xat:

* llegeix fitxers del projecte,
* manté context entre interaccions,
* pot consultar diversos documents alhora,
* pot proposar o aplicar canvis sobre materials reals.

Exemple de projecte:

```text
projecte-docent/
├── ra1.md
├── tema.md
├── teoria.md
├── exercicis.md
└── examen_anterior.md
```

Idea clau de la sessió:

OpenCode no és només un xat. És un agent que treballa dins d'un projecte.

---

## Bloc 2. Instal·lació i primer accés (20 min)

### Requisits

* Node.js instal·lat.
* Terminal moderna.
* Connexió a internet.
* Compte en un proveïdor de models.

Comprovar la instal·lació de Node:

```bash
node --version
```

### Instal·lar OpenCode

Opció amb npm:

```bash
npm install -g opencode-ai
```

Verificar:

```bash
opencode --version
```

Documentació:

https://opencode.ai/docs

---

## Bloc 3. Connectar un model (15 min)

Per a la sessió base convé treballar amb un proveïdor que ja estigui disponible o que el docent pugui mostrar en directe sense convertir el registre en una barrera d'entrada.

Flux recomanat:

1. Iniciar OpenCode:

```bash
opencode
```

2. Connectar el proveïdor des de la TUI:

```text
/connect
```

3. Seleccionar un proveïdor disponible i completar l'autenticació.

Nota didàctica:

Si no es vol dependre de registres previs o de configuracions personals, aquesta part es pot fer com a demostració guiada del docent.

### Comandes útils

Llistar models disponibles dins la TUI:

```text
/models
```

Llistar models des de terminal:

```bash
opencode models
```

Nota:

Per a la sessió és millor ensenyar `/connect` i `/models` que no pas començar per variables d'entorn.

---

## Bloc 4. Crear el primer projecte (20 min)

Crear una carpeta de treball:

```bash
mkdir demo-docencia
cd demo-docencia
```

Crear un fitxer base:

```bash
nano ra.md
```

Exemple de contingut:

```text
RA1. Desenvolupa aplicacions utilitzant estructures de control i aplicant criteris de llegibilitat i correcció.
```

Crear un segon fitxer amb context específic:

```bash
nano tema.md
```

Exemple de contingut:

```text
Tema: Estructures de selecció en Java

Continguts:
- if
- if else
- else if
- switch
- operadors relacionals
- operadors lògics
- bones pràctiques en condicions
- errors habituals

Nivell: CFGS DAM/DAW
Durada aproximada: 2 hores
```

Iniciar OpenCode en aquesta carpeta:

```bash
opencode
```

Inicialitzar el projecte:

```text
/init
```

Això ajuda OpenCode a entendre millor l'estructura i el context del projecte.

### Com moure's dins OpenCode

* `@ra.md` per referenciar un fitxer.
* `@tema.md` per aportar context específic.
* `/models` per canviar de model.
* `/undo` per desfer l'últim canvi.
* `/sessions` per veure sessions.

---

## Bloc 5. Generar material de teoria (20 min)

Prompt inicial:

```text
Llegeix @ra.md i @tema.md.

Genera un resum teòric sobre estructures de selecció en Java per alumnat de CFGS DAM/DAW.

Inclou:
- explicació clara dels conceptes principals,
- exemples de codi senzills,
- errors habituals,
- bones pràctiques,
- una petita comparació entre if/else i switch.

Presenta el resultat en format markdown.
No generis exercicis encara.
```

Després es pot demanar:

```text
Guarda el resultat a teoria.md
```

Punt didàctic:

El RA dona el marc curricular, però `tema.md` aporta el context concret que permet generar material docent més útil.

---

## Bloc 6. Generar exercicis a partir de la teoria (20 min)

Nova petició:

```text
Llegeix @ra.md, @tema.md i @teoria.md.

Genera 10 exercicis progressius sobre estructures de selecció en Java per alumnat de CFGS DAM/DAW.

Classifica'ls en:
- Inicial
- Intermedi
- Avançat

Els exercicis han d'estar alineats amb la teoria generada.
No incloguis la solució.
Presenta el resultat en format markdown.
```

Després es pot demanar:

```text
Guarda el resultat a exercicis.md
```

Missatge clau:

Ara els exercicis no surten només d'un RA genèric, sinó d'una seqüència didàctica concreta: RA, tema i teoria.

---

## Bloc 7. Generar un examen a partir de materials previs (25 min)

Preparar aquesta estructura:

```text
demo-docencia/
├── ra.md
├── tema.md
├── teoria.md
├── exercicis.md
└── materials/
    └── examen_anterior.md
```

Prompt final:

```text
Llegeix @ra.md, @tema.md, @teoria.md, @exercicis.md i @materials/examen_anterior.md.

Genera un nou examen sobre estructures de selecció en Java.

Condicions:
- ha d'estar alineat amb el RA,
- ha de seguir el nivell i l'estil de l'examen anterior,
- ha de cobrir els continguts de teoria.md,
- ha de tenir una dificultat progressiva,
- no ha de copiar literalment preguntes de l'examen anterior,
- no incloguis les solucions.

Presenta el resultat en format markdown.
```

Variants per a proves en viu:

* demanar una versió més curta,
* demanar una versió amb rúbrica,
* demanar una versió de recuperació,
* demanar una revisió de cobertura respecte a `@ra.md` i `@tema.md`.

---

## Bloc 8. Diferència amb un xat generalista (10 min)

Xat generalista:

* acostuma a treballar sobre text enganxat,
* no parteix necessàriament d'una carpeta o projecte,
* no deixa tan clar el flux de treball sobre fitxers.

OpenCode:

* treballa sobre carpetes i documents reals,
* permet referenciar fitxers directament,
* manté context de projecte,
* encaixa millor en processos iteratius de creació i revisió.

---

## Bones pràctiques per als prompts

Per obtenir millors resultats, convé indicar:

* el nivell educatiu,
* la durada de l'activitat,
* el format de sortida,
* què volem i què no volem,
* quins fitxers ha d'utilitzar.

Exemple:

```text
Utilitza @ra.md, @tema.md i @teoria.md.

Genera 5 exercicis d'aplicació sobre estructures de selecció en Java per alumnat de CFGS DAM/DAW.
Vull un format clar, amb enunciat progressiu i sense solucions.
No incloguis la solució.
```

---

## Problemes freqüents

### `opencode: command not found`

Revisar que la instal·lació global s'ha fet correctament.

### El model no apareix

Revisar la connexió del proveïdor amb `/connect` i provar `/models`.

### La resposta és massa genèrica

Afegir més context en fitxers i fer referència explícita amb `@fitxer`.

### Ha generat alguna cosa poc útil

Refinar la instrucció, especificar format, durada, nivell i restriccions.

---

## Recursos

OpenCode:

https://opencode.ai

Documentació:

https://opencode.ai/docs

Getting started:

https://opencode.ai/docs/getting-started

GitHub:

https://github.com/anomalyco/opencode

---



## Propera sessió

* Creació d'agents.
* Correcció automàtica de treballs.
* Revisió de repositoris Git.
* Generació de feedback amb rúbriques.
* Automatització de processos docents.

---

## Ampliació opcional: OpenRouter

OpenRouter es pot presentar com una aplicació posterior a la sessió principal, perquè requereix registre i la configuració del compte pot implicar comprovacions de crèdits.

### Quan pot interessar

* quan es vol provar diferents models des d'un únic punt,
* quan es vol comparar respostes entre models,
* quan el docent ja té un compte operatiu.

### Flux bàsic

1. Crear compte a:

https://openrouter.ai

2. Generar una API key.

3. Entrar a OpenCode i executar:

```text
/connect
```

4. Seleccionar `OpenRouter` i enganxar la clau.

5. Consultar els models disponibles amb:

```text
/models
```

### Nota important

Encara que alguns models apareguin com a gratuïts, OpenRouter continua requerint que el compte i la clau estiguin correctament configurats.

### Recursos addicionals

OpenRouter:

https://openrouter.ai

Models OpenRouter:

https://openrouter.ai/models
