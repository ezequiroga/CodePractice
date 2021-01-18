package codepractice.crackingthecodinginterview.ArraysAndString;

/**
 * Zero Matrix: Write an algorithm such that if an element in an MxN matrix is
 * 0, its entire row and column are set to 0.
 *
 * @author ae_qu
 */
public class IQ_1_8_ZeroMatrix {
    
    public int[][] zeroMatrix(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[][] mWithZeros = new int[m][n];
        
        for(int i = 0; i<m; i++){
            for(int j=0; j<n; j++){
                if (matrix[i][j] == 0){
                    mWithZeros = zeroRowCol(mWithZeros,i,j,m,n);
                }
            }
        }
        return mWithZeros;
    }
    
    private int[][] zeroRowCol(int[][] matrix, int row, int col, int m, int n){
        
        for(int i=0; i<n;i++){
            matrix[row][i] = 0;
        }
        for(int i=0; i<m; i++){
            matrix[i][col] = 0;
        }
        
        return matrix; 
    }
    
}
