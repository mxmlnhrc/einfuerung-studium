public class Kreis extends Form{
    private double radius;

    public Kreis(String farbe, double radius) {
        super(farbe);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double flaeche() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double umfang(){
        return Math.PI * radius * 2;
    }
}
