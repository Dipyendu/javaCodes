package mathsForDSA.basicMaths;

public class FindGCDAndLCM {
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        System.out.println("HCF:" + findGCD(a, b));
        System.out.println("LCM: " + findLCM(a, b));
        System.out.println("Multiplication: " + findGCD(a, b) * findLCM(a, b));
    }

    public static int findGCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        return findGCD(b % a, a);
    }

    public static int findLCM(int a, int b) {
        int gcd = findGCD(a, b);
        return a * b / gcd;
    }
}
