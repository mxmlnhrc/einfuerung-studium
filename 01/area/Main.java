public class Main {
    public static void main(String[] args) {
        //Initialisieren der Klassen
        Quadrat quadrat = new Quadrat();
        Circle circle = new Circle();

        // Aufruf Quadrat
        quadrat.getArea();
        quadrat.getCircumference();
        //Aufruf Kreis
        circle.getArea();
        circle.getCircumference();
    }
}