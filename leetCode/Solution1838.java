package leetCode;

import java.util.Arrays;

public class Solution1838 {
    public static void main(String[] args) {
        int[] nums = {9940, 9995, 9944, 9937, 9941, 9952, 9907, 9952, 9987, 9964, 9940, 9914, 9941, 9933, 9912, 9934, 9980, 9907, 9980, 9944, 9910, 9997};
        int k = 7925;
        System.out.println(maxFrequency(nums, k));
    }

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxFrequency = 0;
        int i = 0;
        while (i < n) {
            int have = 0;
            int currentK = k;
            int x = i - 1;
            while (x >= 0 && currentK >= 0) {
                if (nums[i] != nums[x]) {
                    if (currentK >= nums[i] - nums[x]) {
                        have++;
                    }
                    currentK = currentK - (nums[i] - nums[x]);
                    x--;
                } else if (nums[i] == nums[x]) {
                    have++;
                    x--;
                }
            }
            maxFrequency = Math.max(maxFrequency, have + 1);
            i++;
        }
        return maxFrequency;
    }
}
