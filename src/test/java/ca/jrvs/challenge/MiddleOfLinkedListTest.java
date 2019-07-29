package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleOfLinkedListTest {

    LinkedListImp linkedList;
    MiddleOfLinkedList middle;
    @Before
    public void setUp() {
        linkedList = new LinkedListImp();
        middle = new MiddleOfLinkedList();
    }

    @Test
    public void middleElement() {
        linkedList.addAtHeadNode(4);
        linkedList.addAtTailNode(3);
        linkedList.addAtTailNode(6);
        linkedList.addAtTailNode(1);
        int size = linkedList.getListSize(linkedList.getHeadNode());
        int actMidElement = middle.middleElement(size,linkedList);
        int expMidElement = 6;
        assertEquals(expMidElement,actMidElement);
    }
}