package chapter3.inheritance;

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

/**
 * <h1>dog class</h1>
 */
class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

public class Single {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println("----------------------------------------------------------------");
        System.out.println("\t\t single inheritance ");
        System.out.println("----------------------------------------------------------------");

        d.bark();
        d.eat();
    }
}