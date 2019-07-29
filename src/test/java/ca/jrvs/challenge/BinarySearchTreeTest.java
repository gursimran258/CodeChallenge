package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    BinarySearchTree binarySearchTree;

    @Before
    public void setup() {
        binarySearchTree = new BinarySearchTree();
    }

    @Test
    public void add() {
        binarySearchTree.add(3);
        binarySearchTree.add(5);
        binarySearchTree.add(6);
    }

    @Test
    public void size() {
    }

    @Test
    public void clear() {
    }
}