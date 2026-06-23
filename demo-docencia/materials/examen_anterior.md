

| M0485 Programació | Tema 1 Programació estructurada: Condicionals |  |  |
| :---- | ----- | :---- | :---: |
| Nivell \- Cicle | DAW \- DAM | Curs: | 2025/2026 |
| Cognoms i nom: |  | Data | 08/10/2025 |
| sha256sum (5 primers i 5 últims) |  | Nota: |  |

Realitza el codi dels exercicis en **Java** dins un projecte **VSCode/NetBeans** anomenat **Cognoms\_Nom\_T1\_Pe1**. Envia el projecte comprimit en un **arxiu zip** amb el **hash sha256sum** aplicat prèviament. Si el nom del projecte no segueix aquest format, es **descomptarà 1 punt**. Si no s'envia el hash o aquest no coincideix amb el fitxer enviat, **la nota serà 0\.**

**Inclou** el teu nom com a comentari a tots els fitxers.

**Durada**: 60 minuts. **Total**: 10 punts.

Les puntuacions són màximes per exercici i s’avaluen segons assoliment de l’objectiu, estructura, nom i ús de variables, tabulació i comentaris. Els exemples d’execució s’han de seguir com un contracte amb el client: **en negre** apareix la sortida i **en vermell** l’entrada de l’usuari.

## Exercici 1: Posant preu a vols **\[5 punts\]**

L’empresa RyanFly ens ha demanat que programem un sistema per calcular el preu dels seus vols. El preu base de qualsevol vol és de 100 Geo (moneda local).

Si el client té una targeta Prèmium, se li aplica un descompte de 50 Geo sobre el preu base. A més, segons el continent de destinació, s’hi suma un extra al preu, segons la següent llista:

* 10 **Geo** per Àfrica  
* 30 **Geo** per Àsia  
* 50 **Geo** per Oceania  
* 50 **Geo** per Amèrica  
* 70 **Geo** per Europa

El programa ha de calcular i mostrar el preu final tenint en compte aquestes condicions sense fer servir Switch

\<\<Exemples a la següent pàgina.\>\>  
**Exemples d’execució:**

| `1 - Àfrica 2 - Àsia 3 - Oceania 4 - Amèrica 5 - Europa Selecciona continent: 2  Tens una targeta Prèmium?(s/n) s  El teu vol costa 80 Geo.` | `1 - Àfrica 2 - Àsia 3 - Oceania 4 - Amèrica 5 - Europa Selecciona continent: 5  Tens una targeta Prèmium?(s/n) n  El teu vol costa 170 Geo.` |
| :---- | :---- |

## Exercici 2: La balança del supermercat **\[5 punts\]**

El supermercat Mercahome necessita que programis la balança de fruites i verdures de forma que, donat un pes i una opció que indica quin és el producte, es calculi el preu corresponent. El preu s'ha de mostrar arrodonit a les centèsimes (fins a dues decimals).

Les opcions i preus per kg són les següents:

* 1 \- Tomàquet (2.7468€/Kg)  
* 2 \- Ceba (1.9846€/Kg)  
* 3 \- Préssecs (4.1234€/Kg)  
* 4 \- Patates (1.5474€/Kg)  
* 5 \- Pinya (7.9987€/Kg)

**Exemples d’execució:**

| Quants grams pesa el producte actual? *200*  1 \- Tomàquet 2 \- Ceba 3 \- Préssecs 4 \- Patates 5 \- Pinya Selecciona el producte: *2*  200gr de ceba costen 0.40€ | Quants grams pesa el producte actual? *738*  1 \- Tomàquet 2 \- Ceba 3 \- Préssecs 4 \- Patates 5 \- Pinya Selecciona el producte: *5*  738gr de pinya costen 5.90€ |
| :---- | :---- |

