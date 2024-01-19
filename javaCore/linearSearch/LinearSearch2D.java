// -> Time Complexity -> O(n*m) -> n = rows m = columns

package linearSearch;

import java.util.Arrays;

public class LinearSearch2D {
    public static void main(String[] args) {
        int[][] nums = {
                { 1, 3, 4 },
                { 2, 8, 5 },
                { 6, 15, 76 },
                { 45, 35, 66 }
        };
        int target = 45;
        int[] ans = linearSearch2D(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] linearSearch2D(int[][] arr, int target) {
        // -> If it is an empty array return -1
        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }

        // -> Run a for loop for rows
        for (int row = 0; row < arr.length; row++) {
            // -> Check for every element column index if it is target
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row + 1, col + 1 };
                }
            }

        }
        // -> If the target is not found, return -1
        return new int[] { -1, -1 };
    }
}
