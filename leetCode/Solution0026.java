package leetCode;

import java.util.Arrays;

public class Solution0026 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Array before operation -> " + Arrays.toString(arr));
        System.out.println("Value of k -> " + removeDuplicates(arr));
        System.out.println("Array after operation -> " + Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j] && (j - i) == 1) {
                i++;
                j++;
            } else if (nums[i] == nums[j]) {
                j++;
            } else if (nums[i + 1] != nums[j] && nums[j] > nums[i]) {
                swap(nums, i + 1, j);
                i++;
                j++;
            }
        }
        return i + 1;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
