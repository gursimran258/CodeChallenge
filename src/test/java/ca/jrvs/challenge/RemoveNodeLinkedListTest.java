package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveNodeLinkedListTest {

    private LinkedListImp linkedList;
    private RemoveNodeLinkedList removeNodeLinkedList;

    @Before
    public void setUp() {
        linkedList = new LinkedListImp();
        removeNodeLinkedList = new RemoveNodeLinkedList();
    }

    @Test
    public void nodeRemoval() {
        linkedList.addAtHeadNode(4);
        linkedList.addAtTailNode(3);
        linkedList.addAtTailNode(6);
        linkedList.addAtTailNode(1);
        linkedList.addAtTailNode(9);
        linkedList.addAtTailNode(8);

        removeNodeLinkedList.nodeRemoval(linkedList.getHeadNode(), 4);
        int actualNodeValue = linkedList.getValue(3);
        int expectedNodeValue = 1;
        assertEquals(expectedNodeValue,actualNodeValue);
    }
}