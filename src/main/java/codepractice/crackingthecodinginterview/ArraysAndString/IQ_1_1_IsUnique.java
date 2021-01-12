package codepractice.crackingthecodinginterview.ArraysAndString;

import java.util.HashSet;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 * 
 * SOLUTION
 * 
 * You should first ask your interviewer if the string is an
 * ASCII string or a Unicode string -> DIFFERENCE?
 * 
 * ** bitwise operators?
 * 
 * Hints: #44, #7 7 7, #732
 * 
 * @author ae_qu
 */
public class IQ_1_1_IsUnique {
    
    public boolean isUnique1(String s){        
        HashSet<Character> sChar = new HashSet<>();
        char[] sArray = s.toCharArray();
        
        for(char c : sArray){
            if (sChar.contains(c)){
                return false;
            } else {
                sChar.add(c);
            }
        }
        
        return true;
        
    }
    
    public boolean isUnique2(String s){
        char[] sChar = s.toCharArray();
        
        for(char c : sChar){
            int firstPos = s.indexOf(c);
            if(s.indexOf(c,firstPos+1) >= 0){
                return false;
            }
        }
        
        return true;
        
    }
    
}
