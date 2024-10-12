import java.util.*;

public class leetcode73 {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 1, 0 }, { 3, 0, 5 }, { 7, 8, 9 } };
        System.out.println(Arrays.toString(setZeroes(matrix)));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j]+" " );
                 
            }
            System.out.println();
        }
    }

    static int[][] setZeroes(int matrix[][]) {
        int temp[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               temp[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < matrix[0].length; k++) {
                       temp[i][k] = matrix[i][j];
                        
                    }
                    for (int k = 0; k < matrix.length; k++) {
                       
                        temp[k][j] = matrix[i][j];
                    }

                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
        return matrix;
    }
}
