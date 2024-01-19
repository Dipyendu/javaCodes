package codingNinjasStudio.basics;

/*
    Time complexity: O(1)
    Space complexity: O(1)
*/
public class Solution0004 {
    public static void main(String[] args) {
        int shape1 = 1;
        double[] a = { 3 };
        System.out.println("Answer -> " + areaSwitchCase(shape1, a));

        int shape2 = 2;
        double[] b = { 3, 4 };
        System.out.println("Answer -> " + areaSwitchCase(shape2, b));
    }

    public static double areaSwitchCase(int caseNo, double[] a) {
        double area = 0.0;

        // Using switch-case to figure out whose area we want to find

        switch (caseNo) {

            case 1: // Circle
                area = Math.PI * a[0] * a[0];
                break;

            case 2: // Rectangle
                area = a[0] * a[1];

        }

        // Returning the calculated area
        return area;
    }
}