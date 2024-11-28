public class Dice {
    int seiten;

    Dice(int seiten){
        this.seiten = seiten;
    }

    void roll(){
        System.out.println("Sie haben " +(int)(Math.random()*(this.seiten)+1)+ " Augen gewürfelt");
    }
}
