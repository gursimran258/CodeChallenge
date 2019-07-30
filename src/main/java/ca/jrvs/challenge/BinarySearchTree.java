package ca.jrvs.challenge;

import java.util.Stack;

/**
 * Implementation of Binary Search Tree
 */
public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    //to check if BST is empty
    public boolean isEmpty() {
        return null == root;
    }

    //helper method to insert new node into the BST
    private Node addNode(Node current, int value) {
        if (current == null)
            return new Node(value);

        if (value < current.data) {
            current.left = addNode(current, value);
        } else if (value > current.data) {
            current.right = addNode(current, value);
        } else {
            return current;
        }
        return current;
    }

    //add node into the BST
    public void add(int value) {
        root = addNode(root, value);
    }

    //returns the size of binary search tee
    public int size() {
        Node current = root;
        int size = 0;
        Stack<Node> stack = new Stack<Node>();
        while (!stack.isEmpty() || current !=null) {
           if(current != null) {
            stack.push(current);
            current = current.left;
           } else {
               size++;
               current = stack.pop();
               current = current.right;
           }
        }
        return size;
    }

    //Java function to clear the binary search tree
    public void clear() {
        root = null;
    }

    private static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int value) {
            data = value;
            left = null;
            right = null;
        }
    }
}
