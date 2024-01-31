package javaCore.recursion.arrays;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 0;
        int start = 0;
        int end = arr.length - 1;
        System.out.println("Answer -> " + binarySearch(arr, target, start, end));
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = start + (end - start) / 2;
        if (target == arr[middle]) {
            return middle;
        }
        if (target < arr[middle]) {
            return binarySearch(arr, target, start, middle - 1);
        }
        return binarySearch(arr, target, middle + 1, end);
    }
}
