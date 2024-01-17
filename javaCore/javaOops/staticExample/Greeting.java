package staticExample;

public class Greeting {
    public static void main(String[] args) {
        Greeting funn = new Greeting();
        funn.fun2();

        fun();

    }

    // this is not dependent on objects
    static void fun() {
        // greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances
        // you cannot access non static stuff without referencing their instances in
        // a static context
        // hence, here I am referencing it
        System.out.println("\nCalling static fun");
        Greeting obj = new Greeting();
        obj.greeting();
    }

    void fun2() {
        System.out.println("\nCalling non-static fun");
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
//        fun();
        System.out.println("Hello world");
    }
}