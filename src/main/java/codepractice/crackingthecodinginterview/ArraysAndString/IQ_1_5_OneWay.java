package codepractice.crackingthecodinginterview.ArraysAndString;

import java.util.Arrays;
import java.util.List;

/**
 * There are three types of edits that can be performed on strings: insert a
 * character, remove a character, or replace a character. Given two strings,
 * write a function to check if they are one edit (or zero edits) away.
 * 
 * EXAMPLES
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 * 
 * Hints:#23, #97, #130
 *
 * @author ae_qu
 */
public class IQ_1_5_OneWay {
    
    public boolean isOneOrZeroEdit(String s, String t){
        
        if (java.lang.Math.abs(s.length() - t.length()) > 1){ //more than one removed char
            return false;
        }
        
        boolean isOneWay;
        if (s.length() >= t.length()) {
            isOneWay = isOneOrZero(s, t);
        } else {
            isOneWay = isOneOrZero(t, s);
        }
        
        return isOneWay;        
    }
    
    private boolean isOneOrZero(String largest, String shortest){
        int dif = 0;
        int newPos = 0;
        for (int i=0; i < shortest.length(); i++){
            if(largest.charAt(i+newPos) != shortest.charAt(i)){
                dif++;
                if (dif > 1) {
                    return false;
                }
                if(largest.length() != shortest.length()){
                    newPos++;
                }
            }
        }
        
        return true;
    }
    
}
