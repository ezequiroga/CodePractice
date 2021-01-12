/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codepractice.geeksforgeeks.TreeFromPreInOrder;

import codepractice.geeksforgeeks.TreeFromPreInOrder.Node;
import codepractice.geeksforgeeks.TreeFromPreInOrder.TreeFromPreInOrder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ae_qu
 */
public class TreeFromPreInOrderTest {
    
    public TreeFromPreInOrderTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of buildTree method, of class TreeFromPreInOrder.
     */
    @org.junit.jupiter.api.Test
    public void testBuildTree() {
        System.out.println("buildTree");
        char[] in = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' };
        char[] pre = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' };
        int inStrt = 0;
        int inEnd = in.length - 1;
        TreeFromPreInOrder instance = new TreeFromPreInOrder();
        //Node expResult = null;
        Node result = instance.buildTree(in, pre, inStrt, inEnd);
        
        instance.printInorder(result);
    }
    
}
