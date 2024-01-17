package linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 44, 5, 6, 78, 98, 643 };
        int target = 44;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // -> Run a for loop
        for (int index = 0; index < arr.length; index++) {
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
