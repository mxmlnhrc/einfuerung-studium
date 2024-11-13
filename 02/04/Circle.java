public class Circle implements IFigure {

    int r = 2;
    public void getArea() {
        System.out.println(Math.PI * r * r);
    }

    public void getCircumference() {
        System.out.println(2*Math.PI*r);
    }
    
}
