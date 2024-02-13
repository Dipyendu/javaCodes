package leetCode;

import java.util.Arrays;

public class Solution0283 {
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));
        int[] nums2 = {0, 1, 0, 3, 12};
    }

    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[i] == 0 && nums[j] == 0) {
                j++;
            } else if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                i++;
            }
        }
    }
}
