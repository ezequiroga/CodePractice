package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author ae_qu
 */
public class IQ_2_2_ReturnKthToLastTest {
    
    public IQ_2_2_ReturnKthToLastTest() {
    }

    @Test
    public void testRemoveKthToLast() {
        System.out.println("removeKthToLast");
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        
        int kth = 2;
        IQ_2_2_ReturnKthToLast instance = new IQ_2_2_ReturnKthToLast();
        MyLinkedList expResult = new MyLinkedList();
        expResult.add(7);
        expResult.add(8);
        
        MyLinkedList result = instance.returnKthToLast(list, kth);
        assertEquals(expResult.size, result.size);
        assertEquals(expResult.toString(), result.toString());
    }

    @Test
    public void testRemoveKthToLast2() {
        System.out.println("removeKthToLast2");
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        
        int kth = 2;
        IQ_2_2_ReturnKthToLast instance = new IQ_2_2_ReturnKthToLast();
        MyLinkedList expResult = new MyLinkedList();
        expResult.add(7);
        expResult.add(8);
        
        MyLinkedList result = instance.returnKthToLast2(list, kth);
        assertEquals(expResult.size, result.size);
        assertEquals(expResult.toString(), result.toString());
    }

    @Test
    public void testRemoveKthToLast3() {
        System.out.println("removeKthToLast3");
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        
        int kth = 2;
        IQ_2_2_ReturnKthToLast instance = new IQ_2_2_ReturnKthToLast();
        MyLinkedList expResult = new MyLinkedList();
        expResult.add(7);
        expResult.add(8);
        
        MyLinkedList result = instance.returnKthToLast3(list, kth);
        assertEquals(expResult.size, result.size);
        assertEquals(expResult.toString(), result.toString());
    }

    @Test
    public void testRemoveKthToLastBook() {
        System.out.println("testRemoveKthToLastBook");
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        
        int kth = 2;
        IQ_2_2_ReturnKthToLast instance = new IQ_2_2_ReturnKthToLast();
        MyLinkedList expResult = new MyLinkedList();
        expResult.add(7);
        expResult.add(8);
        
        MyLinkedList result = instance.returnKthToLastBook(list, kth);
        assertEquals(expResult.size, result.size);
        assertEquals(expResult.toString(), result.toString());
    }
    
}
