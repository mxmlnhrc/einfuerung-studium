public class Main {
    public static void main(String[] args) {
        // Initialisieren der Disc's und Player
        Player player = new Player();
        DVD dvd = new DVD();
        Bluray bluray = new Bluray();

        // DVD spielen
        player.insertDisc(dvd);
        player.play();

        // Bluray spielen
        player.insertDisc(bluray);
        player.play();
    }
}
