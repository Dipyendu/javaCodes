public class Triangle {
    int a, b, c;

    Triangle() {
        a = b = c = 0;
    }

    Triangle(int s) {
        a = b = c = s;
    }

    Triangle(int m, int n) {
        a = b = m;
        c = n;
    }

    Triangle(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
    }

    void display() {
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || c == a) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(5);
        Triangle t2 = new Triangle(4, 5);
        Triangle t3 = new Triangle(1, 2, 3);

        t1.display();
        t2.display();
        t3.display();
    }
}
