package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ae_qu
 */
public class IQ_2_8_LoopDetectionTest {
    
    public IQ_2_8_LoopDetectionTest() {
    }

    @Test
    public void testLoopDetection() {
        System.out.println("loopDetection");
        MyLinkedList list = new MyLinkedList();
        MyLinkedListNode n1 = new MyLinkedListNode(1);
        MyLinkedListNode n2 = new MyLinkedListNode(2);
        MyLinkedListNode n3 = new MyLinkedListNode(3);
        MyLinkedListNode n4 = new MyLinkedListNode(4);
        MyLinkedListNode n5 = new MyLinkedListNode(5);
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        list.add(n5);
        list.add(n3);
        IQ_2_8_LoopDetection instance = new IQ_2_8_LoopDetection();
        MyLinkedListNode expResult = n3;
        MyLinkedListNode result = instance.loopDetection(list);
        assertEquals(expResult, result);
    }

    @Test
    public void testLoopDetectionWithoutLoop() {
        System.out.println("testLoopDetectionWithoutLoop");
        MyLinkedList list = new MyLinkedList();
        MyLinkedListNode n1 = new MyLinkedListNode(1);
        MyLinkedListNode n2 = new MyLinkedListNode(2);
        MyLinkedListNode n3 = new MyLinkedListNode(3);
        MyLinkedListNode n4 = new MyLinkedListNode(4);
        MyLinkedListNode n5 = new MyLinkedListNode(5);
        MyLinkedListNode n6 = new MyLinkedListNode(6);
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        list.add(n5);
        list.add(n6);
        IQ_2_8_LoopDetection instance = new IQ_2_8_LoopDetection();
        MyLinkedListNode expResult = null;
        MyLinkedListNode result = instance.loopDetection(list);
        assertEquals(expResult, result);
    }
    
}
