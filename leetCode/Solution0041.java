// -> Start checking from 1
// -> does 1 exist? yes -> does 2 exist? no -> ans
// -> Ignore the elements that are < 0 and > n while sorting

public class Solution0041 {
    public static void main(String[] args) {
        int[] nums = { 1, 1 };
        System.out.println("Answer -> " + firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (i != correctIndex && nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return nums.length + 1;

    }
}
