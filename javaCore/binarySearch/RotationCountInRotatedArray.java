package binarySearch;

public class RotationCountInRotatedArray {
    public static void main(String[] args) {
        int[] arr = { 15, 18, 2, 3, 6, 12 };
        System.out.println("Answer -> " + rotationCount(arr));
    }

    public static int rotationCount(int[] arr) {
        // -> just find the pivot index and add + 1 to the answer
        return findPivotWithDuplicates(arr) + 1;
    }

    public static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // -> if elements at middle, start and end are same just skip the duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // -> NOTE : what if these elements at start and end were the pivots

                // check if start is pivot
                if (start + 1 < arr.length && arr[start] > arr[start + 1]) {
                    return start;
                }
                start = start + 1;

                // -> check if end is pivot
                if (end > 0 && arr[end - 1] > arr[end]) {
                    return end - 1;
                }
                end = end - 1;
            }
            // -> left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
