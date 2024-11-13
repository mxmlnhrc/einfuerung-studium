abstract class Konto {
    float kontostand;
    public void einzahlen(float menge){}

    public void auszahlen(float menge){
        kontostand -= menge;
    }

    public float auskunft(){
        return Math.round(this.kontostand);
    }
}
