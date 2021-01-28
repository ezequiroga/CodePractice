package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

import java.util.HashSet;
import java.util.Set;

/**
 * Write code to remove duplicates from an unsorted linked list.
 * 
 * How would you solve this problem if a temporary buffer is not allowed?
 *
 * @author ae_qu
 */
public class IQ_2_1_RemoveDups {

    public void removeDups(MyLinkedList list){
        Set<Integer> repeteadValues = new HashSet<>();
        MyLinkedListNode prevNode = list.head;
        MyLinkedListNode currNode = list.head.next;
        repeteadValues.add(prevNode.data);
        while(currNode != null){
            if(repeteadValues.contains(currNode.data)){
                prevNode.next = currNode.next;
            } else {
                repeteadValues.add(currNode.data);
            }
            prevNode=currNode;
            currNode=currNode.next;
        }
    }
    
    /**
     * Solution copied from book.
     * 
     * Follow Up: No Buffer Allowed.
     * 
     * This code runs in O ( 1) space, but O ( N2) time.
     * 
     */
    public void removeDupsBook(MyLinkedList list){
        MyLinkedListNode currNode = list.head;
        while(currNode != null){
            MyLinkedListNode runner = currNode;
            while(runner.next != null){
                if (runner.next.data == currNode.data){
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            currNode = currNode.next; 
        }
    }
    
}
