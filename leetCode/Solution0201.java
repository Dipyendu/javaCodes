package leetCode;

public class Solution0201 {
    public static void main(String[] args) {
        int left = 1;
        int right = 2147483647;
        System.out.println(rangeBitwiseAnd(left, right));
    }

    public static int rangeBitwiseAnd(int left, int right) {
        int ans = 1;
        while (left <= right) {
            ans = ans * left * right;
            if (left == right) {
                ans = ans * left;
            }
            left++;
            right--;
        }
        return ans;
    }
}
