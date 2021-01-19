package codepractice.crackingthecodinginterview.ArraysAndString;

/**
 * String Rotation: Assume you have a method isSubstring which checks if
 * one word is a substring of another. Given two strings, s1 and s2, write code
 * to check if s2 is a rotation of s1 using only one call to isSubstring (e.g.,
 * "waterbottle" is a rotation of "erbottlewat")
 *
 * @author ae_qu
 */
public class IQ_1_9_StringRotation {
    
    public boolean isStringRotation(String s1, String s2){
        char lastCharS1 = s1.charAt(s1.length()-1);
        
        System.out.println("lastCharS1: " + lastCharS1);
        
        int idx = s1.indexOf(lastCharS1);
        
        return isSubstring(s1, s2.substring(idx-1));
    }
    
    private boolean isSubstring(String s1, String s2){
        return s1.contains(s2);
    }
    
}
