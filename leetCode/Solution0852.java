// -> Mountain Array Example -> https://assets.leetcode.com/uploads/2019/10/20/hint_valid_mountain_array.png

public class Solution0852 {
    public static void main (String[] args) {
        int[] arr = { 0, 1, 0 };
        System.out.println("Answer -> " + peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = -1;

        while(start < end){ // -> or we can also say while(start != end) because when both becomes same the loop will break

            mid = start + ( (end - start) / 2);

            System.out.printf("\n1. %d,%d,%d\n",start,end,mid);
            if(arr[mid] > arr[mid + 1]){
                // -> you are in the decreasing part of the array which might be the answer but we will also check the left side of the array for more possible answers
                end = mid;
            }
            else{
                // -> you are in increasing part of the array
                start = mid + 1;
            }
            System.out.printf("\n2. %d,%d,%d\n",start,end,mid);
        }
        // -> in the end, start == end and pointing to the largest number because of the 2 checks above
        // -> start and end are always trying to find max element in the above 2 checks
        // -> hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // -> more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // -> and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans

        return start; // -> or return end as both are equal
    }
}

// -> int[] arr = { 1, 3, 5, 9, 12, 14, 16, 8, 7, 2, 0 }
// -> int[] arr = { 1, 3, 5, 16, 14, 12, 9, 8, 7, 2, 0 }