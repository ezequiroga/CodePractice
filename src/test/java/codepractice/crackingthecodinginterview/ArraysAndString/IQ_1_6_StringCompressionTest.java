package codepractice.crackingthecodinginterview.ArraysAndString;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ae_qu
 */
public class IQ_1_6_StringCompressionTest {
    
    public IQ_1_6_StringCompressionTest() {
    }

    @Test
    public void testCompresReturnCompress() {
        System.out.println("compres return compress");
        String s = "aabcccccaaa";
        IQ_1_6_StringCompression instance = new IQ_1_6_StringCompression();
        String expResult = "a2b1c5a3";
        String result = instance.compres(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompresReturnInput() {
        System.out.println("compres return input");
        String s = "abcdefg";
        IQ_1_6_StringCompression instance = new IQ_1_6_StringCompression();
        String expResult = "abcdefg";
        String result = instance.compres(s);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompresReturnEmpty() {
        System.out.println("compres return empty");
        String s = "";
        IQ_1_6_StringCompression instance = new IQ_1_6_StringCompression();
        String expResult = "";
        String result = instance.compres(s);
        assertEquals(expResult, result);
    }
    
}
