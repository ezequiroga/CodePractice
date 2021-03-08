package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

import java.util.HashSet;

/**
 * Given a circular linked list, implement an algorithm that returns the node at
 * the beginning of the loop.
 * 
 * DEFINITION Circular linked list: A (corrupt) linked list in which a node's
 * next pointer points to an earlier node, so as to make a loop in the linked
 * list.
 * 
 * EXAMPLE
 * Input: A - > B - > C - > D - > E - > C [the same C as earlier]
 * 
 * Output: C
 *
 * ****
 * Review the solution in the book. It is very important to understand the
 * implemented algorithm.
 * ****
 * 
 * @author ae_qu
 */
public class IQ_2_8_LoopDetection {
    
    public MyLinkedListNode loopDetection(MyLinkedList list) {
        MyLinkedListNode current = list.head;

        MyLinkedListNode repeatedNode = null;
        
        HashSet<MyLinkedListNode> prevNodes = new HashSet<>();
        
        while (current != null){
            if (prevNodes.contains(current)){
                repeatedNode = current;
                break;
            } else {
                prevNodes.add(current);
            }
            current = current.next;
        }
       return repeatedNode;
    }
    
}
