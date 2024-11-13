public class Main {
    public static void main(String[] args) {
        // Initialisieren der Figuren
        Quadrat quadrat = new Quadrat();
        Circle circle = new Circle();

        // Quadrat aufrufen
        quadrat.getArea();
        quadrat.getCircumference();

        // Kreis aufrufen
        circle.getArea();
        circle.getCircumference();
    }
}