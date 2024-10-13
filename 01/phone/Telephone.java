public abstract class Telephone {

    // Verbesserungs Idee
    // void call() {
    //     dial();
    //     ring();
    //     listen();
    // }

    abstract void dial();
    public void ring(){
        System.out.println("Ring Ring");
    }
    
    public void listen(){
        System.out.println("Bla Bla Bla");
    }
}
