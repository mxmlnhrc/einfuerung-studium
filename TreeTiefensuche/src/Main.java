import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listWalk = new ArrayList<>();
        TreeNode<String> baum = new TreeNode<>("A");
        baum.setLeft(new TreeNode<>("B"));
        baum.getLeft().setLeft(new TreeNode<>("D"));
        baum.getLeft().setRight(new TreeNode<>("E"));
        baum.setRight(new TreeNode<>("C"));
        baum.getRight().setLeft(new TreeNode<>("F"));
        baum.getRight().setRight(new TreeNode<>("G"));

        TreeAlgorithms.preorderTraversal(baum, listWalk);
        System.out.println(listWalk);
    }
}
