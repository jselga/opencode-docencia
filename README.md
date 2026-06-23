# Workshop OpenCode per a Docents

Repositori de suport per al workshop sobre l'ús d'OpenCode en contextos docents.

L'objectiu del repositori és recollir materials, exemples i sessions de treball que evolucionaran al llarg del taller.

## Continguts

* [Sessió 1](./sessio1.md)

## Preparació tècnica

Abans del workshop convé tenir preparat:

* `git` per clonar el repositori i seguir els canvis.
* `node` instal·lat.
* un editor de codi, per exemple `Visual Studio Code`.
* una terminal funcional.

## Clonar el repositori

```bash
git clone https://github.com/jselga/opencode-docencia
cd opencode-docencia
```

Si el repositori ja està descarregat, només cal obrir la carpeta amb l'editor i treballar des d'allà.

## Preinstal·lacions recomanades

### Node.js

OpenCode es distribueix via `npm`, així que cal tenir `Node.js` instal·lat.

Es recomana instal·lar una versió actual de Node.js des de:

https://nodejs.org/

També es pot instal·lar amb gestors de versions com `nvm`.

Exemple amb `nvm`:

```bash
nvm install --lts
nvm use --lts
```

Comprovar la instal·lació:

```bash
node --version
npm --version
```

### OpenCode

Si es vol arribar amb l'eina ja instal·lada:

```bash
npm install -g opencode-ai
opencode --version
```

La configuració del model es treballarà durant el workshop o en les ampliacions posteriors, segons el proveïdor disponible.

### Editor de codi

Es recomana utilitzar un editor com `Visual Studio Code` per:

* editar els fitxers Markdown,
* navegar pel repositori,
* visualitzar els canvis,
* treballar còmodament amb Git.

### Git

Comprovar que Git està disponible:

```bash
git --version
```

## Seguir l'evolució del material

Una part del workshop consisteix a veure com els materials evolucionen a través dels commits.

Per això és recomanable:

* revisar l'historial amb `git log --all --decorate --oneline --graph`,
* visualitzar branques i commits amb extensions com `Git Graph` a VS Code,
* o fer servir qualsevol altra eina gràfica de Git que us sigui còmoda.

Exemple:

```bash
git log --all --decorate --oneline --graph
```

## Nota per al workshop

No cal tenir-ho tot configurat perfectament abans de començar, però sí és recomanable arribar amb:

* el repositori clonat,
* Node.js instal·lat,
* l'editor de codi preparat,
* i Git disponible per seguir els commits de la sessió.

## Com començar avui

1. Clona el repositori.
2. Comprova que tens `git`, `node` i `npm` disponibles.
3. Instal·la `opencode` si vols arribar amb l'eina preparada.
4. Obre la carpeta del repositori amb `Visual Studio Code` o un editor equivalent.
5. Revisa la [Sessió 1](./sessio1.md).
6. Si vols seguir l'evolució del material, executa:

```bash
git log --all --decorate --oneline --graph
```
