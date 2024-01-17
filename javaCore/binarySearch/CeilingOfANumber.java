package binarySearch;

public class CeilingOfANumber{
    public static void main(String[] args){
        int [] arr1 = {2, 3, 5, 9, 14, 16, 18};
        int[] arr2 = {98, 67, 65, 12, 10, 8, 5, 4, 2, 1};
        int target = 100;
        // -> Ceiling = smallest element in array that is >= target
        System.out.println("\nCeiling -> " + ceiling(arr1, target));
        System.out.println("\nCeiling -> " + ceiling(arr2, target));
    }

    public static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];
        int count = 0;
        int mid = -1;

        System.out.println("\nInitializing Start and End");
        System.out.printf("|\tStart -> %d\t|\tEnd -> %d\t|\n", start, end);

        while (start <= end) {
            count++;
            System.out.printf("\nWhile loop executing %d times\n", count);
            mid = start + (end - start) / 2;

            if(count == 1){
                System.out.println("\nInitialising Mid");
            }
            else{
                System.out.println("\nMid after updation");
            }
            System.out.printf("|\tStart -> %d\t|\tEnd -> %d\t|\tMid -> %d\t|\n", start, end, mid);

            if (arr[mid] == target) {
                return arr[mid];
            }

            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            System.out.printf("\nStart, End after if statements execution\n|\tStart -> %d\t|\tEnd -> %d\t|\tMid -> %d\t|\n", start, end, mid);
        }

        if(isAscending){
            // -> when start > end i.e start = end + 1
            if(start < arr.length){
                // -> start < arr.length is to check for when target element is bigger than all elements present in the array and array is not seaching for an start index which is out of bound
                return arr[start];
            }
            return arr[arr.length - 1];
        }

        else{
            // -> when start > end i.e start = end + 1
            if(end >= 0){
                // -> end >= 0 is to check for when target element is smaller than all elements present in the array and array is not seaching for an end index which is out of bound
                return arr[end];
            }
            System.out.println("\nTarget element is bigger than all elements present in the array so just printing the biggest element present in the array");
            return arr[0];
        }
    }
}