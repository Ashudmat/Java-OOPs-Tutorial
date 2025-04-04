public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.eat();

        Human human = new Human();
        human.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Animal is eating!!!");
    }
}

class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dog is eating flesh!!!");
    }
}

class Human extends Animal{
    @Override
    void eat(){
        System.out.println("Human is eating veg food!!!");
    }
}