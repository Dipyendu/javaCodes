package binarySearch;

import java.util.Arrays;

public class BinarySearchForStrictlyAscending2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int target = 6;

        System.out.println("Answer -> " + Arrays.toString(binarySearchForStrictlyAscending2DArray(matrix, target)));
    }

    // -> Search in the row provided among all the columns provided
    public static int[] binarySearch(int[][] matrix, int row, int columnStart, int columnEnd, int target) {
        while (columnStart <= columnEnd) {
            int columnMid = columnStart + (columnEnd - columnStart) / 2;

            if (target > matrix[row][columnMid]) {
                columnStart = columnMid + 1;
            } else if (target < matrix[row][columnMid]) {
                columnEnd = columnMid - 1;
            } else {
                return new int[] { row, columnMid };
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] binarySearchForStrictlyAscending2DArray(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length; // be cautious, matrix may be empty

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, columns - 1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int columnMid = (columns - 1) / 2;

        // -> run the loop till 2 rows are remaining
        while (rowStart < rowEnd - 1) { // while this is true it will have more than two rows
            int rowMid = rowStart + (rowEnd - rowStart) / 2;
            if (target > matrix[rowMid][columnMid]) {
                rowStart = rowMid;
            } else if (target < matrix[rowMid][columnMid]) {
                rowEnd = rowMid;
            } else {
                return new int[] { rowMid, columnMid };
            }
        }

        // -> now we have two rows
        // check whether the target is in the mid column of 2 rows
        if (target == matrix[rowStart][columnMid]) {
            return new int[] { rowStart, columnMid };
        }

        if (target == matrix[rowStart + 1][columnMid]) {
            return new int[] { rowStart + 1, columnMid };
        }

        // search in 1st half
        if (target <= matrix[rowStart][columnMid - 1]) {
            return binarySearch(matrix, rowStart, 0, columnMid - 1, target);
        }
        // search in 2nd half
        if (target >= matrix[rowStart][columnMid + 1] && target <= matrix[rowStart][columns - 1]) {
            return binarySearch(matrix, rowStart, columnMid + 1, columns - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rowStart + 1][columnMid - 1]) {
            return binarySearch(matrix, rowStart + 1, 0, columnMid - 1, target);
        }
        // search in 4th half
        else {
            return binarySearch(matrix, rowStart + 1, columnMid + 1, columns - 1, target);
        }
    }
}
