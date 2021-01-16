package codepractice.crackingthecodinginterview.ArraysAndString;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ae_qu
 */
public class IQ_1_6_Related_StringDecompressingTest {
    
    public IQ_1_6_Related_StringDecompressingTest() {
    }

    @Test
    public void testDecompressing() {
        System.out.println("decompressing");
        String s = "a2b1c5a3";
        IQ_1_6_Related_StringDecompressing instance = new IQ_1_6_Related_StringDecompressing();
        String expResult = "aabcccccaaa";
        String result = instance.decompressing(s);
        assertEquals(expResult, result);
    }
    
}
