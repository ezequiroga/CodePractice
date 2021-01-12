/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codepractice.crackingthecodinginterview.ArraysAndString;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ae_qu
 */
public class IQ_1_2_CheckPermutationTest {
    
    public IQ_1_2_CheckPermutationTest() {
    }

    @Test
    public void testCheckPerutationSortingStringTrue() {
        System.out.println("checkPerutationSortingString - true");
        String s = "abc";
        String t = "bca";
        IQ_1_2_CheckPermutation instance = new IQ_1_2_CheckPermutation();
        boolean expResult = true;
        boolean result = instance.checkPerutationSortingString(s, t);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckPerutationSortingStringFalse() {
        System.out.println("checkPerutationSortingString - False");
        String s = "abc";
        String t = "bcd";
        IQ_1_2_CheckPermutation instance = new IQ_1_2_CheckPermutation();
        boolean expResult = false;
        boolean result = instance.checkPerutationSortingString(s, t);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckPermutationCharacterCountTrue() {
        System.out.println("checkPermutationCharacterCount - true");
        String s = "abc";
        String t = "bca";
        IQ_1_2_CheckPermutation instance = new IQ_1_2_CheckPermutation();
        boolean expResult = true;
        boolean result = instance.checkPermutationCharacterCount(s, t);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckPermutationCharacterCountFalse() {
        System.out.println("checkPermutationCharacterCount - false");
        String s = "abc";
        String t = "bda";
        IQ_1_2_CheckPermutation instance = new IQ_1_2_CheckPermutation();
        boolean expResult = false;
        boolean result = instance.checkPermutationCharacterCount(s, t);
        assertEquals(expResult, result);
    }
    
}
