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
public class IQ_1_8_ZeroMatrixTest {
    
    public IQ_1_8_ZeroMatrixTest() {
    }

    @Test
    public void testZeroMatrix() {
        System.out.println("zeroMatrix");
        int[][] matrix = {{1,2,0,4},{5,6,7,8},{9,10,11,12}};
        IQ_1_8_ZeroMatrix instance = new IQ_1_8_ZeroMatrix();
        int[][] expResult = {{0,0,0,0},{5,6,0,8},{9,10,0,12}};
        int[][] result = instance.zeroMatrix(matrix);
        assertArrayEquals(expResult, result);
    }
    
}
