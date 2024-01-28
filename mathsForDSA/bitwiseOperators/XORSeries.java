package mathsForDSA.bitwiseOperators;

public class XORSeries {
    public static void main(String[] args) {
        int n = 10;
        printFromZero(n);
        System.out.println();
        alternativeSolutionFromZero(n);
        System.out.println();

        int a = 3;
        int b = 9;
        printFromAToB(a, b);
        int ans = alternativeSolution(b) ^ alternativeSolution(a - 1);
        System.out.println("\n" + ans);
    }

    public static void printFromZero(int n) {
        int XOR = 0;
        for (int i = 0; i <= n; i++) {
            XOR ^= i;
            System.out.print(XOR + "\t");
        }
    }

    public static void alternativeSolutionFromZero(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 4 == 0) {
                System.out.print(i + "\t");
            } else if (i % 4 == 1) {
                System.out.print(1 + "\t");
            } else if (i % 4 == 2) {
                System.out.print((i + 1) + "\t");
            } else if (i % 4 == 3) {
                System.out.print(0 + "\t");
            }
        }
    }

    public static void printFromAToB(int a, int b) {
        int XOR = 0;
        for (int i = a; i <= b; i++) {
            XOR ^= i;
            System.out.print(XOR + "\t");
        }
    }

    public static int alternativeSolution(int a) {
        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a + 1;
        }
        return 0;
    }
}
