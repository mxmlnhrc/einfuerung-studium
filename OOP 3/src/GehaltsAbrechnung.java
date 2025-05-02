public class GehaltsAbrechnung extends Abrechnung {
    private double gehalt;

    public GehaltsAbrechnung(Mitarbeiter m, double gehalt) {
        super(m);
        this.gehalt = gehalt;
    }

    @Override
    public double getVerdienst() {
        return gehalt;
    }
}
