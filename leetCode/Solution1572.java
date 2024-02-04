package leetCode;

public class Solution1572 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        System.out.println("Answer -> " + diagonalSum(matrix));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        // Primary Diagonal
        for (int i = 0; i < mat[0].length; i++) {
            sum += mat[i][i];
        }
        // Secondary Diagonal
        int mid = mat[0].length / 2;
        for (int i = mat[0].length - 1; i >= 0; i--) {
            if (((mat[0].length & 1) == 1) && i == mid) {
                continue;
            }
            sum += mat[mat[0].length - i - 1][i];
        }
        return sum;
    }
}
