class A {
    int i = 10;

    public void print() {
        System.out.println("Value-A");
    }
}

class B extends A {
    int i = 12;

    public void print() {
        System.out.println("Value-B");
    }
}

public class Practice2 {
    public static void main(String[] args) {
        A a = new B();
        a.print();
        System.out.println(a.i);
    }
}
