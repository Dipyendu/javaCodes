package mathsForDSA.bitwiseOperators;

public class NumberOfDigitsInARepresentation {
    public static void main(String[] args) {
        int n = 10; // Replace this with the desired value of N
        int b = 2; // Enter base of the number representation
        int result = numberOfDigitsInBinaryRepresentation(n, b);
        System.out.println("The number of digits in base " + b + " representation is: " + result);
    }

    public static int numberOfDigitsInBinaryRepresentation(int n, int b) {
        return (int) (Math.log(n)/Math.log(b)) + 1;

    }

//    public static int numberOfDigitsInBinaryRepresentation(int n) {
//        int digit = 0;
//        while (n>=0){
//            digit++;
//            n >>=1;
//        }
//        return digit;
//    }

}
