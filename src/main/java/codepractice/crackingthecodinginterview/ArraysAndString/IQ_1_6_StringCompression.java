package codepractice.crackingthecodinginterview.ArraysAndString;

/**
 * Implement a method to perform basic string compression using the counts of
 * repeated characters. For example, the string aabcccccaaa would become
 * a2blc5a3. If the "compressed" string would not become smaller than the
 * original string, your method should return the original string. You can
 * assume the string has only uppercase and lowercase letters (a - z).
 * 
 * @author ae_qu
 */
public class IQ_1_6_StringCompression {
    
    public String compres(String s){
        if (s == null || s.isEmpty()) return s;
        
        char[] sChar = s.toCharArray();
        
        char lastChar = sChar[0];
        int cantCurrentChar = 0;
        StringBuilder sBuilder = new StringBuilder();
        for(char c : sChar){
            if (c != lastChar){
                sBuilder.append(lastChar).append(Integer.toString(cantCurrentChar));
                if(sBuilder.length() > s.length()) return s;
                cantCurrentChar = 1;
            } else {
                cantCurrentChar++;
            }
            lastChar = c;
        }
        
        sBuilder.append(lastChar).append(Integer.toString(cantCurrentChar));
        
        return sBuilder.length() < s.length() ? sBuilder.toString() : s;
    }
    
}
