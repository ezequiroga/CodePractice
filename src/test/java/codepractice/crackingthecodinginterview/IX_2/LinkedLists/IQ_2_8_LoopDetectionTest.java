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
        MyLinkedList list = null;
        IQ_2_8_LoopDetection instance = new IQ_2_8_LoopDetection();
        MyLinkedListNode expResult = null;
        MyLinkedListNode result = instance.loopDetection(list);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
