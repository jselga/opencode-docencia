# Recursos Addicionals

Recopilatori de recursos consultats per preparar el workshop i materials de suport.
## Notebooklm
[Quadern amb presentacions i vídeo](https://notebooklm.google.com/notebook/f3f9ee4a-f59c-4734-a278-132477dba5c4)
## Vídeos sobre OpenCode

* [Curso de OpenCode desde cero: Comandos, Agentes, Ahorrar tokens y más](https://www.youtube.com/watch?v=eABNL3igtVo) — midudev
* [Así se programa en 2026: IA, agentes y apps reales](https://www.youtube.com/watch?v=ZZq4TpNgnvg) — HolaMundo

## Vídeos sobre desenvolupament amb IA i agents
### 3 dies de desarrollo con IA
* [Vídeo 1 — Brais Moure](https://www.youtube.com/live/GarWqdHzwac?si=gugDcvqH7Hf6FNzG) 
* [Vídeo 2 — Brais Moure](https://www.youtube.com/watch?v=irR8437xihg)
* [Vídeo 3 — Brais Moure](https://www.youtube.com/watch?v=kcSKbwVYXCg)

## Documentació oficial

* [OpenCode](https://opencode.ai)
* [Documentació d'OpenCode](https://opencode.ai/docs)
* [Getting started](https://opencode.ai/docs/getting-started)
* [GitHub d'OpenCode](https://github.com/anomalyco/opencode)

## Ampliació: AGENTS.md, skills i subagents

### AGENTS.md

`AGENTS.md` serveix per definir el comportament general d'OpenCode dins d'un projecte:

* rol,
* to,
* criteris,
* format de resposta,
* límits.

És la peça més simple i útil per estabilitzar un flux docent.

### Skills

Les `skills` permeten encapsular instruccions o capacitats especialitzades reutilitzables.

Poden ser útils quan volem:

* repetir un patró de treball,
* separar tasques per tipus,
* oferir suport més guiat en contextos concrets.

### Subagents

Els `subagents` permeten delegar tasques més concretes a agents enfocats.

Per exemple:

* revisar errors de compilació,
* resumir patrons d'error del grup,
* analitzar la qualitat del feedback generat.

### Idea clau

Per a docència, el més recomanable és:

1. començar amb un bon `AGENTS.md`,
2. provar el flux amb casos patró,
3. escalar la correcció,
4. i només després explorar `skills` o `subagents` si realment aporten valor.

## Altres recursos

* [OpenRouter](https://openrouter.ai) — proveïdor de models opcionals
* [Models OpenRouter](https://openrouter.ai/models)
* [Tokenizer](https://platform.openai.com/tokenizer) - Mesurador de tokens
* [Cavenman](https://github.com/juliusbrussee/caveman) - Estalviador de tokens reduint el llenguatge a més simple. *Brain still big. Mouth small*
* [LLMstats](https://llm-stats.com/) - Estadístiqes de models LLM 
---

Última actualització: 26 de Juny 2026
