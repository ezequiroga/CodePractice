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
        MyLinkedList l1 = null;
        MyLinkedList l2 = null;
        IQ_2_7_Intersection instance = new IQ_2_7_Intersection();
        MyLinkedListNode expResult = null;
        MyLinkedListNode result = instance.inserction(l1, l2);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
