package javaCore.recursion.backTracking;

public class CountingPaths {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {1, 2, 3}};
        int[] current = {0, 0};
        int[] target = {1, 2};
        System.out.println(count(matrix, current[0], current[1], target[0], target[1]));
    }

    //    Diagonal is not added
    public static int count(int[][] matrix, int currentRow, int currentColumn, int targetRow, int targetColumn) {
        if (currentRow == targetRow && currentColumn == targetColumn) {
            return 1;
        }
        int left = 0;
        int right = 0;
        int count;
//        Left-Up & Up
        if (currentRow > targetRow && currentColumn >= targetColumn) {
            count = leftUp(matrix, currentRow, currentColumn, targetRow, targetColumn, left, right);
        }
//        Right-Up & Right
        else if (currentRow >= targetRow && currentColumn < targetColumn) {
            count = rightUp(matrix, currentRow, currentColumn, targetRow, targetColumn, left, right);
        }
//        Right-Down & Down
        else if (currentRow < targetRow && currentColumn <= targetColumn) {
            count = rightDown(matrix, currentRow, currentColumn, targetRow, targetColumn, left, right);
        }
//        Left-Down & Left
        else {
            count = leftDown(matrix, currentRow, currentColumn, targetRow, targetColumn, left, right);
        }
        return count;
    }

    public static int leftUp(int[][] matrix, int currentRow, int currentColumn, int targetRow, int targetColumn, int left, int right) {
        if (currentRow == targetRow && currentColumn == targetColumn) {
            return 1;
        }
        if (currentColumn == 0) {
            left = leftUp(matrix, currentRow - 1, currentColumn, targetRow, targetColumn, left, right);
        } else if (currentRow == 0) {
            right = leftUp(matrix, currentRow, currentColumn - 1, targetRow, targetColumn, left, right);
        } else if (currentColumn == targetColumn) { // UpSide
            right = leftUp(matrix, currentRow - 1, currentColumn, targetRow, targetColumn, left, right);
        } else {
            left = leftUp(matrix, currentRow - 1, currentColumn, targetRow, targetColumn, left, right);
            right = leftUp(matrix, currentRow, currentColumn - 1, targetRow, targetColumn, left, right);
        }
        return left + right;
    }

    public static int rightUp(int[][] matrix, int currentRow, int currentColumn, int targetRow, int targetColumn, int left, int right) {
        if (currentRow == targetRow && currentColumn == targetColumn) {
            return 1;
        }
        if (currentColumn == matrix[0].length - 1) {
            left = rightUp(matrix, currentRow - 1, currentColumn, targetRow, targetColumn, left, right);
        } else if (currentRow == 0) {
            right = rightUp(matrix, currentRow, currentColumn + 1, targetRow, targetColumn, left, right);
        } else if (currentRow == targetRow) { // Right Side
            right = leftUp(matrix, currentRow, currentColumn + 1, targetRow, targetColumn, left, right);
        } else {
            left = rightUp(matrix, currentRow - 1, currentColumn, targetRow, targetColumn, left, right);
            right = rightUp(matrix, currentRow, currentColumn + 1, targetRow, targetColumn, left, right);
        }
        return left + right;
    }

    public static int rightDown(int[][] matrix, int currentRow, int currentColumn, int targetRow, int targetColumn, int left, int right) {
        if (currentRow == targetRow && currentColumn == targetColumn) {
            return 1;
        }
        if (currentColumn == matrix[0].length - 1) {
            left = rightDown(matrix, currentRow + 1, currentColumn, targetRow, targetColumn, left, right);
        } else if (currentRow == matrix.length - 1) {
            right = rightDown(matrix, currentRow, currentColumn + 1, targetRow, targetColumn, left, right);
        } else if (currentColumn == targetColumn) { // Downside
            right = leftUp(matrix, currentRow + 1, currentColumn, targetRow, targetColumn, left, right);
        } else {
            left = rightDown(matrix, currentRow + 1, currentColumn, targetRow, targetColumn, left, right);
            right = rightDown(matrix, currentRow, currentColumn + 1, targetRow, targetColumn, left, right);
        }
        return left + right;
    }

    public static int leftDown(int[][] matrix, int currentRow, int currentColumn, int targetRow, int targetColumn, int left, int right) {
        if (currentRow == targetRow && currentColumn == targetColumn) {
            return 1;
        }
        if (currentColumn == 0) {
            left = leftDown(matrix, currentRow + 1, currentColumn, targetRow, targetColumn, left, right);
        } else if (currentRow == matrix.length - 1) {
            right = leftDown(matrix, currentRow, currentColumn - 1, targetRow, targetColumn, left, right);
        } else if (currentColumn == targetColumn) { // Left side
            right = leftUp(matrix, currentRow, currentColumn - 1, targetRow, targetColumn, left, right);
        } else {
            left = leftDown(matrix, currentRow + 1, currentColumn, targetRow, targetColumn, left, right);
            right = leftDown(matrix, currentRow, currentColumn - 1, targetRow, targetColumn, left, right);
        }
        return left + right;
    }
}
