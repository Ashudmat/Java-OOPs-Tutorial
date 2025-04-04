public class AbstractionWithAbstractClass {
    public static void main(String[] args) {
        // An abstract class in Java is a class that cannot be instantiated
        // and may contain abstract methods,which are methods without a body.
        // Subclasses of the abstract class are responsible for providing implementations for these abstract methods.

        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.sleep();
    }
}

abstract class Animal{
    abstract void makeSound();
    void sleep(){
        System.out.println("Animal is sleeping...");
    }
}

class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("Barking!");
    }
}
