public class Player {
    // private instanz der IDisc
    private IDisc disc;

    public void insertDisc(IDisc disc){
        // privaten IDisc neuen Wert zuweisen
        this.disc = disc;
    }

    // abspielen der Disc
    public void play(){
        disc.search();
        disc.play();
    }
}
