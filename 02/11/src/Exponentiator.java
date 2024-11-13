public class Exponentiator {
    int base = (int)(Math.random()*100-50);
    int wert = 0;
    public void exponentiate() {
        if(wert<6){
            System.out.println(base + " ^ " + wert + " = " + (int)(Math.pow(base,wert)));
            wert++;
            exponentiate();
        }
    }
}