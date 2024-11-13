public class Dice {
    private int roll(){
        return (int)(Math.random()*6+1);
    }
    public void getNumber(){
        System.out.println(roll());
    }
}
