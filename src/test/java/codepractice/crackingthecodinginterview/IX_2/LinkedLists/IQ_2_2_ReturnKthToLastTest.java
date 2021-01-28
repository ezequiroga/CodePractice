/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codepractice.crackingthecodinginterview.IX_2.LinkedLists;

import org.junit.Test;
import static org.junit.Assert.*;

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
        
        int kth = 4;
        IQ_2_2_ReturnKthToLast instance = new IQ_2_2_ReturnKthToLast();
        MyLinkedList expResult = new MyLinkedList();
        expResult.add(4);
        expResult.add(5);
        expResult.add(6);
        expResult.add(7);
        expResult.add(8);
        
        MyLinkedList result = instance.removeKthToLast(list, kth);
        assertEquals(expResult.size, result.size);
        assertEquals(expResult.toString(), result.toString());
    }
    
}
