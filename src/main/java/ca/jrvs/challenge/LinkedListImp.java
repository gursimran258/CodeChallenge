package ca.jrvs.challenge;

/**
 * Design implementation of Linkedlist where new node can be added at the head, tail, and at the nth index.
 * Implementation to get the value at nth index at node and to delete the node at nth index.
 */
public class LinkedListImp {
    private Node headNode;
    private int value;
    private static int size;

    public LinkedListImp() {
        this.headNode = new Node(0);
        this.size = 0;
    }

    //add a node at the begining of the linked list before the head node
    public void addAtHeadNode(int value) {
        Node presentNode = new Node(value);
        presentNode.next = headNode.next;
        headNode.next = presentNode;
        size++;
    }

    public Node getHeadNode() {
        return headNode;
    }
    //add a node at the end of the linked list after the tail node
    public void addAtTailNode(int value) {
        Node newtNode = new Node(value);
        Node currentNode = headNode.next;
        int i = 1;
        while(currentNode.next!=null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newtNode;
        size++;
    }

    //add a node of value n at nth index of the linked list
    public void addAtNthIndex(int value, int index) {
        Node newNode = new Node(value);
        Node currentNode = headNode;

        for (int i = 1; i < index; i++) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        size++;
    }

    //delete a node at nth index of linkedlist
    public void deleteAtNthIndex(int index) {
        Node currentNode = headNode;

        for (int i = 1; i < index; i++) {
            currentNode = currentNode.next;
        }

        Node nodeDelete = currentNode.next;
        currentNode.next = nodeDelete.next;
        size--;
    }

    //get value at nth index
    public int getValue(int index) {
        int i = 0;
        Node currentNode = headNode.next;
        if (index > size)
            throw new IllegalArgumentException("Invalid argument");

        for (int j = 1; j < index; j++) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    /**
     * Linked list size using iteration that iterates till it finds the null node on which it returns the
     * size of linked list.
     * @return size of linked list
     */
    //get size of linkedlist iteratively
    public int getListSize(Node headNode){
        int listSize = 0;
        Node currentNode = headNode;
        while(currentNode.next!=null) {
            currentNode=currentNode.next;
            listSize++;
        }
        return listSize;
    }

    /**
     * Linked list size using recursion
     * @param current node
     * @return size of linked list
     */
    public int getListSize_Rec(Node current){
        int listSize = 0;
        if(current == null)
            return 0;

    return 1+getListSize_Rec(current.next);
    }

    public class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}


