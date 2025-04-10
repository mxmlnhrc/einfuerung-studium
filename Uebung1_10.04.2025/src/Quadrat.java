public class Quadrat extends Form{
    private double kantenLaenge;

    public Quadrat (String farbe, double kantenLaenge){
        super(farbe);
        this.kantenLaenge = kantenLaenge;
    }

    public double getKantenLaenge() {
        return kantenLaenge;
    }

    public void setKantenLaenge(double kantenLaenge) {
        this.kantenLaenge = kantenLaenge;
    }

    @Override
    public double flaeche() {
        return kantenLaenge * kantenLaenge;
    }

    @Override
    public double umfang() {
        return 4 * kantenLaenge;
    }
}
