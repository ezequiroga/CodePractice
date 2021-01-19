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
public class IQ_1_9_StringRotationTest {
    
    public IQ_1_9_StringRotationTest() {
    }

    @Test
    public void testIsStringRotation() {
        System.out.println("isStringRotation");
        String s1 = "erbottlewat";
        String s2 = "waterbottle";
        IQ_1_9_StringRotation instance = new IQ_1_9_StringRotation();
        boolean expResult = true;
        boolean result = instance.isStringRotation(s1, s2);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsRotation() {
        System.out.println("isStringRotation");
        String s1 = "erbottlewat";
        String s2 = "waterbottle";
        IQ_1_9_StringRotation instance = new IQ_1_9_StringRotation();
        boolean expResult = true;
        boolean result = instance.isRotation(s1, s2);
        assertEquals(expResult, result);
    }
    
}
