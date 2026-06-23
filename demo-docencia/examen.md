| M0485 Programació | Tema 1 Programació estructurada: Condicionals |  |  |
| :---- | ----- | :---- | :---: |
| Nivell - Cicle | DAW - DAM | Curs: | 2025/2026 |
| Cognoms i nom: |  | Data |  |
| sha256sum (5 primers i 5 últims) |  | Nota: |  |

Realitza el codi dels exercicis en **Java** dins un projecte **VSCode/NetBeans** anomenat **Cognoms_Nom_T1_Pe2**. Envia el projecte comprimit en un **arxiu zip** amb el **hash sha256sum** aplicat prèviament. Si el nom del projecte no segueix aquest format, es **descomptarà 1 punt**. Si no s'envia el hash o aquest no coincideix amb el fitxer enviat, **la nota serà 0**.

**Inclou** el teu nom com a comentari a tots els fitxers.

**Durada**: 60 minuts. **Total**: 10 punts.

Les puntuacions són màximes per exercici i s'avaluen segons assoliment de l'objectiu, estructura, nom i ús de variables, tabulació i comentaris. Els exemples d'execució s'han de seguir com un contracte amb el client. Cada exercici mostra un exemple d'execucció.

---

## Exercici 1: Màquina expenedora **[5 punts]**

Una màquina expenedora ofereix 5 productes amb els següents preus unitaris:

| Codi | Producte       | Preu unitari |
|------|----------------|-------------|
| 1    | Aigua          | 1.20 €      |
| 2    | Refresc        | 2.50 €      |
| 3    | Café           | 1.80 €      |
| 4    | Sandwich       | 4.50 €      |
| 5    | Barreta        | 1.50 €      |

El programa ha de:
1. Mostrar el menú de productes amb codis i preus.
2. Demanar el codi de producte (enter) i la quantitat (enter).
3. Usar un `switch` (clàssic amb `break` o arrow syntax) per determinar el preu unitari.
4. Calcular i mostrar el total (preu unitari × quantitat) amb format de dos decimals.
5. Si el codi no és vàlid, mostrar "Producte no disponible".

**Exemples d'execució:**

```
1 - Aigua (1.20€)
2 - Refresc (2.50€)
3 - Café (1.80€)
4 - Sandwich (4.50€)
5 - Barreta (1.50€)
Selecciona producte: 2
Quantitat: 3
Total: 7.50 €
```

```
1 - Aigua (1.20€)
2 - Refresc (2.50€)
3 - Café (1.80€)
4 - Sandwich (4.50€)
5 - Barreta (1.50€)
Selecciona producte: 6
Producte no disponible.
```

---

## Exercici 2: Càlcul d'impostos **[5 punts]**

El programa calcula l'impost anual segons els ingressos i la situació laboral.

| Ingressos anuals | Tipus general | Autònom |
|---|---|---|
| Fins a 12.000 € | 0% | 5% |
| 12.001 € - 30.000 € | 15% | 20% |
| 30.001 € - 60.000 € | 25% | 30% |
| Més de 60.000 € | 35% | 40% |

El programa ha de:
1. Demanar els ingressos anuals (nombre real positiu).
2. Preguntar si el contribuent és autònom (s/n).
3. Amb `if-else if-else` encadenat, determinar el tram i aplicar el percentatge correcte.
4. Mostrar l'impost a pagar amb dos decimals.
5. Si els ingressos són negatius, mostrar "Ingressos no vàlids".

**Exemples d'execució:**

```
Ingressos anuals: 25000
Ets autònom? (s/n): n
L'impost a pagar és: 3750.00 €
```

```
Ingressos anuals: 80000
Ets autònom? (s/n): s
L'impost a pagar és: 32000.00 €
```

```
Ingressos anuals: 5000
Ets autònom? (s/n): s
L'impost a pagar és: 250.00 €
```

```
Ingressos anuals: -100
Ingressos no vàlids.
```
