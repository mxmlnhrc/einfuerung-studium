public class Main {

    public static void main(String[] args) {

        // Initialliesieren der verschiedenen modelle
        Smartphone mySmartphone = new Smartphone();
        Mobile myMobile = new Mobile();

        // Smartphone aufrufen
        mySmartphone.dial();
        mySmartphone.ring();
        mySmartphone.listen();

        // Mobile aufrufen
        myMobile.dial();
        myMobile.ring();
        myMobile.listen();
        
        // Verbesserungs Idee
        // mySmartphone.call();
        // myMobile.call();

    }
}