package leetCode;

public class Solution0074 {
    public static void main(String[] args) {
        int[][] matrix = {
                {-10, -8},
                {-6, -5},
                {-2, -2},
                {-1, 0},
                {3, 4},
                {7, 7},
                {8, 9},
                {10, 10},
                {11, 11},
                {12, 14},
                {15, 16},
                {17, 19},
                {20, 21},
                {22, 22},
                {25, 27},
                {28, 30},
                {32, 32},
                {35, 36}
        };
        int target = 16;
        System.out.println("Answer -> " + searchMatrix(matrix, target));
    }

    // -> Search in the row provided among all the columns provided
    public static boolean binarySearch(int[][] matrix, int row, int columnStart, int columnEnd, int target) {

        boolean found;
        while (columnStart <= columnEnd) {
            int columnMid = columnStart + (columnEnd - columnStart) / 2;

            if (target > matrix[row][columnMid]) {
                columnStart = columnMid + 1;
            } else if (target < matrix[row][columnMid]) {
                columnEnd = columnMid - 1;
            } else {
                found = true;
                return found;
            }
        }
        found = false;
        return found;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean found;
        int rows = matrix.length;
        int columns = matrix[0].length; // be cautious, matrix may be empty

        // check if the matrix has only 1 row and do a normal binary search from start
        // to end column of the row
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
                found = true;
                return found;
            }
        }

        // -> now we have two rows

        // if the matrix has only 1 column only two elements remaining so check whether
        // target is equal to them else return false

        if (columns == 1) {
            if (target == matrix[rowStart][columnMid]) {
                found = true;
                return found;
            } else if (target == matrix[rowStart + 1][columnMid]) {
                found = true;
                return found;
            } else {
                found = false;
                return found;
            }
        }

        // for matrix with multi columns check whether the target is in the mid-column
        // of 2 rows
        if (target == matrix[rowStart][columnMid]) {
            found = true;
            return found;
        }

        if (target == matrix[rowStart + 1][columnMid]) {
            found = true;
            return found;
        }

        // search in 1st half
        if (columnMid != 0 && target <= matrix[rowStart][columnMid - 1]) {
            return binarySearch(matrix, rowStart, 0, columnMid - 1, target);
        }
        // search in 2nd half
        if (target >= matrix[rowStart][columnMid + 1] && target <= matrix[rowStart][columns - 1]) {
            return binarySearch(matrix, rowStart, columnMid + 1, columns - 1, target);
        }
        // search in 3rd half
        if (columnMid != 0 && target <= matrix[rowStart + 1][columnMid - 1]) {
            return binarySearch(matrix, rowStart + 1, 0, columnMid - 1, target);
        }
        // search in 4th half
        else {
            return binarySearch(matrix, rowStart + 1, columnMid + 1, columns - 1, target);
        }
    }
}
