public class TagesgeldKonto extends Konto {
    public void einzahlen(float menge){
        if(kontostand < 1000){
            kontostand += menge * 1.1;
        }else if (kontostand >= 1000 && kontostand < 3000 ) {
            kontostand += menge * 1.2;
        }else if (kontostand >= 3000 && kontostand < 10000 ) {
            kontostand += menge * 1.3;
        }else{
            kontostand += menge;
        }
    }
}
