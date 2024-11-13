public class Main {
    public static void main(String[] args) {
        while(true){
           int a = (int)(Math.random() * (101-30)+30);
          if (a % 7 == 0){
              System.out.println(a);
               break;
           }
        }
    }
}
