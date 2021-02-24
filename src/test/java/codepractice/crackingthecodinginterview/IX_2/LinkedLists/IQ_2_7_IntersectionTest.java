package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ae_qu
 */
public class IQ_2_7_IntersectionTest {
    
    public IQ_2_7_IntersectionTest() {
    }

    @Test
    public void testInserction() {
        System.out.println("inserction");
        MyLinkedList l1 = new MyLinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        MyLinkedList l2 = new MyLinkedList();
        l2.add(7);
        l2.add(6);
        l2.add(5);
        
        MyLinkedListNode interNode = new MyLinkedListNode(4);
        
        l1.add(interNode);
        l2.add(interNode);
        
        IQ_2_7_Intersection instance = new IQ_2_7_Intersection();
        MyLinkedListNode expResult = interNode;
        MyLinkedListNode result = instance.inserction(l1, l2);
        assertEquals(expResult, result);
    }

    @Test
    public void testInserctionDifLength() {
        System.out.println("inserctionDifLength");
        MyLinkedList l1 = new MyLinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        MyLinkedList l2 = new MyLinkedList();
        l2.add(5);
        
        MyLinkedListNode interNode = new MyLinkedListNode(4);
        
        l1.add(interNode);
        l2.add(interNode);
        
        IQ_2_7_Intersection instance = new IQ_2_7_Intersection();
        MyLinkedListNode expResult = interNode;
        MyLinkedListNode result = instance.inserction(l1, l2);
        assertEquals(expResult, result);
    }

    @Test
    public void testInserctionDifLength2() {
        System.out.println("inserctionDifLength2");
        MyLinkedList l1 = new MyLinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        MyLinkedList l2 = new MyLinkedList();
        l2.add(5);
        
        MyLinkedList l3 = new MyLinkedList();
        l3.add(10);
        l3.add(11);
        l3.add(12);
        
        MyLinkedListNode interNode = l3.head;
        
        l1.add(l3.head);
        l2.add(l3.head);
        
        IQ_2_7_Intersection instance = new IQ_2_7_Intersection();
        MyLinkedListNode expResult = interNode;
        MyLinkedListNode result = instance.inserction(l1, l2);
        assertEquals(expResult, result);
    }

    @Test
    public void testInserctionFalse() {
        System.out.println("inserctionFalse");
        MyLinkedList l1 = new MyLinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        MyLinkedList l2 = new MyLinkedList();
        l2.add(7);
        l2.add(6);
        l2.add(5);
        
        IQ_2_7_Intersection instance = new IQ_2_7_Intersection();
        MyLinkedListNode expResult = null;
        MyLinkedListNode result = instance.inserction(l1, l2);
        assertEquals(expResult, result);
    }
    
}
