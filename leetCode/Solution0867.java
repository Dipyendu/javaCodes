package leetCode;

import java.util.Arrays;

public class Solution0867 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Answer -> " + Arrays.deepToString(transpose(arr)));
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] resultMatrix = new int[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                resultMatrix[row][column] = matrix[column][row];
            }
        }
        return resultMatrix;
    }
}

// Example of how indexes change
// 00 01 02
// 10 11 12
// 20 21 22

// 00 10 20
// 01 11 21
// 02 12 22