package leetCode;

public class Solution0219 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (j - i < k) {
                j++;
            } else if (j - i == k) {
                i++;
                j = i + 1;
            }
            if (j < nums.length && nums[i] == nums[j]) {
                return true;
            }
        }
        return false;
    }
}
