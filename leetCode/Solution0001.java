package leetCode;

import java.util.Arrays;

public class Solution0001 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println("Brute Force Approach: " + Arrays.toString(twoSumBruteForce(nums, target)));
        System.out.println("Optimized Approach: " + Arrays.toString(twoSumOptimized(nums, target)));
    }

    public static int[] twoSumBruteForce(int[] nums, int target) { // very bad complexity -> O(n^2)
        for (int num1Index = 0; num1Index < nums.length; num1Index++) {
            for (int num2Index = 0; num2Index < nums.length; num2Index++) {
                if (num1Index != num2Index && (nums[num1Index] + nums[num2Index]) == target) {
                    return new int[]{num1Index, num2Index};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSumOptimized(int[] nums, int target) {
        return new int[]{-1, -1};
    }
}
