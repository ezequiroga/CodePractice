package codepractice.crackingthecodinginterview.ArraysAndString;

/**
 * Given two strings, write a method to decide if one is a permutation of the
 * other.
 *
 * TIPS:
 * ** We should understand if the permutation comparison is case sensitive.
 * ** We should ask if whitespace is significant.
 * 
 * * We will assume for this problem that the comparison is case sensitive and
 * * whitespace is significant
 * 
 * Hints: #7, #84, #722, #737
 * 
 * @author ae_qu
 */
public class IQ_1_2_CheckPermutation {
    
    //My Solution
    public boolean checkPerutationSortingString(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
        
    }
    
    private String sort(String s){
        char[] sChar = s.toCharArray();
        java.util.Arrays.sort(sChar);
        return new String(sChar);
    }
    
    /**
     * Copied from the book - page 194.
     * We can also use the definition of a permutation - two words with the same
     * character counts.In your interview, you should always check with your interviewer about
     * the size of the character set.
     * 
     * 
     * @param s
     * @param t
     * @return 
     */
    public boolean checkPermutationCharacterCount(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        
        int[] letters = new int[128]; // Assumption: character set was ASCII
        char[] s_array = s.toCharArray();
        for(char c : s_array){
            letters[c]++;
        }
        
        for(int i = 0; i < t.length(); i++){
            int pos = (int) t.charAt(i);
            letters[pos]--;
            if (letters[pos] < 0){
                return false;
            }
        }
        return true;
    }
    
}
