package codepractice.crackingthecodinginterview.ArraysAndString;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ae_qu
 */
public class IQ_1_1_IsUniqueTest {
    
    public IQ_1_1_IsUniqueTest() {
    }

    @Test
    public void testIsUnique1True() {
        System.out.println("isUnique1 - true");
        String s = "abcde";
        IQ_1_1_IsUnique instance = new IQ_1_1_IsUnique();
        boolean expResult = true;
        boolean result = instance.isUnique1(s);
        assertEquals(expResult, result);        
    }

    @Test
    public void testIsUnique1False() {
        System.out.println("isUnique1 - false");
        String s = "abcda";
        IQ_1_1_IsUnique instance = new IQ_1_1_IsUnique();
        boolean expResult = false;
        boolean result = instance.isUnique1(s);
        assertEquals(expResult, result);        
    }

    @Test
    public void testIsUnique2True() {
        System.out.println("isUnique2 - true");
        String s = "abcde";
        IQ_1_1_IsUnique instance = new IQ_1_1_IsUnique();
        boolean expResult = true;
        boolean result = instance.isUnique2(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsUnique2False() {
        System.out.println("isUnique2 - false");
        String s = "abcda";
        IQ_1_1_IsUnique instance = new IQ_1_1_IsUnique();
        boolean expResult = false;
        boolean result = instance.isUnique2(s);
        assertEquals(expResult, result);
    }
    
}
