public class LohnAbrechnung extends Abrechnung {
    private double stundenlohn;
    private double stunden;

    public LohnAbrechnung(Mitarbeiter m, double stundenlohn, double stunden) {
        super(m);
        this.stundenlohn = stundenlohn;
        this.stunden = stunden;
    }

    @Override
    public double getVerdienst() {
        return stundenlohn * stunden;
    }
}
