package leetCode;

public class Solution0069 {
    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = x;
        while (true) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x / (mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }
}
