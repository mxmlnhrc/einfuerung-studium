public class Main {
    public static void main(String[] args) {
        Zug zug = new Zug();
        System.out.println(zug.getWagons());

        Gueterzug gueterZug = new Gueterzug();
        gueterZug.beladen();
        gueterZug.entladen();

        Spezialzug spezialZug = new Spezialzug();
        spezialZug.sicher();

        Personenzug personenZug = new Personenzug();
        System.out.println(personenZug.getWagons());
    }
}
