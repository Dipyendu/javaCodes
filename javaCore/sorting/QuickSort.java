// Recurrence Relation -> T(N) = T(K) + T(N - 1 - K) + O(N)

// What is it doing?
// Pivot -> Choose any random element
// after first pass
// [all the elements < pivot] will be on LHS of pivot
// [all the elements > pivot] will be on RHS of pivot
// after every pass pivot element will be on the correct position

// How to pick pivots
// Random Element
// Corner Element
// Pick the Middle Element

// How to put pivot at correct position?

// Time Complexity:
// Worst Case -> K = smallest or largest element -> O(N^2)
// Best Case -> K = middle value of smallest and largest element -> O(NlogN)

// Notes:
// Not stable
// In Place i.e. why preferred for arrays instead of Merge Sort as it takes O(N) extra space
// Merge Sort is better in linked list due to memory allocation -> Not Continuous

package javaCore.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int middle = start + (end - start) / 2;
        int pivot = nums[middle];

        while (start <= end) {
//          also a reason why if its already sorted it will not swap
            while (nums[start] < pivot) {
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

//      now my pivot is at correct index, please sort two halves now
        quickSort(nums, low, end);
        quickSort(nums, start, high);
    }
}
