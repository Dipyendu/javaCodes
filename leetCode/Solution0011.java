package leetCode;

public class Solution0011 {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int length = height.length;
        int maxArea = 0;
        int i = 0;
        int j = length - 1;
        while (i < j) {
            int currentArea = Math.min(height[i], height[j]) * (j - i);
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
