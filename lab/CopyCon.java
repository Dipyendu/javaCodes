public class CopyCon {
    int id;
    String name;

    CopyCon(int id, String name) {
        System.out.println("Constructor called.");
        this.id = id;
        this.name = name;
    }

    CopyCon(CopyCon obj) {
        System.out.println("Copy Constructor called.");
        this.id = obj.id;
        this.name = obj.name;
    }

    public static void main(String[] args) {
        CopyCon c1 = new CopyCon(13, "Bangtan");
        System.out.println("C1 I.D: " + c1.id);
        System.out.println("C1 Name: " + c1.name);

        CopyCon c2 = new CopyCon(c1);
        System.out.println("C2 I.D: " + c2.id);
        System.out.println("C2 Name: " + c2.name);
    }
}
