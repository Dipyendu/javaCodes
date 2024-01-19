// -> Time complexity -> O(n + m) or O(n+n) = O(2n) = O(n) in case of nXn matrix

// -> matrix is sorted row and column wise
// -> we start from row = 0 and column = n-1
// -> run a while loop while(row < n & column >= 0)
// -> 1. if target == arr[row][column] -> return new int[] {row, column}
// -> 2. if target > arr[row][column] -> row = row + 1
// -> 3. if target < arr[row][column] -> column = column - 1

package binarySearch;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] nums = {
                { 10, 20, 30, 40 },
                { 15, 25, 25, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        int target = 50;
        int[] ans = binarySearch2D(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] binarySearch2D(int[][] nums, int target) {
        if (nums.length == 0 || nums[0].length == 0) {
            return new int[] { -1, -1 }; // Empty matrix
        }

        int rows = nums.length;
        int cols = nums[0].length;

        int row = 0;
        int column = cols - 1;

        while (row < rows && column >= 0) {
            int currentElement = nums[row][column];

            if (target == currentElement) {
                return new int[] { row, column };
            } else if (target < currentElement) {
                column--;
            } else {
                row++;
            }

            // -> Check if the current row has enough columns
            if (row < rows && column < nums[row].length) {
                cols = nums[row].length;
                column = cols - 1;
            }
        }

        return new int[] { -1, -1 }; // -> Target not found
    }
}
