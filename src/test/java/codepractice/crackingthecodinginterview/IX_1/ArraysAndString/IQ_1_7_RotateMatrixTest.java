/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codepractice.crackingthecodinginterview.IX_1.ArraysAndString;

import codepractice.crackingthecodinginterview.IX_1.ArraysAndString.IQ_1_7_RotateMatrix;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ae_qu
 */
public class IQ_1_7_RotateMatrixTest {
    
    public IQ_1_7_RotateMatrixTest() {
    }

    @Test
    public void testRotateMatrix() {
        System.out.println("rotateMatrix");
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        IQ_1_7_RotateMatrix instance = new IQ_1_7_RotateMatrix();
        int[][] expResult = {{16,15,14,13},{12,11,10,9},{8,7,6,5},{4,3,2,1}};
        int[][] result = instance.rotateMatrix(matrix);
        
        assertArrayEquals(expResult, result);
        
    }

    @Test
    public void testRotateMatrixInPlace() {
        System.out.println("rotateMatrixInPlace Even");
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        IQ_1_7_RotateMatrix instance = new IQ_1_7_RotateMatrix();
        int[][] expResult = {{16,15,14,13},{12,11,10,9},{8,7,6,5},{4,3,2,1}};
        int[][] result = instance.rotateMatrixInPlace(matrix);
        
        assertArrayEquals(expResult, result);
        
    }

    @Test
    public void testRotateMatrixInPlaceOdd () {
        System.out.println("rotateMatrixInPlace Odd");
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        IQ_1_7_RotateMatrix instance = new IQ_1_7_RotateMatrix();
        int[][] expResult = {{25,24,23,22,21},{20,19,18,17,16},{15,14,13,12,11},{10,9,8,7,6},{5,4,3,2,1}};
        int[][] result = instance.rotateMatrixInPlace(matrix);
        
        assertArrayEquals(expResult, result);
        
    }
    
}
