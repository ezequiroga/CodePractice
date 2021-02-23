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
public class IQ_2_6_PalindromeTest {
    
    public IQ_2_6_PalindromeTest() {
    }

    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome - even - true");
        MyLinkedList list = new MyLinkedList();
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(4);
        IQ_2_6_Palindrome instance = new IQ_2_6_Palindrome();
        boolean expResult = true;
        boolean result = instance.isPalindrome(list);
        assertEquals(expResult, result);
        
        System.out.println("isPalindrome - even - false");
        list = new MyLinkedList();
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(3);
        expResult = false;
        result = instance.isPalindrome(list);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsPalindromeOdd() {
        System.out.println("isPalindrome - odd - true");
        MyLinkedList list = new MyLinkedList();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(4);
        IQ_2_6_Palindrome instance = new IQ_2_6_Palindrome();
        boolean expResult = true;
        boolean result = instance.isPalindrome(list);
        assertEquals(expResult, result);
        
        System.out.println("isPalindrome - odd - false");
        list = new MyLinkedList();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        expResult = false;
        result = instance.isPalindrome(list);
        assertEquals(expResult, result);
    }
    
}
