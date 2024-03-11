package geeksForGeeks;

import java.util.ArrayList;

public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {
        ArrayList<Integer> Arr = new ArrayList<Integer>();
        Arr.add(100);
        Arr.add(200);
        Arr.add(300);
        Arr.add(400);
        int K = 2;
        int N = Arr.size();
        System.out.println(maximumSumSubarray(K, Arr, N));
    }

    public static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {
        // code here
        long maxSum = 0;
        long currentSum = 0;
        int i = 0;
        int j = 0;
        while (j < N) {
            currentSum = currentSum + Arr.get(j);
            if (j - i + 1 < K) {
                j++;
            } else if (j - i + 1 == K) {
                maxSum = Math.max(currentSum, maxSum);
                currentSum -= Arr.get(i);
                i++;
                j++;
            }
        }
        return maxSum;
    }
}
