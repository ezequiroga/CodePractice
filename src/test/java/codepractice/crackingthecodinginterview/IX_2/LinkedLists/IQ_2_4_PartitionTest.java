package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ae_qu
 */
public class IQ_2_4_PartitionTest {
    
    public IQ_2_4_PartitionTest() {
    }

    @Test
    public void testPartition() {
        System.out.println("partition");
        MyLinkedList list = new MyLinkedList();
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(10);
        list.add(2);
        list.add(1);
        int x = 5;
        IQ_2_4_Partition instance = new IQ_2_4_Partition();        
        
        MyLinkedList expResult = new MyLinkedList();
        expResult.add(3);
        expResult.add(2);
        expResult.add(1);
        expResult.add(5);
        expResult.add(8);
        expResult.add(5);
        expResult.add(10);
        
        MyLinkedList result = instance.partition(list, x);
        System.out.println(result.toString());

        assertEquals(expResult.toString(), result.toString());

    }

    @Test
    public void testPartitionOneList() {
        System.out.println("partitionOneList");
        MyLinkedList list = new MyLinkedList();
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(10);
        list.add(2);
        list.add(1);
        int x = 5;
        IQ_2_4_Partition instance = new IQ_2_4_Partition();        
        
        MyLinkedList expResult = new MyLinkedList();
        expResult.add(1);
        expResult.add(2);
        expResult.add(3);
        expResult.add(5);
        expResult.add(8);
        expResult.add(5);
        expResult.add(10);
        
        MyLinkedList result = instance.partitionOneList(list, x);
        System.out.println(result.toString());
        
        assertEquals(expResult.toString(), result.toString());
    }
    
}
