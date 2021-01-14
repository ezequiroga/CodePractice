package codepractice.crackingthecodinginterview.ArraysAndString;

/**
 * Write a method to replace all spaces in a string with '%20'. You may assume
 * that the string has sufficient space at the end to hold the additional
 * characters, and that you are given the "true" length of the string. (Note: If
 * implementing in Java, please use a character array so that you can perform
 * this operation in place.)
 * 
 * EXAMPLE
 * Input: "Mr John Smith    ", 13 
 * Output: "Mr%20John%20Smith"
 *
 * Hints: #53, # 118
 * 
 * @author ae_qu
 */
public class IQ_1_3_URLify {
    
    /**
     * Without using trueLength.
     * 
     * @param str
     * @param trueLength
     * @return 
     */
    //My Solution
    public String urLify(char[] str, int trueLength){
        int lastChar = 0;
        for(int i = str.length-1; i>=0; i--){
            if (str[i] != ' '){
                lastChar = i;
                break;
            }
        }
        
        for (int j = 0; j < str.length; j++) {
            if (str[j] == ' '){                
                for (int h = lastChar; h > j; h--){
                   str[h+2] = str[h]; 
                }
                lastChar += 2;
                str[j] = '%';
                str[j+1] = '2';
                str[j+2] = '0';
            }
        }
        
        return new String(str);
    }
    
    
    
    
}
