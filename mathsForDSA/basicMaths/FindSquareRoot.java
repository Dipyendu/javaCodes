package mathsForDSA.basicMaths;

public class FindSquareRoot {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(linearSearchSquareRoot(n));
        System.out.println(binarySearchSquareRoot(n));
        System.out.println(preciseSquareRoot(n));
        System.out.println(squareRootUsingNewtonRaphsonMethod(n));
    }

    public static int linearSearchSquareRoot(int n) { // -> Time Complexity: O(sqrt(n))
        if (n < 0) {
            return -1;
        }
        if (n < 2) {
            return n;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0 && n / i == i) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchSquareRoot(int n) { // -> Time Complexity: O(log(n))
        if (n < 0) {
            return -1;
        }

        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid >= n) {
                end = mid - 1;
            } else if (mid * mid <= n) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static double preciseSquareRoot(double n) {
        if (n < 0) {
            return -1;
        }
        double root = 0.0;
        int precision = 5;
        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (root * root <= n) {
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }
        return root;
    }

    public static double squareRootUsingNewtonRaphsonMethod(double n) {
        // Formula -> xn = xn-1 – f(xn-1)/f'(xn-1)
        // sqrt(n) = (x + n / x) / 2 -> x = initial guess of root, error = |root - (x * x)| should be < epsilon until it is achieved keep updating the value of x by multiplying it by 0.5

        if (n < 0) {
            throw new IllegalArgumentException("Cannot compute square root of a negative number");
        }

        double x0 = n / 2; // Initial guess
        double x = x0;
        double epsilon = 1e-10; // Convergence threshold = 0.0000000001

        // Iterate until convergence
        while (Math.abs(x * x - n) > epsilon) {
            x = 0.5 * (x + n / x); // Newton-Raphson update
        }

        return x;
    }
}
