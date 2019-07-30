package ca.jrvs.challenge;


public class RemoveNodeLinkedList extends LinkedListImp {
   private LinkedListImp linkedListImp;

    /**
     * Removes nth node from the end of the Linkedlist
      * @param head
     * @param n
     * @return
     */

public Node nodeRemoval(Node head, int n) {
    linkedListImp = new LinkedListImp();
    int size = linkedListImp.getListSize(head);
    int nodePos = size-n+1;
    Node currNode = head;
    for(int i = 1 ; i<nodePos; i++){
        currNode = currNode.next;
    }
    currNode.next  = currNode.next.next;
    return currNode;
}

}
