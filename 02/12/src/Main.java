public class Main {
    public static void main(String[] args) {
        for(int i = 0; i<100; i++){
            int rand = (int)(Math.random()*(90-40)+40);
            if(rand%3==0){
                System.out.println(rand + " ist teilbar");
            } else {
                System.out.println(rand + " ist nicht teilbar");
            }
        }
    }
}
