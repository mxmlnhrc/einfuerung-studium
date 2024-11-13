public class Main {
    public static void main(String[] args) {
        for (int i = 0; i<=100; i++){
            System.out.print(i + " =>");
            for (int j = 2; j<=9; j++){
                if(i%j==0){
                    System.out.print(" "+j);
                }
            }
            System.out.println();
        }
    }
}