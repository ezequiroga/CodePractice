package codepractice.crackingthecodinginterview.IX_1.ArraysAndString;

import codepractice.crackingthecodinginterview.IX_1.ArraysAndString.IQ_1_6_StringDecompressing_Related;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ae_qu
 */
public class IQ_1_6_StringDecompressing_RelatedTest {
    
    public IQ_1_6_StringDecompressing_RelatedTest() {
    }

    @Test
    public void testDecompressing() {
        System.out.println("decompressing");
        String s = "a2b1c5a3";
        IQ_1_6_StringDecompressing_Related instance = new IQ_1_6_StringDecompressing_Related();
        String expResult = "aabcccccaaa";
        String result = instance.decompressing(s);
        assertEquals(expResult, result);
    }
    
}
