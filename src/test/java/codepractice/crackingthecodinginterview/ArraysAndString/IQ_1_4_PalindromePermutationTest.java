package codepractice.crackingthecodinginterview.ArraysAndString;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ae_qu
 */
public class IQ_1_4_PalindromePermutationTest {
    
    public IQ_1_4_PalindromePermutationTest() {
    }

    @Test
    public void testIsPalindromePermutation() {
        System.out.println("isPalindromePermutation");
        String s = "Tact Coa";
        IQ_1_4_PalindromePermutation instance = new IQ_1_4_PalindromePermutation();
        boolean expResult = true;
        boolean result = instance.isPalindromePermutation(s);
        assertEquals(expResult, result);
    }
    
}
