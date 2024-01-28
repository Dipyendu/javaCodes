package binarySearch;

public class BinarySearchForInfiniteAscendingArray{
    public static void main(String[] args){
        int[] arr = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    public static int ans(int[] arr, int target){
        // -> first find the range
        // -> first start with a box of size of 2
        int start = 0;
        int end = 1;

         // condition for the target to lie in the range
        try {
                while (target > arr[end]) {
                int tempStart = end + 1;
                end = end + (2 * (end - (start - 1)));
                start = tempStart;
                }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the exception and consider it as a signal to stop expanding the range
            end = arr.length - 1;
        }
        // -> 0, 1 -> 2, 5 -> 6, 13
        return binarySearchForInfiniteAscendingArray(arr, target, start, end);
    }

    public static int binarySearchForInfiniteAscendingArray(int[] arr, int target, int start, int end){

        int count = 0;
        while(start <= end){
            count++;
            System.out.println("while loop excuted " + count + " times");
            // -> find the middle element
            // -> int mid = (start + end)/2; -> Might be possible that (start + end) exceeds the range of int in Java
            int mid = start + (end - start) / 2; // -> better way to find mid -> (S + E) / 2 = ( (S + S) + (E - S) ) / 2 = S + (E - S) / 2
            if (target == arr[mid]){
                return mid;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
        }
        // if target element not found return -1;
        return -1;
    }
}