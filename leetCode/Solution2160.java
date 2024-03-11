package leetCode;

import java.util.Arrays;

public class Solution2160 {
    public static void main(String[] args) {
        int num = 9999;
        System.out.println(minimumSum(num));
        System.out.println(minimumSumOptimized(num));
    }

    public static int minimumSum(int num) {
        int tempNum = num;
        int[] numArray = new int[4];
        for (int i = numArray.length - 1; i >= 0; i--) {
            int lastDigit = tempNum % 10;
            numArray[i] = lastDigit;
            tempNum /= 10;
        }

        Arrays.sort(numArray);
        int leftNum = numArray[0] * 10 + numArray[2];
        int rightNum = numArray[1] * 10 + numArray[3];

        return leftNum + rightNum;
    }

    public static int minimumSumOptimized(int num) {
        int tempNum = num;
        int[] numArray = new int[4];
        for (int i = numArray.length - 1; i >= 0; i--) {
            int lastDigit = tempNum % 10;
            numArray[i] = lastDigit;
            tempNum /= 10;
        }
//        Finding largest and Second-Largest elements of the array
        int largest = 0;
        int largestIndex = 0;
        int secondLargest = largest;
        int secondLargestIndex = 0;
        for (int j = 0; j < numArray.length; j++) {
            if (numArray[j] > largest) {
                secondLargest = largest;
                secondLargestIndex = largestIndex;
                largest = numArray[j];
                largestIndex = j;

            } else if (numArray[j] > secondLargest) {
                secondLargest = numArray[j];
                secondLargestIndex = j;
            }
        }
//        shifting largest to index 3 and secondLargest to index 2
        if (secondLargestIndex == 3) { // avoiding the case of clashing
            swap(numArray, secondLargestIndex, 2);
            swap(numArray, largestIndex, 3);
        } else {
            swap(numArray, largestIndex, 3);
            swap(numArray, secondLargestIndex, 2);
        }
        int leftNum = numArray[0] * 10 + numArray[2];
        int rightNum = numArray[1] * 10 + numArray[3];
        return leftNum + rightNum;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
