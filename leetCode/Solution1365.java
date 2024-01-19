import java.util.Arrays;

public class Solution1365 {
    public static void main(String[] args) {
        int[] arr = { 8, 1, 2, 2, 3 };
        System.out.println("Answer -> " + Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (currentNumber > nums[j]) {
                    count[i] = count[i] + 1;
                }
            }
        }
        return count;
    }
}
