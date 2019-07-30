package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTraversalTest {

    BinarySearchTree binarySearchTree;
    TreeTraversal treeTraversal;
    @Before
    public void setUp() {
        binarySearchTree = new BinarySearchTree();
        treeTraversal = new TreeTraversal();
    }

    @Test
    public void traversePreOrder() {
        binarySearchTree.add(6);
        binarySearchTree.add(4);
        binarySearchTree.add(3);
        binarySearchTree.add(5);
        binarySearchTree.add(8);
        binarySearchTree.add(7);
        treeTraversal.setBinarySearchTree();
      String treeTet = treeTraversal.traversePreOrder(binarySearchTree.getRoot());
    }

    @Test
    public void traversePostOrder() {
        binarySearchTree.add(6);
        binarySearchTree.add(4);
        binarySearchTree.add(3);
        binarySearchTree.add(5);
        binarySearchTree.add(8);
        binarySearchTree.add(7);
        treeTraversal.setBinarySearchTree();
        treeTraversal.traversePosOrcer(binarySearchTree.getRoot());
    }

    @Test
    public void traverseInOrder() {
        binarySearchTree.add(6);
        binarySearchTree.add(4);
        binarySearchTree.add(3);
        binarySearchTree.add(5);
        binarySearchTree.add(8);
        binarySearchTree.add(7);
        treeTraversal.setBinarySearchTree();
        treeTraversal.traverseInOrder(binarySearchTree.getRoot());
    }
}