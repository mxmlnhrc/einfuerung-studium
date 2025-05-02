// Auto.java
public class Auto {
    private String kennzeichen;
    private double kilometerstand;
    private double tankvolumen;        // max. Tankinhalt in Litern
    private double verbrauch;          // Verbrauch in Litern pro 100 km
    private double kraftstoffmenge;    // aktueller Füllstand in Litern

    // 1) Standard-Konstruktor (ohne Startwerte)
    public Auto() {
        this.kennzeichen = "";
        this.kilometerstand = 0.0;
        this.tankvolumen    = 50.0;
        this.verbrauch      = 6.0;
        this.kraftstoffmenge= 0.0;
    }

    // 2) Konstruktor mit Startwerten
    public Auto(String kennzeichen, double kilometerstand,
                double tankvolumen, double verbrauch, double kraftstoffmenge) {
        this.kennzeichen     = kennzeichen;
        this.kilometerstand  = kilometerstand;
        this.tankvolumen     = tankvolumen;
        this.verbrauch       = verbrauch;
        // Tankfüllung darf das Volumen nicht überschreiten
        this.kraftstoffmenge = Math.min(kraftstoffmenge, tankvolumen);
    }

    // 3) Getter für Kennzeichen, Kilometerstand und Tankvolumen
    public String getKennzeichen()   { return kennzeichen; }
    public double getKilometerstand(){ return kilometerstand; }
    public double getTankvolumen()   { return tankvolumen; }

    // 4) tanken(Menge) – füllt den Tank, kommentiert die Aktion
    public void tanken(double menge) {
        if (menge <= 0) {
            System.out.println("Ungültige Tankmenge: " + menge + " L");
            return;
        }
        double aufnahme = Math.min(menge, tankvolumen - kraftstoffmenge);
        kraftstoffmenge += aufnahme;
        System.out.printf("Getankt: %.2f L, neuer Füllstand: %.2f L%n",
                aufnahme, kraftstoffmenge);
        if (aufnahme < menge) {
            System.out.printf("Tank voll – %.2f L konnten nicht aufgenommen werden.%n",
                    menge - aufnahme);
        }
    }

    // 5) fahren(Strecke) – fährt so weit wie möglich, kommentiert die Aktion
    public void fahren(double strecke) {
        if (strecke <= 0) {
            System.out.println("Ungültige Fahrstrecke: " + strecke + " km");
            return;
        }
        double benoetigt = (verbrauch / 100.0) * strecke;
        if (kraftstoffmenge >= benoetigt) {
            kraftstoffmenge -= benoetigt;
            kilometerstand  += strecke;
            System.out.printf("Gefahren: %.2f km, Verbrauch: %.2f L, neuer Km-Stand: %.2f km, Rest-Sprit: %.2f L%n",
                    strecke, benoetigt, kilometerstand, kraftstoffmenge);
        } else {
            double moeglicheStrecke = (kraftstoffmenge / verbrauch) * 100.0;
            kilometerstand += moeglicheStrecke;
            System.out.printf(
                    "Nicht genug Sprit. Gefahren: %.2f km bis leer, neuer Km-Stand: %.2f km%n",
                    moeglicheStrecke, kilometerstand);
            kraftstoffmenge = 0.0;
        }
    }

    @Override
    public String toString() {
        return String.format("Auto %s: Km=%.2f, Verbrauch=%.2f L/100 km, Tank=%.2f/%.2f L",
                kennzeichen, kilometerstand, verbrauch,
                kraftstoffmenge, tankvolumen);
    }
}
