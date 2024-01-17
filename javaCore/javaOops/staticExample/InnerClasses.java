package staticExample;

public class InnerClasses {

    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() { // -> Overriding toString method
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        System.out.println(a);

        // System.out.println(a.name);
        // System.out.println(b.name);
    }
}

// static class A {
//
// }