public class GeldmarktKonto extends Konto {
    public void einzahlen(float menge){
        kontostand = kontostand + (menge*(int)(Math.random()*(20)-10));
    }
}
