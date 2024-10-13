public class Main {
    public static void main(String[] args) {

        // Initiallisieren der Zuege
        Zug zug = new Zug();
        Gueterzug gueterZug = new Gueterzug();
        Spezialzug spezialZug = new Spezialzug();
        Personenzug personenZug = new Personenzug();

        // Zug Wagon anzahl ausgeben
        System.out.println(zug.getWagons());

        // Gueterzug be/entladen
        gueterZug.beladen();
        gueterZug.entladen();

        // Spezialzug sichern
        spezialZug.sichern();

        // Ausgeben der Wagons des Personenzuges und Essen
        personenZug.essen();
        System.out.println(personenZug.getWagons());
    }
}
