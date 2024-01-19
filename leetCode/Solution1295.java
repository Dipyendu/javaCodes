public class Solution1295 {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 0, -6, 7896 };
        System.out.println(findNumbers(nums));
        System.out.println(findNumbersByString(nums));
    }

    public static int findNumbers(int[] nums) {
        int result = 0;

        for (int index = 0; index < nums.length; index++) {

            int numberOfDigits = 0;
            int temp = nums[index];
            while (temp != 0) {
                temp /= 10;
                numberOfDigits++;
            }

            if ((numberOfDigits % 2 == 0) && (numberOfDigits != 0)) {
                result++;
            }
        }

        return result;
    }

    public static int findNumbersByString(int[] nums) {
        int result = 0;
        for (int index = 0; index < nums.length; index++) {
            int number;
            if (nums[index] < 0) {
                number = -(nums[index]);
            } else {
                number = nums[index];
            }
            String temp = String.valueOf(number);
            if (temp.length() % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
