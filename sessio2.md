# Workshop OpenCode per a Docents

## Sessió 2 (2 hores)

### Objectiu

Aprendre a construir un flux de correcció assistida amb OpenCode a partir de lliuraments reals anonimitzats, consolidant el context docent amb un `AGENTS.md` i preparant la correcció en bloc.

Al final de la sessió els participants seran capaços de:

* Entendre el pas de la generació de materials a la correcció assistida.
* Posar en comú els resultats del bloc opcional de la sessió 1.
* Identificar quin context necessita OpenCode per corregir bé.
* Crear un `AGENTS.md` orientat a correcció i feedback docent.
* Ajustar el comportament del sistema amb casos patró.
* Preparar un flux de correcció en bloc per a diversos lliuraments.

---

## Estructura de la sessió

### Bloc 1. Retorn de la sessió 1 i pont amb la sessió 2 (15 min)

La sessió 1 acabava amb un bloc opcional de correcció assistida amb IA.

Si es va poder fer en directe:

* avui partirem dels resultats,
* revisarem què ha funcionat,
* i els convertirem en un procés més estable.

Si no es va arribar a fer:

* avui en veurem la resolució,
* i la farem servir com a punt de partida per a la sessió 2.

Missatge clau:

La sessió 1 treballava la generació de teoria, exercicis i exàmens. La sessió 2 treballa la correcció, el feedback i la sistematització del procés.

---

### Bloc 2. Flux real de treball amb lliuraments anonimitzats (10 min)

En aquesta sessió es treballa amb un flux docent real:

1. descarregar els lliuraments del Moodle,
2. descomprimir els projectes,
3. anonimitzar-los amb identificadors del tipus `alumne-01`, `alumne-02`, etc.,
4. preparar el context de correcció,
5. provar el procés amb casos representatius,
6. escalar la correcció a tot el bloc.

Nota important:

Els passos previs de descàrrega, descompressió i anonimització es donen per preparats abans de la sessió. No són l'objectiu central del taller, tot i que es poden compartir com a material complementari.

Material complementari:

* Pla d'implementació del script d'anonimització: `@pla-implementacio-anonimitzacio.md`
* Script d'exemple en python:
  `@anonimitza_lliuraments.py`

Nota de privacitat:

Sempre que es treballi amb lliuraments reals, convé anonimitzar noms, identificadors i qualsevol dada personal abans d'incorporar-los al projecte.

---

### Bloc 3. Preparar el context de correcció (15 min)

OpenCode no pot corregir bé només llegint el codi de l'alumne.

Per obtenir correccions consistents, cal aportar context docent suficient:

* `@examen.md` o `@enunciat.md`
* `@rubrica-examen.md`
* una plantilla o estil de `feedback.md`
* diversos lliuraments representatius

Missatge clau:

La qualitat del feedback depèn tant del context com del lliurament.

Exemple de carpeta de treball:

```text
demo-correccio/
├── examen.md
├── rubrica-examen.md
├── feedback-plantilla.md
├── lliuraments/
│   └── alumne-01/
│       ├── Ex1.java
│       └── Ex2.java
└── AGENTS.md
```

---

### Bloc 4. Preparar la carpeta de treball per a la correcció (20 min)

Ara es tracta de muntar una carpeta `demo-correccio/` amb els materials mínims necessaris per començar a provar la correcció.

Contingut inicial recomanat:

* `examen.md`
* `rubrica-examen.md`
* `feedback-plantilla.md`
* `lliuraments/alumne-01/`
* `lliuraments/alumne-02/`
* `lliuraments/alumne-03/`

Objectiu del bloc:

* reunir en un mateix projecte el context de correcció,
* afegir una plantilla de feedback que marqui el format esperat,
* incorporar lliuraments reals anonimitzats,
* deixar el terreny preparat per fer proves abans de consolidar el context.

Exemple d'estructura:

```text
demo-correccio/
├── examen.md
├── rubrica-examen.md
├── feedback-plantilla.md
└── lliuraments/
    ├── alumne-01/
    │   ├── Ex1.java
    │   └── Ex2.java
    ├── alumne-02/
    │   ├── Ex1.java
    │   └── Ex2.java
    └── alumne-03/
        ├── Ex1.java
        └── Ex2.java
```

Missatge clau:

Abans de definir un `AGENTS.md`, convé preparar bé la carpeta de treball i fer les primeres proves amb materials reals.

---

### Bloc 5. Primeres proves de correcció sense AGENTS.md (20 min)

Abans de formalitzar el context, convé provar com respon OpenCode només amb l'enunciat, la rúbrica, la plantilla de feedback i alguns lliuraments.

Objectiu:

* detectar què funciona ja,
* veure quines instruccions falten,
* identificar incoherències de to, format o criteri,
* recollir què haurà d'explicitar després `AGENTS.md`.

Prompt tipus:

```text
Llegeix @examen.md, @rubrica-examen.md, @feedback-plantilla.md i @lliuraments/alumne-01.

Avalua el lliurament i genera un feedback en format markdown.

Segueix l'estil de la plantilla de feedback.
Inclou:
- nota orientativa,
- punts forts,
- errors detectats,
- millores recomanades,
- feedback final per a l'alumne.
```

Preguntes útils després de la prova:

* El to és prou formatiu?
* La nota queda ben justificada?
* El format és consistent?
* Està interpretant correctament la rúbrica?
* Quines regles convé fixar explícitament?

Missatge clau:

Les proves prèvies serveixen per descobrir quines instruccions hem de consolidar.

---

### Bloc 6. AGENTS.md com a peça central (30 min)

