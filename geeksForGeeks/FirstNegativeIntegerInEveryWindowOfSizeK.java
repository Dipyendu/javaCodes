package geeksForGeeks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeIntegerInEveryWindowOfSizeK {

    public static void main(String[] args) {
        long[] A = {-8, 2, 3, -6, 10};
        int N = A.length;
        int K = 2;
        System.out.println(Arrays.toString(printFirstNegativeInteger(A, N, K)));
    }

    public static long[] printFirstNegativeInteger(long[] A, int N, int K) {
        long[] resultArray = new long[N - K + 1];
        Queue<Long> queue = new LinkedList<>();
        int i = 0;
        int j = 0;
        while (j < N) {
            if (A[j] < 0) {
                queue.add(A[j]);
            }
            if (j - i + 1 < K) {
                j++;
            } else if (j - i + 1 == K) {
                if (queue.isEmpty()) {
                    resultArray[i] = 0;
                } else {
                    resultArray[i] = queue.peek();
                    if (A[i] < 0) {
                        queue.remove();
                    }
                }
                i++;
                j++;
            }
        }
        return resultArray;
    }
}
