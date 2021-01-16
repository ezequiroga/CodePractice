package codepractice.crackingthecodinginterview.ArraysAndString;

/**
 * From a2blc5a3 to aabcccccaaa
 *
 * @author ae_qu
 */
public class IQ_1_6_Related_StringDecompressing {

    public String decompressing(String s){
        
        StringBuilder sBuilder = new StringBuilder();
        
        for (int i = 0; i < s.length(); i = i + 2){
            char currentChar = s.charAt(i);
            int cantChar = Character.getNumericValue(s.charAt(i+1));
            for (int  j = 0; j<cantChar; j++){
                sBuilder.append(currentChar);
            }
        }
        
        return sBuilder.toString();
    }
    
}
