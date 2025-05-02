public abstract class Abrechnung {
    private static int naechstePeriode = 1;
    private final int periode;
    private final Mitarbeiter mitarbeiter;

    public Abrechnung(Mitarbeiter m) {
        this.mitarbeiter = m;
        this.periode = naechstePeriode++;
    }

    public int getPeriode() {
        return periode;
    }

    public Mitarbeiter getMitarbeiter() {
        return mitarbeiter;
    }

    public abstract double getVerdienst();

    @Override
    public String toString() {
        return "Periode: " + periode +
                ", Mitarbeiter: " + mitarbeiter.getName() +
                ", Verdienst: " + getVerdienst();
    }
}
