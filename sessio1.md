# Workshop OpenCode per a Docents

## Sessió 1 (2 hores)

### Objectiu

Aprendre a utilitzar OpenCode per generar i refinar materials docents a partir de documents propis del centre, treballant sobre fitxers locals i amb context de projecte.

Al final de la sessió els participants seran capaços de:

* Instal·lar OpenCode.
* Connectar un proveïdor de models.
* Obrir un projecte local i inicialitzar-lo.
* Fer servir fitxers com a context real de treball.
* Generar exercicis i activitats a partir de RAs.
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
├── exercicis.md
├── criteris_avaluacio.md
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

### Opció recomanada per al taller: OpenRouter

1. Crear compte a:

https://openrouter.ai

2. Generar una API key.

3. Iniciar OpenCode:

```bash
opencode
```

4. Connectar el proveïdor des de la TUI:

```text
/connect
```

5. Seleccionar `OpenRouter` i enganxar la clau.

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
* `/models` per canviar de model.
* `/undo` per desfer l'últim canvi.
* `/sessions` per veure sessions.

---

## Bloc 5. Primera generació útil (20 min)

Prompt inicial:

```text
Llegeix @ra.md i genera 10 exercicis progressius per alumnat de CFGS DAW.

Classifica'ls en:
- Inicial
- Intermedi
- Avançat

No incloguis la solució.
Presenta el resultat en format markdown.
```

Després es pot demanar:

```text
Guarda el resultat a exercicis.md
```

Punt didàctic:

Amb un únic document ja podem obtenir una primera proposta útil, però encara poc contextualitzada.

---

## Bloc 6. Refinament amb més context (20 min)

Crear un segon document:

```text
criteris_avaluacio.md
```

Exemple de contingut:

```text
El material ha de tenir progressió de dificultat, context professional bàsic, enunciats clars i activitats resolubles en dues hores de classe.
```

Nova petició:

```text
Utilitza @ra.md i @criteris_avaluacio.md per generar una pràctica de 2 hores.

Inclou:
- objectiu,
- enunciat,
- tasques,
- criteris de correcció.
```

Missatge clau:

Com més context real aportem, més útil i ajustat és el resultat.

---

## Bloc 7. Activitat final guiada (25 min)

Preparar aquesta estructura:

```text
materials/
├── ra.md
├── criteris_avaluacio.md
└── examen_anterior.md
```

Prompt final:

```text
Genera un nou examen inspirat en @materials/examen_anterior.md.

Mantén el nivell, però assegura que queda alineat amb @materials/ra.md i amb els criteris definits a @materials/criteris_avaluacio.md.

No copiïs literalment l'examen anterior.
```

Variants per a proves en viu:

* demanar una versió més curta,
* demanar una versió amb rúbrica,
* demanar una versió sense solucions,
* demanar adaptació per recuperació.

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
Utilitza @ra.md i @criteris_avaluacio.md.

Genera una activitat de 90 minuts per alumnat de CFGS DAW.
Vull un format clar, amb objectiu, enunciat i criteris de correcció.
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

OpenRouter:

https://openrouter.ai

Models OpenRouter:

https://openrouter.ai/models

---



## Propera sessió

* Creació d'agents.
* Correcció automàtica de treballs.
* Revisió de repositoris Git.
* Generació de feedback amb rúbriques.
* Automatització de processos docents.
