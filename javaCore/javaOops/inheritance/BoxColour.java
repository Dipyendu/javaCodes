package inheritance;

public class BoxColour extends BoxWeight {
   
    String colour;

    BoxColour () {
        super();
        this.colour = null;
    }

    static void greeting() {
        System.out.println("Hey, I am in BoxColour class. Greetings!");
    }

    public BoxColour(BoxColour other) {
        super(other);
        this.colour = other.colour;
    }

    public BoxColour(double l, double h, double w, double weight, String colour) {
        super(l, h, w, weight);
        this.colour = colour;
    }

    public BoxColour(double side, double weight, String colour) {
        super(side, weight);
        this.colour = colour;
    }
}