package javaCore.recursion.arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 7, 8, 9, 1, 2, 3};
        int target1 = 3;
        int[] arr2 = {7, 9, 11, 4, 3, 2, 1};
        int target2 = 7;
        System.out.println("Index -> " + rotatedBinarySearch(arr1, target1));
        System.out.println("Index -> " + rotatedBinarySearch(arr2, target2));
    }

    public static int rotatedBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        return helper(arr, target, start, end);
    }

    public static int helper(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target < arr[mid]) {
                return helper(arr, target, start, mid - 1);
            } else {
                return helper(arr, target, mid + 1, end);
            }
        } else { // [7, 9, 11, 4, 3, 2 ,1]
            if (target >= arr[start] && target > arr[mid]) {
                return helper(arr, target, start, mid - 1);
            } else {
                return helper(arr, target, mid + 1, end);
            }
        }
    }
}
