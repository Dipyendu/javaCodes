package javaCore.recursion.easy;

// -> no base condition = infinite function calls
// -> stack will be filled again and again
// -> we know every call of function will fill stack memory again and again
// -> one time will come when computer memory will exceed the limit
// -> and show stackOverFlow error

// -> why recursion? -> it helps us solve bigger/complex problems in a simple way

// -> u can convert recursion solution into iteration and vice versa

// -> it will take space for each call so if we call function for n times space complexity will be O(n)

// -> it helps us in breaking bigger problems into smaller problems

public class PrintNTo1UsingRecursion {
    public static void main(String[] args) {
        printNumbers(5);
    }

    public static void printNumbers(int number) {
        if (number < 1) {
            return;
        }
        System.out.println(number);
        printNumbers(number - 1);
    }
}
