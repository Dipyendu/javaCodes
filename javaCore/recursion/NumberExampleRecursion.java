package recursion;

// -> no base condition = infinite function calls
// -> stack will be filled again and again
// -> we know every call of function will fill stack memory again and again
// -> one time will come when computer memory will exceed the limit
// -> and show stackOverFlow error

// -> why recursion? -> it helps us solve bigger/complex problems in a simple way

// -> u can convert recursion solution into iteration and vice versa

// -> it will take space for each call so if we call function for n times space complexity will be O(n)

// -> it helps us in breaking bigger problems into smaller problems

public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }

    public static void print(int number) {
        System.out.println(number);
        if (number == 5) { // -> base condition to stop the recursive call
            return;
        } else {
            // -> this is called tail recursion
            // -> this is the last function call
            print(number + 1); // -> recursive call
        }
    }
}
