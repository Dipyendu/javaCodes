package recursion;

public class NumberExample {
    public static void main(String[] args) {
        // -> write a method that takes in a number and prints it
        // -> print first 5 numbers -> 1 2 3 4 5
        System.out.println("inside main method before print1 function call");
        print1(1);
        System.out.println("inside main method after print1 function call");
    }

    public static void print1(int number) {
        System.out.println(number);
        System.out.println("inside print1 method before print2 method call");
        print2(2);
        System.out.println("inside print1 method after print2 method call");
    }

    public static void print2(int number) {
        System.out.println(number);
        System.out.println("inside print2 method before print3 method call");
        print3(3);
        System.out.println("inside print2 method after print3 method call");
    }

    public static void print3(int number) {
        System.out.println(number);
        System.out.println("inside print3 method before print4 method call");
        print4(4);
        System.out.println("inside print3 method after print4 method call");
    }

    public static void print4(int number) {
        System.out.println(number);
        System.out.println("inside print4 method before print5 method call");
        print5(5);
        System.out.println("inside print4 method after print5 method call");
    }

    public static void print5(int number) {
        System.out.println(number);
        System.out.println("inside print5 method");
    }
}
