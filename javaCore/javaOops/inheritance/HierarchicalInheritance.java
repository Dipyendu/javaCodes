package inheritance;

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal implements A, B {
    @Override
    public void methodA() {
        System.out.println("Dog's implementation of methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Dog's implementation of methodB");
    }

    void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();    // Inherited from Animal
        dog.methodA(); // Implemented from Interface A
        dog.methodB(); // Implemented from Interface B
        dog.bark();    // Unique to Dog
    }
}
