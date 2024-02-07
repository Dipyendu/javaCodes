package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Solution1380 {
    public static void main(String[] args) {
        int[][] matrix = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        System.out.println(luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();
        int[] rowMinimum = new int[matrix.length];
        int[] columnMaximum = new int[matrix[0].length];
//        finding minimum elements row wise
        for (int row = 0; row < matrix.length; row++) {
            int minimumNumberOfRow = matrix[row][0];
            for (int column = 1; column < matrix[row].length; column++) {
                if (matrix[row][column] < minimumNumberOfRow) {
                    minimumNumberOfRow = matrix[row][column];
                }
            }
            rowMinimum[row] = minimumNumberOfRow;
        }
//        now find the maximum elements column wise
        for (int column = 0; column < matrix[0].length; column++) {
            int maximumNumberOfColumn = matrix[0][column];
            for (int row = 1; row < matrix.length; row++) {
                if (matrix[row][column] > maximumNumberOfColumn) {
                    maximumNumberOfColumn = matrix[row][column];
                }
            }
            columnMaximum[column] = maximumNumberOfColumn;
        }
//        Compare rowMinimum and columnMaximum arrays to find lucky numbers
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                if (matrix[row][column] == rowMinimum[row] && matrix[row][column] == columnMaximum[column]) {
                    luckyNumbers.add(matrix[row][column]);
                }
            }
        }
        return luckyNumbers;
    }
}
// 00 01 02
// 10 11 12
// 20 21 22