package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;
import sun.awt.image.ImageWatched;

import static org.junit.Assert.*;

public class LinkedListImpTest {
    private LinkedListImp linkedListImp;

    @Before
    public void setup() {
    linkedListImp = new LinkedListImp();
    }

    @Test
    public void addAtHeadNode() {
        linkedListImp.addAtHeadNode(4);
        int expectedValue = 4;
        int actualValue = linkedListImp.getValue(1);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void addAtTailNode() {
        linkedListImp.addAtHeadNode(4);
        linkedListImp.addAtTailNode(5);
        int expectedValue = 5;
        int actualValue= linkedListImp.getValue(linkedListImp.getListSize());
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void addAtNthIndex() {
        linkedListImp.addAtHeadNode(4);
        linkedListImp.addAtTailNode(5);
        linkedListImp.addAtNthIndex(3,2);
        linkedListImp.addAtNthIndex(5,2);
        linkedListImp.addAtNthIndex(6,3);
        int expectedValue = 6;
        int actualValue = linkedListImp.getValue(3);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void deleteAtNthIndex() {
        linkedListImp.addAtHeadNode(4);
        linkedListImp.addAtTailNode(5);
        linkedListImp.addAtNthIndex(3,2);
        linkedListImp.deleteAtNthIndex(2);
        int expectedValue = 5;
        int actualValue = linkedListImp.getValue(2);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void getValue() {
        linkedListImp.addAtHeadNode(4);
        linkedListImp.addAtTailNode(5);
        linkedListImp.addAtNthIndex(3,2);
        linkedListImp.addAtNthIndex(5,2);
        linkedListImp.addAtNthIndex(6,3);
        int expectedValue = 5;
        int actualValue = linkedListImp.getValue(2);
        assertEquals(expectedValue,actualValue);
    }
}