/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codepractice.crackingthecodinginterview.IX_1.ArraysAndString;

import codepractice.crackingthecodinginterview.IX_1.ArraysAndString.IQ_1_8_ZeroMatrix;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ae_qu
 */
public class IQ_1_8_ZeroMatrixTest {
    
    public IQ_1_8_ZeroMatrixTest() {
    }

    @Test
    public void testZeroMatrixOneZero() {
        System.out.println("zeroMatrix oneZero");
        int[][] matrix = {{1,2,0,4},{5,6,7,8},{9,10,11,12}};
        IQ_1_8_ZeroMatrix instance = new IQ_1_8_ZeroMatrix();
        int[][] expResult = {{0,0,0,0},{5,6,0,8},{9,10,0,12}};
        int[][] result = instance.zeroMatrix(matrix);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testZeroMatrixTwoZero() {
        System.out.println("zeroMatrix twoZero");
        int[][] matrix = {{1,2,0,4},{5,6,7,8},{9,0,11,12}};
        IQ_1_8_ZeroMatrix instance = new IQ_1_8_ZeroMatrix();
        int[][] expResult = {{0,0,0,0},{5,0,0,8},{0,0,0,0}};
        int[][] result = instance.zeroMatrix(matrix);
        assertArrayEquals(expResult, result);
    }
    
}
