package codepractice.crackingthecodinginterview.ArraysAndString;

import java.util.HashMap;

/**
 * Given a string, write a function to check if it is a permutation of a
 * palindrome. A palindrome is a word or phrase that is the same forwards and
 * backwards. A permutation is a rearrangement of letters. The palindrome does
 * not need to be limited to just dictionary words.
 * 
 * Hints: #106, #121, #134, #136
 * 
 * ** Solution #3 page: 197
 * ** Learn bit manipulation
 *
 * @author ae_qu
 */
public class IQ_1_4_PalindromePermutation {

    public boolean isPalindromePermutation(String s) {
        char[] sChar = s.toLowerCase().toCharArray();

        HashMap<Character, Integer> mapChar = new HashMap<>();

        for (char c : sChar) {
            if (c != ' ') {
                if (!mapChar.containsKey(c)) {
                    mapChar.put(c, 1);
                } else {
                    if (mapChar.get(c) > 0) {
                        mapChar.replace(c, mapChar.get(c) - 1);
                    } else {
                        mapChar.replace(c, mapChar.get(c) + 1);
                    }
                }
            }
        }

        int cantNoCero = 0;
        for (Integer val : mapChar.values()) {
            if (val != 0) {
                cantNoCero++;
            }
        }

        return cantNoCero < 2;

    }

}
