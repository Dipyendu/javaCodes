package linearSearch;

public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 8, 90, 45, 76 };
        System.out.println(minimumElement(arr));
    }

    static int minimumElement(int[] arr) {
        if (arr.length == 0) {
            return -1;
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            int minimumElement = arr[0];
            for (int i = 1; i < arr.length; i++) {
                minimumElement = Math.min(minimumElement, i);
            }
            return minimumElement;
        }
    }
}
