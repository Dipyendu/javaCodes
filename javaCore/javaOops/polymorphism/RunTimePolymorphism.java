package polymorphism;

class Bike{
    void run(){
        System.out.println("I drive bike");
    }  
}
class Splendor extends Bike{
    void run(){ // -> Method overriding
        System.out.println("I drive Splendor");
    }
}
public class RunTimePolymorphism{
    public static void main(String args[]){
        Bike b = new Splendor(); // upcasting
        b.run();
    }
}