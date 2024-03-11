package leetCode;

public class Solution0004 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums = new int[n1 + n2];
        int n = nums.length;
        int k = 0;
        while (k < n) {
            if (i < n1 && j < n2 && nums1[i] <= nums2[j]) {
                nums[k] = nums1[i];
                i++;
                k++;
            } else if (i < n1 && j < n2 && nums1[i] > nums2[j]) {
                nums[k] = nums2[j];
                j++;
                k++;
            } else {
                while (i < n1) {
                    nums[k] = nums1[i];
                    i++;
                    k++;
                }
                while (j < n2) {
                    nums[k] = nums2[j];
                    j++;
                    k++;
                }
            }
        }
        double median;
        if (n % 2 == 0) {
            median = (double) (nums[n / 2 - 1] + nums[n / 2]) / 2;
        } else {
            median = nums[n / 2];
        }
        return median;
    }
}
