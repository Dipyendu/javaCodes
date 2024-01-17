package binarySearch;

public class BinarySearchForAscendingArray{
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5, 8, 10, 12, 65, 67, 98};
        int target = 1;
        System.out.println(binarySearchForAscendingArray(arr, target));
    }

    static int binarySearchForAscendingArray(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        int count = 0;
        while(start <= end){
            count++;
            System.out.println("while loop excuted " + count + " times");
            // -> find the middle element
            // -> int mid = (start + end)/2; -> Might be possible that (start + end) exceeds the range of int in Java
            int mid = start + (end - start) / 2; // -> better way to find mid -> (S + E) / 2 = ( (S + S) + (E - S) ) / 2 = S + (E - S) / 2
            if (arr[mid] == target){
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