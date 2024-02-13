// -> {1,1,2,3,3,4,4,8,8}
// -> 11 is in pair and arr[0] = arr[1]
// -> mid is even and equal to its next element then the answer is present after it
// -> mid is odd and equal to the number before it then answer is present after it
// -> else answer is either mid or present before mid which disturbed the order

package leetCode;

public class Solution0540 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println("Answer -> " + singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + ((right - left) / 2);
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1]))
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
    }
}
