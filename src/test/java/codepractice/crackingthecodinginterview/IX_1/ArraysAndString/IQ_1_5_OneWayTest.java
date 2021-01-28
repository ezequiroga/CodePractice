/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codepractice.crackingthecodinginterview.IX_1.ArraysAndString;

import codepractice.crackingthecodinginterview.IX_1.ArraysAndString.IQ_1_5_OneWay;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ae_qu
 */
public class IQ_1_5_OneWayTest {
    
    public IQ_1_5_OneWayTest() {
    }

    @Test
    public void testIsOneOrZeroEdit1() {
        System.out.println("isOneOrZeroEdit1");
        String s = "pale";
        String t = "ple";
        IQ_1_5_OneWay instance = new IQ_1_5_OneWay();
        boolean expResult = true;
        boolean result = instance.isOneOrZeroEdit(s, t);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsOneOrZeroEdit2() {
        System.out.println("isOneOrZeroEdit2");
        String s = "pales";
        String t = "pale";
        IQ_1_5_OneWay instance = new IQ_1_5_OneWay();
        boolean expResult = true;
        boolean result = instance.isOneOrZeroEdit(s, t);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsOneOrZeroEdit3() {
        System.out.println("isOneOrZeroEdit3");
        String s = "pale";
        String t = "bale";
        IQ_1_5_OneWay instance = new IQ_1_5_OneWay();
        boolean expResult = true;
        boolean result = instance.isOneOrZeroEdit(s, t);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsOneOrZeroEdit4() {
        System.out.println("isOneOrZeroEdi4");
        String s = "pale";
        String t = "bake";
        IQ_1_5_OneWay instance = new IQ_1_5_OneWay();
        boolean expResult = false;
        boolean result = instance.isOneOrZeroEdit(s, t);
        assertEquals(expResult, result);
    }
    
}
