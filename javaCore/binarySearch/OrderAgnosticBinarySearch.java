package binarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 5, 8, 10, 12, 65, 67, 98 };
        int[] arr2 = { 98, 67, 65, 12, 10, 8, 5, 4, 2, 1 };
        int target = 98;
        System.out.println(orderAgnosticBinarySearch(arr1, target));
        System.out.println(orderAgnosticBinarySearch(arr2, target));
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        int count = 0;

        while (start <= end) {
            count++;
            System.out.println("while loop excuted " + count + " times");
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}