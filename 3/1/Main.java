public class Main {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
         int b = (int)(Math.random()*30 +1);
         if (b%5==0){
             System.out.println("Zahl "+b+" ist durch 5 teilbar");
         }else
         {
             System.out.println("Zahl "+b+" ist nicht durch 5 teilbar");
         }
        }
    }
}
