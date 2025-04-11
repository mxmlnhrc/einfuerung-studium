public class Main {
    public static void main(String[] args) {
        // Initialisieren der HEAD-Node mit dem Wert "H"
        TreeNode<String> baum = new TreeNode<String>("H");
        // Nach Links unten gehen und den Wert "A" setzen
        baum.setLeft(new TreeNode<String>("A"));
        // Nach Links unten gehen und Links unten den Wert "L" setzen
        baum.getLeft().setLeft(new TreeNode<String>("L"));
        // Nach Links unten gehen und Rechts unten den Wert "L" setzen
        baum.getLeft().setRight(new TreeNode<String>("L"));
        // Nach Rechts unten gehen und den Wert "O" setzen
        baum.setRight(new TreeNode<String>("O"));

        // Jetzt die Baumstruktur ablaufen und die Werte jeweils ausgeben
        System.out.print(baum.getElement());
        System.out.print(baum.getLeft().getElement());
        System.out.print(baum.getLeft().getLeft().getElement());
        System.out.print(baum.getLeft().getRight().getElement());
        System.out.print(baum.getRight().getElement());
    }
}
