# Übung 01/07

## Aufgabe
Schreiben Sie ein Interface „IDisc“, dass eine Methode „play“ und eine Methode „search“ erzwingt. Beide Methoden haben keine Parameter und keinen Rückgabewert.

### Speziallisierung
----

- Schreiben Sie eine Klasse „DVD“ die das Interface „IDisc“ implementiert. Die Methode „play“ soll dabei „playing the dvd“ ausgeben – „search“ hingegen „searching...“.
- Schreiben Sie eine Klasse „Bluray“ die ebenfalls das Interface „IDisc“ implementiert. Die Methode „play“ soll nun „playing the blueray“ ausgeben – „search hingegen „fast searching...“.
- Schreiben Sie eine Klasse „Player“ die die Methode „insertDisc“ implementiert. Die Methode soll als Parameter ein Objekt vom Typ „IDisc“ erwarten – dieses Objekt soll intern & privat gespeichert werden. 
- Mit der Methode „play“ soll zunächst die Methode „search“ und dann die Methode „play“ der Disc aufgerufen werden, ohne einen Parameter zu verlangen oder einen Rückgabewert zu geben.
- Schreiben Sie eine Main-Methode, die einen Player instanziiert und eine BluRay sowie eine DVD erstellt. 
- Anschließend soll die Disc an den Player übergeben werden und mit „play“ abgespielt werden.

----