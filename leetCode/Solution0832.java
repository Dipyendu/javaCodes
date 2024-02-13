package leetCode;

import java.util.Arrays;

public class Solution0832 {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        System.out.println(Arrays.deepToString(image));
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            for (int column = 0; column < (row.length + 1) / 2; column++) {
                // swap
                int temp = row[column] ^ 1;
                row[column] = row[row.length - column - 1] ^ 1;
                row[row.length - column - 1] = temp;
            }
        }
        return image;
    }
}
