public class Main {
    public static void main(String[] args) {
        //Initialisieren
        GiroKonto giro = new GiroKonto();
        GeldmarktKonto gmk = new GeldmarktKonto();
        TagesgeldKonto tgk = new TagesgeldKonto();

        for(int a = 0; a < 100; a++) {
            int aktion = (int)(Math.random()*(6)+1);
            int gWert = (int)(Math.random()*(501)+0);

            switch (aktion) {
                case 1:
                    giro.einzahlen(gWert);
                    break;
                case 2:
                    giro.auszahlen(gWert);
                    break;
                case 3:
                    gmk.einzahlen(gWert);
                    break;
                case 4:
                    gmk.auszahlen(gWert);
                    break;
                case 5:
                    tgk.einzahlen(gWert);
                    break;
                case 6:
                    tgk.auszahlen(gWert);
            } //ENDE switch
        } //ENDE for
        System.out.println("Girokonto: " + giro.auskunft());
        System.out.println("GeldmarktKonto: " + gmk.auskunft());
        System.out.println("TagesgeldKonto: " + tgk.auskunft());

    }
}
