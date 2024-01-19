package linearSearch;

public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 44, 5, 6, 78, 98, 643 };
        int target = 44;
        int start = 1;
        int end = 5;
        int ans = linearSearchInRange(nums, target, start, end);
        System.out.println(ans);
    }

    static int linearSearchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // -> Run a for loop
        for (int index = start; index < end; index++) {
            // -> Check for every element index if it is target
            int element = arr[index];
            if (element == target) {
                return index + 1;
            }
        }
        // -> If the target is not found, return -1
        return -1;
    }
}
