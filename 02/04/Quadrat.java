public class Quadrat implements IFigure {
    int a = 2;
    public void getArea(){
        System.out.println(a*a);
    }    
    public void getCircumference(){
        System.out.println(4*a);
    }
}