package leetCode;

import java.util.Arrays;
import java.util.Hashtable;

public class Solution0001 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 7};
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

    public static int[] twoSumOptimized(int[] nums, int target) { // Time Complexity -> O(n) and Space Complexity -> O(n)
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            } else {
                hashtable.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
