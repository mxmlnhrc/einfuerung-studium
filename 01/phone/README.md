# Übung 01/04

## Aufgabe
Schreiben Sie eine abstrakte Klasse Telefon, die folgende öffentliche Methoden implementiert/definiert:
- void dial() - abstrakt
- void ring() - gibt “Ring Ring” aus
- void listen() - gibt “Bla Bla Bla” aus

### Spezifikationen
----
- Schreiben Sie eine Klasse “Smartphone”, die “Telephone” erweitert. Die Methode “dial” soll dabei “Klick”  ausgeben.
- Schreiben Sie eine Klasse “Mobile”, die “Telefon” erweitert. Die Methode “dial” soll dabei “Piep” ausgeben und die Methode “ring” soll “Ding Dong” ausgeben.
- Schreiben Sie entsprechend eine Main-Klasse mit passender main-Methode um “Smartphone” und “Mobile” zu testen.

----
#### Verbesserungens Ideen
- In Telephone.java eine call - Methode einrichten welche zuerst die dial(), dann ring() und zum Schluss die listen() Methode aufruft -> Saubere main-Methode
- Mit Kommentar beschrieben