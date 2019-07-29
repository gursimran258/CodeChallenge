package ca.jrvs.challenge;

public class ReverseLinkedList extends LinkedListImp {

    /**
     * Reverse linked list from the input linked list
     * @param head
     * @return the reversed linked list
     */
    public Node reverseList(Node head) {
        Node prevNode = null;
        Node currNode = head;
        while (currNode!=null) {
            Node temp = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = temp;
        }
        return prevNode;
    }
}
