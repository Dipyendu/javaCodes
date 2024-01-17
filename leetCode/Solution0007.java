public class Solution0007 {
    public static void main(String[] args) {
        int n = 123;
        System.out.println("Answer -> " + reverse(n));
    }

    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int ld = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10) {
                return 0;
            }
            ans = ans * 10 + ld;
            x /= 10;
        }
        return ans;
    }
}
