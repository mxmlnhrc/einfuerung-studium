public class Rechner {
    private Form[] formen = new Form[20];

    public Rechner(){
        for(int i = 0; i < 20; i++){
             if(i<10){
                 formen[i] = new Kreis("grün", Math.round(Math.random() * 10));
             }
             else{
                 formen[i] = new Quadrat("rot", Math.round(Math.random() * 10));
             }
         }
    }

    public void printFlaechen(){
        for(int i = 0; i < 20; i++){
            System.out.println(formen[i].flaeche());
        }
    }

    public void printUmfaenge(){
        for(int i = 0; i < 20; i++){
            System.out.println(formen[i].umfang());
        }
    }

    public void printFarben(){
        for(int i = 0; i < formen.length; i++){
            System.out.println(formen[i].getFarbe());
        }
    }
}
