public class Fibonacci {
    int counter = 0;
    int limit = 10;
    int letzte = 0;
    int jetzt = 1;
    int res = jetzt + letzte;

    public void reset(){
        counter = 0;
        limit = 10;
        letzte = 0;
        jetzt = 1;
        res = jetzt + letzte;
    }

    public void folge(){
        if(counter <= limit-1){
            //System.out.println(res);
            res = jetzt + letzte;
            System.out.println(letzte + "+" + jetzt + " = " + res);
            letzte = jetzt;
            jetzt = res;
            counter++;
            folge();
        }
    }

    public void folge2(){
        reset();
        for(int i = 1; i <= limit; i++){
            res = jetzt + letzte;
            System.out.println(letzte + "+" + jetzt + " = " + res);
            letzte = jetzt;
            jetzt = res;
        }
    }
}
