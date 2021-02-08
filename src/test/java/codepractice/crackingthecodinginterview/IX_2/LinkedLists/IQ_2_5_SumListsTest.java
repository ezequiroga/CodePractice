package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ae_qu
 */
public class IQ_2_5_SumListsTest {
    
    public IQ_2_5_SumListsTest() {
    }

    @Test
    public void testSumListReverserOrder() {
        System.out.println("sumListReverserOrder");
        MyLinkedList n1 = new MyLinkedList();
        n1.add(7);
        n1.add(1);
        n1.add(6);
        MyLinkedList n2 = new MyLinkedList();
        n2.add(5);
        n2.add(9);
        n2.add(2);
        IQ_2_5_SumLists instance = new IQ_2_5_SumLists();
        MyLinkedList expResult = new MyLinkedList();
        expResult.add(2);
        expResult.add(1);
        expResult.add(9);
        MyLinkedList result = instance.sumListReverserOrder(n1, n2);
        
        System.out.println(result);
        
        assertEquals(expResult.toString(), result.toString());
    }

    @Test
    public void testSumListForwardOrder() {
        System.out.println("sumListForwardOrder");
        MyLinkedList n1 = new MyLinkedList();
        n1.add(6);
        n1.add(1);
        n1.add(7);
        MyLinkedList n2 = new MyLinkedList();
        n2.add(2);
        n2.add(9);
        n2.add(5);
        IQ_2_5_SumLists instance = new IQ_2_5_SumLists();
        MyLinkedList expResult = new MyLinkedList();
        expResult.add(9);
        expResult.add(1);
        expResult.add(2);
        MyLinkedList result = instance.sumListForwardOrder(n1, n2);
        
        System.out.println(result.toString());
        assertEquals(expResult.toString(), result.toString());
    }
    
}
