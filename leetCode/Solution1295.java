package leetCode;

public class Solution1295 {
    public static void main(String[] args) {
        int[] nums = {12, 345, 1, 6, 7896};
        System.out.println(findNumbersBruteForce(nums));
        System.out.println(findNumbersByString(nums));
        System.out.println(findNumbers(nums));
    }

    public static int findNumbersBruteForce(int[] nums) { // very bad complexity => O(n*k)[k = average number of digits of each element]
        int result = 0;

        for (int num : nums) {

            int numberOfDigits = 0;
            int temp = num;
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
        for (int num : nums) {
            int number;
            if (num < 0) {
                number = -num;
            } else {
                number = num;
            }
            String temp = String.valueOf(number);
            if (temp.length() % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int number : nums) {
            int numberOfDigits = (int) Math.log10(number);
            if ((numberOfDigits & 1) == 1) {
                count++;
            }
        }
        return count;
    }
}
