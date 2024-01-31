package javaCore.recursion.arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 8, 8, 12, 15};
        System.out.println(isAscendingSorted(nums));
    }

    public static boolean isAscendingSorted(int[] arr) {
        return checkAscendingSorted(arr, 0);
    }

    private static boolean checkAscendingSorted(int[] arr, int index) {

        if (index == arr.length - 1) {
            // Reached the end of the array without finding any inconsistencies
            return true;
        }

        return (arr[index] <= arr[index + 1]) && checkAscendingSorted(arr, index + 1);
    }
}
