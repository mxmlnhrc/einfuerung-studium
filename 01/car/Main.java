public class Main {
    public static void main(String[] args) {
        // Initialisieren der Autos
        FastCar fastCar = new FastCar();
        FutureCar futureCar = new FutureCar();

        // FastCar öffnen und fahren
        fastCar.open();
        fastCar.drive();

        // FutureCar öffnen und fahren
        futureCar.open();
        futureCar.drive();
    }
}
