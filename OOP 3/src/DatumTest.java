public class DatumTest {
    public static void main(String[] args) {
        // Test 1: Konstruktor und toString()
        Datum datum = new Datum(2, 5, 2025);
        System.out.println("Erwartet: 02.05.2025, Ergebnis: " + datum);

        // Test 2: Schaltjahrprüfung
        Datum schaltjahr = new Datum(29, 2, 2024);
        System.out.println("Erwartet: true, Ergebnis: " + schaltjahr.istSchaltjahr());

        // Test 3: Datum von morgen
        Datum morgen = datum.morgen();
        System.out.println("Erwartet: 03.05.2025, Ergebnis: " + morgen);

        // Test 4: Datum von gestern
        Datum gestern = datum.gestern();
        System.out.println("Erwartet: 01.05.2025, Ergebnis: " + gestern);

        // Test 5: Wochentag
        System.out.println("Erwartet: Freitag, Ergebnis: " + datum.wochentag());

        // Test 6: Tageabstand
        Datum anderesDatum = new Datum(1, 1, 2025);
        System.out.println("Erwartet: 121, Ergebnis: " + datum.tageAbstand(anderesDatum));
    }
}