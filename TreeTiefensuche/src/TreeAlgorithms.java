import java.util.List;

public class TreeAlgorithms {
    public static <T> void preorderTraversal(TreeNode<T> node, List<T> result) {
        if (node == null) {
            return;
        }
        // Aktuelles Element hinzufügen
        result.add(node.getElement());
        // Linken Teilbaum durchlaufen
        preorderTraversal(node.getLeft(), result);
        // Rechten Teilbaum durchlaufen
        preorderTraversal(node.getRight(), result);
    }
}