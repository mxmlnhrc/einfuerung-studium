public class Player {
    // private instanz der IDisc
    private IDisc disc;

    public void insertDisc(IDisc disc){
        // private IDisc neuen Wert zuweisen
        this.disc = disc;
    }

    // abspielen
    public void play(){
        disc.search();
        disc.play();
    }
}
