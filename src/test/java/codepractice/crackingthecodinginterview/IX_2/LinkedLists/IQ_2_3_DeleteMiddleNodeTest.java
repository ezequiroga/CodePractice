package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ae_qu
 */
public class IQ_2_3_DeleteMiddleNodeTest {
    
    public IQ_2_3_DeleteMiddleNodeTest() {
    }

    @Test
    public void testDeleteMiddleNode() {
        System.out.println("deleteMiddleNode");
        MyLinkedList actual = new MyLinkedList();
        actual.add(1);
        actual.add(2);
        actual.add(3);
        actual.add(4);
        actual.add(5);
        actual.add(6);
        actual.add(7);
        actual.add(8);
        
        MyLinkedList expeted = new MyLinkedList();
        expeted.add(1);
        expeted.add(2);
        expeted.add(3);
        expeted.add(5);
        expeted.add(6);
        expeted.add(7);
        expeted.add(8);
        
        MyLinkedListNode nodeToDelete = actual.getByData(4);
        
        IQ_2_3_DeleteMiddleNode instance = new IQ_2_3_DeleteMiddleNode();
        
        instance.deleteMiddleNode(nodeToDelete);
        
        assertEquals(expeted.toString(), actual.toString());
    }
    
}
