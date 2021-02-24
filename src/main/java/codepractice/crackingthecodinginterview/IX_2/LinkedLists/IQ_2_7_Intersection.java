package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

/**
 * Intersection: Given two (singly) linked lists, determine if the two lists
 * intersect. Return the intersecting node. Note that the intersection is
 * defined based on reference, not value. That is, if the kth node of the first
 * linked list is the exact same node (by reference) as the jth node of the
 * second linked list, then they are intersecting.
 *
 * @author ae_qu
 */
public class IQ_2_7_Intersection {
    
    /**
     * Assumption: L1 is always lager than or equal to l2.
     * 
     * NOTE: the solution in the book use functions to traverse both list for
     * getting the tail and the length of each one. I use the tail and length
     * attributes of my linked list implementation.
     * 
     * @param l1
     * @param l2
     * @return 
     */
    public MyLinkedListNode inserction(MyLinkedList l1, MyLinkedList l2){
        
        int diffSize = l1.size - l2.size;
        
        MyLinkedListNode currentL1 = l1.head;
        MyLinkedListNode currentL2 = l2.head;
        
        MyLinkedListNode intersectionNode = null;
        if (l1.tail != l2.tail){
            return intersectionNode;
        }       
        
        for (int i = 0; i < diffSize; i++) {
            currentL1 = currentL1.next;
        }
        
        while(currentL1 != null && currentL2 != null) {
            if (currentL1 == currentL2){
                intersectionNode = currentL1;
                break;
            }
            currentL1 = currentL1.next;
            currentL2 = currentL2.next;
        }
        
        return intersectionNode;
    }
    
}
