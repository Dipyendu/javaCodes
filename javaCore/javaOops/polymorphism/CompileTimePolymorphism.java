package polymorphism;

public class CompileTimePolymorphism {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) { // -> Method Overloading
        return a + b + c;
    }

    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        System.out.println(obj.sum(2, 3));
        System.out.println(obj.sum(1, 3, 7));

//        obj.sum(4, 5, 6, 8);
    }
}