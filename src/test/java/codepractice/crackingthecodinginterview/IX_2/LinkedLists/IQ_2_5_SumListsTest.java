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
    public void testSumList() {
        System.out.println("sumList");
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
        MyLinkedList result = instance.sumList(n1, n2);
        
        System.out.println(result);
        
        assertEquals(expResult.toString(), result.toString());
    }
    
}
