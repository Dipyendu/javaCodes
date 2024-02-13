package geeksForGeeks;

import java.util.Arrays;

public class FrequenciesOfLimitedRangeArrayElements {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        int N = 5;
        frequencyCount(arr, N);
        System.out.println(Arrays.toString(arr));
    }

    public static void frequencyCount(int[] arr, int N) {
        // code here
//        Step 1: Identify and ignore elements greater than N
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > N) {
                arr[i] = 0;
            }
        }
//        Step 2: Encode frequency information into array elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % (N + 1) > 0) {
                arr[(arr[i] % (N + 1)) - 1] += (N + 1);
            }
        }
//        Step 3: Decode the frequency information
        for (int i = 0; i < arr.length; i++) {
            arr[i] /= N + 1;
        }
    }
}