Ara no es tracta només de llançar prompts, sinó de definir un context estable de treball.

`AGENTS.md` ha de servir per fixar:

* el rol docent,
* el nivell educatiu,
* el tipus de feedback esperat,
* els criteris de correcció,
* el format de sortida,
* els límits del sistema.

Exemple de contingut que volem capturar:

```text
Actua com a docent de CFGS DAM/DAW.

Quan corregeixis lliuraments:
- prioritza el feedback formatiu,
- justifica la nota orientativa,
- separa punts forts, errors i millores,
- no donis la solució completa si no es demana,
- no inventis requisits que no apareguin a l'enunciat o la rúbrica,
- mantén un to clar, respectuós i accionable.
```

Prompt de treball per construir-lo:

```text
Llegeix @examen.md, @rubrica-examen.md, @feedback-plantilla.md i els lliuraments
@lliuraments/alumne-01, @lliuraments/alumne-02 i @lliuraments/alumne-03.

Proposa un fitxer AGENTS.md per corregir lliuraments de programació de CFGS DAM/DAW.

Ha d'incloure:
- rol docent,
- objectiu del feedback,
- criteris de qualitat,
- format de sortida,
- què ha de fer,
- què no ha de fer,
- com justificar la nota orientativa,
- com adaptar el feedback segons el nivell del lliurament.
```

Després es pot demanar:

```text
Guarda el resultat a AGENTS.md
```

Missatge clau:

`AGENTS.md` és la peça que converteix un conjunt de proves puntuals en un procés reusable.

Nota d'ampliació:

En aquest workshop ens centrem en `AGENTS.md` perquè és la manera més directa d'estabilitzar el comportament de correcció dins del projecte.

Si dona temps, o com a treball autònom posterior, es pot ampliar el flux amb:

* `skills`, per encapsular instruccions o capacitats especialitzades reutilitzables,
* `subagents`, per delegar tasques concretes a agents més enfocats.

La idea és no començar per aquí, sinó arribar-hi un cop el procés base de correcció ja funciona bé.

---

### Bloc 7. Ajust amb casos patró amb AGENTS.md (20 min)

Abans de corregir un grup sencer, convé provar el sistema amb casos representatius.

Seqüència recomanada:

1. un cas de nota alta,
2. un cas mitjà,
3. un cas suspès.

Objectiu:

* revisar si el to és l'adequat,
* comprovar si la nota orientativa és coherent,
* veure si el feedback realment ajuda a millorar,
* ajustar `AGENTS.md` abans d'escalar,
* validar que el comportament canvia correctament entre un cas fort, un cas mitjà i un cas fluix.

Prompt tipus:

```text
Llegeix @examen.md, @rubrica-examen.md, @feedback-plantilla.md, @AGENTS.md
i els lliuraments següents:
- @lliuraments/alumne-01
- @lliuraments/alumne-02
- @lliuraments/alumne-03

Fes servir aquests tres casos com a exemples de:
- un alumne de nota alta,
- un alumne de nivell mitjà,
- un alumne suspès.

Genera un feedback en format markdown per a cada cas seguint AGENTS.md.

Després, indica:
- si el to és coherent entre casos,
- si la nota orientativa està ben ajustada,
- quins canvis proposes a AGENTS.md per millorar la consistència.
```

Missatge clau:

Primer s'ajusta el sistema amb pocs casos. Després s'escala.

---

### Bloc 8. Correcció en bloc (20 min)

Un cop revisat `AGENTS.md` amb casos patró, ja es pot passar a la correcció del conjunt complet de lliuraments.

Estructura esperada:

```text
lliuraments/
├── alumne-01/
│   ├── Ex1.java
│   ├── Ex2.java
│   └── feedback.md
├── alumne-02/
│   ├── Ex1.java
│   ├── Ex2.java
│   └── feedback.md
└── alumne-03/
    ├── Ex1.java
    ├── Ex2.java
    └── feedback.md
```

Objectiu final:

* generar un `feedback.md` per a cada alumne,
* mantenir un format consistent,
* reduir temps de correcció sense perdre criteri docent.

Prompt tipus:

```text
Fes una correcció en bloc de tots els lliuraments dins de @lliuraments.

Per a cada alumne, genera un fitxer `feedback.md` coherent amb `AGENTS.md`,
mantenint el mateix to, estructura i criteri d'avaluació.
```

Missatge didàctic:

La correcció en bloc és l'últim pas del procés, no el primer.

---

### Bloc 9. Bones pràctiques i límits (10 min)

Bones pràctiques:

* anonimitzar sempre els materials reals,
* revisar primer casos patró,
* fixar el context amb `AGENTS.md`,
* començar amb `AGENTS.md` abans d'introduir `skills` o `subagents`,
* supervisar una mostra de feedback abans d'escalar,
* mantenir el docent com a responsable final de la correcció.

Límits:

* una rúbrica poc clara genera correccions inconsistents,
* un context insuficient produeix feedback massa genèric,
* la correcció automàtica no substitueix el judici docent,
* els resultats s'han de revisar abans de compartir-los amb l'alumnat.

---

## Materials recomanats per a la sessió

* `examen.md`
* `rubrica-examen.md`
* `feedback-plantilla.md`
* `lliuraments/alumne-xx/`
* `AGENTS.md`

---

## Recursos

OpenCode:

https://opencode.ai

Documentació:

https://opencode.ai/docs

GitHub:

https://github.com/anomalyco/opencode

---

## Propera sessió

* Automatització de fluxos docents.
* Plantilles reutilitzables.
* Integració amb repositoris i revisions més sistemàtiques.
* Ús de processos més especialitzats per a correcció i seguiment.
