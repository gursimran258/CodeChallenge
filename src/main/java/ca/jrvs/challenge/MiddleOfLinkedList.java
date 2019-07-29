package ca.jrvs.challenge;

public class MiddleOfLinkedList extends LinkedListImp {

    /**
     * Find the middle element of linkedlist, if there are two middle elements, it returns the later element of those middle elements
     * @param size
     * @param linkedList
     * @return the middle element
     */
    public int middleElement(int size, LinkedListImp linkedList) {

        if (size % 2 != 0) {
            int halfSize = size / 2;
            Node currentNode = linkedList.getHeadNode();
            for (int i = 0; i <= halfSize; i++)
                currentNode = currentNode.next;
            return currentNode.value;
        } else {
            int halfSize = (size - 1) / 2;
            Node currentNode = linkedList.getHeadNode();
            for (int i = 0; i <= halfSize; i++)
                currentNode = currentNode.next;
            return currentNode.next.value;
        }
    }
}




