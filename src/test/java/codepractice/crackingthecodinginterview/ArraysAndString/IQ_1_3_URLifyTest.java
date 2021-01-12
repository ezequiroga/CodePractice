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
public class IQ_1_3_URLifyTest {
    
    public IQ_1_3_URLifyTest() {
    }

    @Test
    public void testUrLify1() {
        System.out.println("urLify1");
        char[] str = "Mr John Smith    ".toCharArray();
        int trueLength = 13;
        IQ_1_3_URLify instance = new IQ_1_3_URLify();
        String expResult = "Mr%20John%20Smith";
        String result = instance.urLify(str, trueLength);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    @Test
    public void testUrLify2() {
        System.out.println("urLify2");
        char[] str = "Mr John Smit h      ".toCharArray();
        int trueLength = 15;
        IQ_1_3_URLify instance = new IQ_1_3_URLify();
        String expResult = "Mr%20John%20Smit%20h";
        String result = instance.urLify(str, trueLength);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
}
