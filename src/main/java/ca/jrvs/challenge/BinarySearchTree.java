package ca.jrvs.challenge;

import java.util.Stack;

/**
 * Implementation of Binary Search Tree
 */
public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public Node getRoot() {
        return this.root;
    }

    public int getValue(Node node) {
        return node.data;
    }
    //to check if BST is empty
    public boolean isEmpty() {
        return null == this.root;
    }

    //helper method to insert new node into the BST
    private Node addNode(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.data) {
            current.left = addNode(current.left,value);
        } else if (value > current.data) {
            current.right = addNode(current.right,value);
        } else {
            return current;
        }

        return current;
    }

    //add node into the BST
    public void add(int value) {
        this.root = addNode(this.root, value);
    }

    //returns the size of binary search tee
    public int size(Node node) {
        if(node== null)
            return 0;
        else
            return (size(node.left)+1+size(node.right));
    }

    //Java function to clear the binary search tree
    public void clear() {
        root = null;
    }

    protected class Node {
        protected int data;
        protected Node left;
        protected Node right;

        public Node(int value) {
            this.data = value;
            left = null;
            right = null;
        }
    }
}
