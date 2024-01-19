class Base {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    public void display() {
        System.out.println("Base Class:");
        System.out.println("publicVar = " + publicVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("defaultVar = " + defaultVar);
        System.out.println("privateVar = " + privateVar);
    }
}

class Subclass extends Base {
    public void display() {
        System.out.println("Subclass:");
        System.out.println("publicVar = " + publicVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("defaultVar = " + defaultVar);
        // Private variable 'privateVar' is not accessible in the subclass
        // System.out.println("privateVar = " + privateVar);
    }
}

public class Access {
    public static void main(String[] args) {
        Base baseObj = new Base();
        Subclass subObj = new Subclass();

        // Accessing variables and methods within the same class (Base)
        baseObj.display();

        // Accessing variables and methods within the subclass (Subclass)
        subObj.display();

        // Accessing publicVar outside the class
        System.out.println("Outside the class (publicVar) = " + baseObj.publicVar);

        // Protected and default variables are not accessible outside the class
        // System.out.println("Outside the class (protectedVar) = " + baseObj.protectedVar);
        // System.out.println("Outside the class (defaultVar) = " + baseObj.defaultVar);

        // Private variable is not accessible outside the class
        // System.out.println("Outside the class (privateVar) = " + baseObj.privateVar);
    }
}
