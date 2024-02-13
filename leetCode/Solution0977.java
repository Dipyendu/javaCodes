package leetCode;

import java.util.Arrays;

public class Solution0977 {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int start = 0;
        int end = arr.length - 1;
        int i = arr.length - 1;
        while (i >= 0) {
            if (Math.abs(nums[start]) < Math.abs(nums[end])) {
                arr[i] = nums[end] * nums[end];
                end--;
            } else {
                arr[i] = nums[start] * nums[start];
                start++;
            }
            i--;
        }
        return arr;
    }
}
