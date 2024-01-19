package staticExample;

// this is a demo to show initialisation of static variables
public class StaticBlock {
    static int a = 4;
    static int b;
    int i;

    StaticBlock() {
        this.i = 0;
    }

    // will only run once, when the first obj is create i.e. when the class is
    // loaded for the first time
    static {
        System.out.println("\nI am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {

        System.out.println("\nFirst instantiation");
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        System.out.println("\nb increased by 3");
        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        System.out.println("\nSecond instantiation");
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        System.out.println(obj1.i);
        System.out.println(obj2.i);
    }

}