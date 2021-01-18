package codepractice.crackingthecodinginterview.ArraysAndString;

/**
 * Rotate Matrix: Given an image represented by an NxN matrix, where each pixel
 * in the image is 4 bytes, write a method to rotate the image by 90 degrees.
 * Can you do this in place?
 *
 * @author ae_qu
 */
public class IQ_1_7_RotateMatrix {
 
    /**
     * Using an aux matrix to return the rotated original matrix
     */
    public int[][] rotateMatrix(int[][] matrix){
        int m = matrix.length;
        
        int[][] newM = new int[m][m];
        
        for (int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                newM[(m-1)-i][(m-1)-j] = matrix[i][j];
            }
        }
        
        return newM;
        
    }
 
    /**
     * Rotate in place
     */
    public int[][] rotateMatrixInPlace(int[][] matrix){
        int m = matrix.length;
        int midCol = m/2 + m%2;
        
        for (int i=0; i<(m/2 + m%2); i++){
            //if m is odd, the mid row must be traveled to the mid
            int maxJ = m%2 > 0 && i == midCol - 1 ? midCol : m;
            
            for(int j=0; j<maxJ; j++){
                int valToSwap = matrix[i][j];
                int valToSwap2 = matrix[(m-1)-i][(m-1)-j];
                
                matrix[(m-1)-i][(m-1)-j] = valToSwap;
                matrix[i][j] = valToSwap2;
            }
        }
        
        return matrix;
        
    }
    
}
