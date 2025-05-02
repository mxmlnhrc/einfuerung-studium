public class Datum {
    private int tag;
    private int monat;
    private int jahr;

    // Array mit Längen der Monate (nicht Schaltjahr)
    private static final int[] MONATSLAENGEN = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] Wochentage = {"Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};

    // Konstruktor
    public Datum(int tag, int monat, int jahr) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    @Override
    public String toString() {
        return String.format("%02d.%02d.%04d", tag, monat, jahr);
    }

    // Prüft, ob das Jahr dieses Datums ein Schaltjahr ist
    public boolean istSchaltjahr() {
        return (jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0);
    }

    // Gibt die Anzahl der Tage im aktuellen Monat zurück (berücksichtigt Schaltjahr)
    private int tageImMonat(int monat, int jahr) {
        if (monat == 2 && istSchaltjahr()) {
            return 29;
        }
        return MONATSLAENGEN[monat];
    }

    // Datum von morgen
    public Datum morgen() {
        return plusTage(1);
    }

    // Datum von gestern
    public Datum gestern() {
        return plusTage(-1);
    }

    // Datum um n Tage verschoben
    public Datum plusTage(int n) {
        int neuerTag = tag + n;
        int neuerMonat = monat;
        int neuesJahr = jahr;

        while (neuerTag > tageImMonat(neuerMonat, neuesJahr)) {
            neuerTag -= tageImMonat(neuerMonat, neuesJahr);
            neuerMonat++;
            if (neuerMonat > 12) {
                neuerMonat = 1;
                neuesJahr++;
            }
        }

        while (neuerTag < 1) {
            neuerMonat--;
            if (neuerMonat < 1) {
                neuerMonat = 12;
                neuesJahr--;
            }
            neuerTag += tageImMonat(neuerMonat, neuesJahr);
        }

        return new Datum(neuerTag, neuerMonat, neuesJahr);
    }

    // Abstand in Tagen bis zu anderem Datum
    public int tageAbstand(Datum d) {
        return this.tageSeitFixdatum() - d.tageSeitFixdatum();
    }

    // Hilfsroutine: Berechnet die Tage seit einem Fixdatum (z.B. 01.01.0001)
    private int tageSeitFixdatum() {
        int tage = tag;

        // Addiere Tage der vergangenen Monate im aktuellen Jahr
        for (int i = 1; i < monat; i++) {
            tage += tageImMonat(i, jahr);
        }

        // Addiere Tage der vergangenen Jahre
        for (int i = 1; i < jahr; i++) {
            tage += (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) ? 366 : 365;
        }

        return tage;
    }

    // Wochentag als String
    public String wochentag() {
        // Berechne Wochentag über tageAbstand zum bekannten Sonntag
        int tageSeitSonntag = tageAbstand(new Datum(1, 1, 1)); // 01.01.0001 war ein Sonntag
        return Wochentage[((tageSeitSonntag % 7 + 7) % 7) + 1];
    }

    public static void main(String[] args) {
        Datum heute = new Datum(2, 5, 2025);
        System.out.println("Heute: " + heute);
        System.out.println("Morgen: " + heute.morgen());
        System.out.println("Gestern: " + heute.gestern());
    }
}
