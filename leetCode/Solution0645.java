import java.util.Arrays;

public class Solution0645 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };
        System.out.println("Answer -> " + Arrays.toString(findErrorNums(nums)));
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (i != correctIndex && nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (i != (nums[i] - 1)) {
                return new int[] { nums[i], i + 1 };
            }
        }

        return new int[] { -1, -1 };
    }

}
