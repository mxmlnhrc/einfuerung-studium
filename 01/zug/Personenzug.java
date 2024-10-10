public class Personenzug extends Zug{
    private int wagons = 10;
    
    Personenzug(){
        super();
        getWagons();
    }

    void essen(){
        System.out.println("Mampf Mampf");
    }
    
    public int getWagons() {
        return wagons;
    }
}
