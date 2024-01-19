package staticExample;

// If the executing class is in the same package as the importing class you do not have to import it
public class Main {
    public static void main(String[] args) {
        Human dipyendu = new Human(20, "Dipyendu Das", 100000, false);
        Human swastika = new Human(20, "Swastika Manna", 200000, false);
        System.out.println(dipyendu.salary);
        System.out.println(swastika.age);
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}