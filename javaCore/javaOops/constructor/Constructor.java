public class Constructor {
    public static void main(String[] args) {
        System.out.println("\nDefault Constructor");
        System.out.println("____________________\n");
        Student student1 = new Student();
        System.out.println(student1);
        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);
        student1.greeting();

        System.out.println("\nParameterized Constructor");
        System.out.println("__________________________\n");
        Student student2 = new Student(1, "Swastika Manna", 95);
        System.out.println(student2);
        System.out.println(student2.rno);
        System.out.println(student2.name);
        System.out.println(student2.marks);
        student2.greeting();

        System.out.println("\nCopy Constructor");
        System.out.println("_________________\n");
        Student student3 = new Student(student1);
        System.out.println(student3);
        System.out.println(student3.rno);
        System.out.println(student3.name);
        System.out.println(student3.marks);
        student3.greeting();

        Student student4 = new Student(student2);
        System.out.println(student4);
        System.out.println(student4.rno);
        System.out.println(student4.name);
        System.out.println(student4.marks);
        student4.greeting();
    }
}

class Student {
    int rno;
    String name;
    float marks;

    Student() { // -> Default Constructor
        this.rno = 16;
        this.name = "Dipyendu Das";
        this.marks = 90;
    }

    /*
     * Student(){ // -> Calling a Constructor from another one
     * // -> Call the parameterized constructor with default values
     * this(456,"This",67);
     * }
     */

    Student(int rno, String name, float marks) { // -> Parameterized Constructor
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other) { // -> Copy Constructor
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    void greeting() { // -> Greeting Method
        System.out.println("Hello " + this.name);
    }
}