package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {

    LinkedListImp linkedListImp;
    ReverseLinkedList reverseLinkedList;

    @Before
    public void setUp(){
        linkedListImp = new LinkedListImp();
        reverseLinkedList = new ReverseLinkedList();
    }

    //This test checks if linked list is reveresed and if tail is the new head in reversed list
    @Test
    public void reverseList() {
        linkedListImp.addAtHeadNode(2);
        linkedListImp.addAtTailNode(4);
        linkedListImp.addAtTailNode(5);
        linkedListImp.addAtTailNode(7);
        int expectedFirstNode = 7;
        LinkedListImp.Node node= reverseLinkedList.reverseList(linkedListImp.getHeadNode());
        int actualFirstNode = node.value;
        assertEquals(expectedFirstNode, actualFirstNode);
    }
}