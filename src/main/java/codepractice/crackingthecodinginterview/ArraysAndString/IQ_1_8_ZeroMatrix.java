package codepractice.crackingthecodinginterview.ArraysAndString;

import java.util.HashSet;

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
        
        HashSet<Integer> colsWithZeros = new HashSet<>();
        for(int i = 0; i<m; i++){
            for(int j=0; j<n; j++){
                if (matrix[i][j] == 0 && !colsWithZeros.contains(j)){
                    matrix = zeroRowCol(matrix,i,j,m,n);
                    colsWithZeros.add(j);
                    break;
                }
            }
        }
        return matrix;
    }
    
    private int[][] zeroRowCol(int[][] mat, int row, int col, int m, int n){
        
        for(int i=0; i<n;i++){
            mat[row][i] = 0;
        }
        for(int i=0; i<m; i++){
            mat[i][col] = 0;
        }
        
        return mat; 
    }
    
}
