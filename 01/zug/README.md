# Übung 01/06

## Aufgabe
Schreiben sie eine Klasse “Zug” mit der Ganzzahl-Eigenschaft “wagons” mit dem Wert 3. Diese Eigenschaft darf nur innerhalb der Vererbungskette sichtbar sein. Daher soll eine Methode “getWagons” implementiert werden, die eben diese Anzahl zurückgibt.

### Spezifikationen
----

Schreiben Sie eine Klasse “Gueterzug” die von Zug erbt und zusätzlich folgende öffentliche Methoden einführt:
- void beladen() – gibt “rein damit...” aus
- void entladen() – gibt “raus damit...” aus

Schreiben Sie eine Klasse “Spezialzug”, die von “Gueterzug erbt und zusätzlich diese öffentliche Methode implementiert:
- void sichern() – gibt “Ich checke...” aus

Schreiben Sie eine weitere Klasse “Personenzug”, die von “Zug” erbt und zusätzlich folgende öffentliche Methoden implementiert:
- void essen() – gibt “Mampf Mampf” aus
- Außerdem hat dieser Zug 10 Wagons.

Schreiben Sie entsprechend eine Main-Klasse mit passender main-Methode um die Klassen zu testen (alle Methoden und 
Eigenschaften aufrufen)

----