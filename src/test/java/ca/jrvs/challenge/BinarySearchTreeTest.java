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
    public void size() {
        binarySearchTree.add(3);
        binarySearchTree.add(1);
        binarySearchTree.add(5);
        int expectedNodes =3;
        int actualNodes = binarySearchTree.size(binarySearchTree.getRoot());
        assertEquals(expectedNodes,actualNodes);
    }

    @Test
    public void clear() {
    }
}