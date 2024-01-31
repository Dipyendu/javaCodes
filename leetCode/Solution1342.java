package leetCode;

public class Solution1342 {

    public static void main(String[] args) {
        Solution1342 obj = new Solution1342();
        System.out.println(obj.numberOfSteps(14));
    }

    public int numberOfSteps(int num) {
        int count = 0; // Count should be local to the method
        return reduceToZero(num, count);
    }

    private int reduceToZero(int num, int count) {
        if (num == 0) {
            return count;
        }

        count++;

        if ((num & 1) == 0) {
            return reduceToZero(num / 2, count);
        } else {
            return reduceToZero(num - 1, count);
        }
    }
}
