import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 3, 3, 4, 2 };
        int n = 7;
        System.out.println("Answer -> " + solution(arr, n));
    }

    public static int solution(int[] A, int N) {

        // Handle empty array
        if (N == 0) {
            return 0;
        }

        // Use a HashMap to store move result frequencies
        HashMap<Integer, Integer> moveFrequencies = new HashMap<>();

        // Track maximum consecutive occurrences and maximum move count
        int maxConsecutive = 0;
        int maxMoveCount = 0;

        // Iterate through the array, considering each move type
        for (int i = 0; i < N - 2; i++) {
            // First two elements
            int sum = A[i] + A[i + 1];
            int currentConsecutive = moveFrequencies.getOrDefault(sum, 0);
            int currentMoveCount = currentConsecutive + 1;
            moveFrequencies.put(sum, currentConsecutive + 1); // Update frequency for future moves
            if (currentConsecutive + 1 > maxConsecutive) {
                maxConsecutive = currentConsecutive + 1;
                maxMoveCount = currentMoveCount;
            } else if (currentConsecutive + 1 == maxConsecutive) {
                maxMoveCount = Math.max(maxMoveCount, currentMoveCount);
            }

            // Last two elements
            sum = A[N - i - 1] + A[N - i - 2];
            currentConsecutive = moveFrequencies.getOrDefault(sum, 0);
            currentMoveCount = currentConsecutive + 1;
            moveFrequencies.put(sum, currentConsecutive + 1);
            if (currentConsecutive + 1 > maxConsecutive) {
                maxConsecutive = currentConsecutive + 1;
                maxMoveCount = currentMoveCount;
            } else if (currentConsecutive + 1 == maxConsecutive) {
                maxMoveCount = Math.max(maxMoveCount, currentMoveCount);
            }

            // First and last elements
            sum = A[i] + A[N - i - 1];
            currentConsecutive = moveFrequencies.getOrDefault(sum, 0);
            currentMoveCount = currentConsecutive + 1;
            moveFrequencies.put(sum, currentConsecutive + 1);
            if (currentConsecutive + 1 > maxConsecutive) {
                maxConsecutive = currentConsecutive + 1;
                maxMoveCount = currentMoveCount;
            } else if (currentConsecutive + 1 == maxConsecutive) {
                maxMoveCount = Math.max(maxMoveCount, currentMoveCount);
            }
        }

        return maxMoveCount; // Return the maximum number of moves performed
    }
}
