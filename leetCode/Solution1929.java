import java.util.Arrays;

public class Solution1929 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    static public int[] getConcatenation(int[] nums) {
        int[] arr = new int[(2 * nums.length)];
        for (int i = 0; i < nums.length; i++) {
            arr[i + nums.length] = arr[i] = nums[i];
        }
        return arr;
    }
}