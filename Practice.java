import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr1 = { 4, 7, 1, 5, 3 };
        int n1 = 5;
        int[] arr2 = { 12, 12, 12, 15, 10 };
        int n2 = 5;
        int[] arr3 = { 18, 26, 18, 24, 24, 20, 22 };
        int n3 = 7;
        System.out.println("Answer 1 -> " + solution(arr1, n1));
        System.out.println("Answer 2 -> " + solution(arr2, n2));
        System.out.println("Answer 3 -> " + solution(arr3, n3));
    }

    public static int solution(int[] arr, int n) {
        // -> handle arrays with length 0 and 1
        if (n == 0 || n == 1) {
            return n;
        }
        // -> minimum 2 digits will be deleted whatever combination we take in case of
        // -> arrays with length >= 2
        int result = 2;
        // -> Generate all possible combinations of integers from A
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // -> Consider combinations of 3 elements initially
                    ArrayList<Integer> currentCombination = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k]));

                    // -> Extend combinations for larger lengths
                    for (int l = k + 1; l < n; l++) {
                        currentCombination.add(arr[l]);
                    }

                    // -> Check if the differences are equal in the sorted combination
                    int[] sortedCombination = currentCombination.stream().mapToInt(Integer::intValue).toArray();
                    Arrays.sort(sortedCombination);

                    boolean isValid = true;
                    for (int m = 1; m < sortedCombination.length - 1; m++) {
                        if (sortedCombination[m] - sortedCombination[m - 1] != sortedCombination[1]
                                - sortedCombination[0]) {
                            isValid = false;
                            break;
                        }
                    }

                    // -> Update maxLength if the combination is valid and longer
                    if (isValid && currentCombination.size() > result) {
                        result = currentCombination.size();
                    }
                }
            }
        }
        return result;
    }
}