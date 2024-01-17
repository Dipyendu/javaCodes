public class ObjectCounter {
    private static int count = 0;
    public String s;

    public ObjectCounter() {
        count++;
        this.s = null;
    }

    public static int getObjectCount() {
        return count;
    }

    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        int totalObjects = ObjectCounter.getObjectCount();

        System.out.println("Total number of objects created: " + totalObjects);

        System.out.println(obj1.s);
        System.out.println(obj2.s);
        System.out.println(obj3.s);
    }
}
