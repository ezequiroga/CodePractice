package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

/**
 * Implement an algorithm to delete a node in the middle (i.e., any node but the
 * first and last node, not necessarily the exact middle) of a singly linked
 * list, given only access to that node.
 *
 * EXAMPLE
 *
 * input: the node c from the linked list a -> b -> c -> d -> e -> f Result:
 * nothing is returned, but the new linked list looks like a -> b -> d ->e -> f
 * 
 * NOTE FROM BOOK: if the node is the last, it would not be able to deleted
 *
 * @author ae_qu
 */
public class IQ_2_3_DeleteMiddleNode {

    public void deleteMiddleNode(MyLinkedListNode nodeToDelete) {
        if(nodeToDelete != null && nodeToDelete.next != null){            
            MyLinkedListNode curr = nodeToDelete.next;
            nodeToDelete.data = curr.data;
            nodeToDelete.next = curr.next;
        }
    }

}
