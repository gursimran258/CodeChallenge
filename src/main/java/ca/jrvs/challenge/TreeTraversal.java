package ca.jrvs.challenge;
import ca.jrvs.challenge.BinarySearchTree;

public class TreeTraversal extends BinarySearchTree {

    private BinarySearchTree binarySearchTree;
    private String dataStr ;

    public void setBinarySearchTree() {
        binarySearchTree = new BinarySearchTree();
    }

    public String traversePreOrder(Node node) {
        Node curr = node;
        if (curr != null) {
            System.out.println(" " + curr.data);
            this.dataStr = this.dataStr + " " + curr.data;
            traversePreOrder(curr.left);
            traversePreOrder(curr.right);
            System.out.println(this.dataStr);
            return this.dataStr;
        }
         return  "";
    }

    public void traversePosOrcer(Node node) {
        String dataString = "";
        Node curr = node;
        if (curr != null) {
            traversePosOrcer(node.left);
            traversePosOrcer(node.right);
            System.out.println(" " + node.data);
        }
    }

    public void traverseInOrder(Node node) {
        Node curr = node;
        if (curr != null) {
            traverseInOrder(node.left);
            System.out.println(" " + node.data);
            traverseInOrder(node.right);
        }
    }
}
