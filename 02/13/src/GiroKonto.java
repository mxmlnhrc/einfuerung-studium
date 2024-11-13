public class GiroKonto extends Konto {
    public void einzahlen(float menge){
        kontostand += menge;
        System.out.println(kontostand);
    }
}
