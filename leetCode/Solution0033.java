// -> Rotated Sorted Array -> [2, 4, 5, 7, 8, 9, 10, 12] -> [12, 2, 4, 5, 7, 8, 9, 10] -> [10, 12, 2, 4, 5, 7, 8, 9]

// -> 1. Find the pivot in the sorted array
// -> pivot = from where your next numbers are ascending
// -> 2. apply binary search for the 2 arrays

public class Solution0033 {
    public static void main (String[] args) {
        int[] arr = { 4,5,6,7,0,1,2 };
        int target = 0;
        System.out.println("Answer -> " + search(arr, target));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    // this will not work in duplicate values
    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}