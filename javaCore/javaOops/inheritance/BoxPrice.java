package inheritance;

public class BoxPrice extends BoxWeight{

    double cost;

    BoxPrice () {
        super();
        this.cost = 0;
    }

    static void greeting() {
        System.out.println("Hey, I am in BoxPrice class. Greetings!");
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }

}