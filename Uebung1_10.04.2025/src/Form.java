public abstract class Form {
    private String farbe;

    public Form(String farbe) {
        this.farbe = farbe;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public abstract double flaeche();
    public abstract double umfang();
}
