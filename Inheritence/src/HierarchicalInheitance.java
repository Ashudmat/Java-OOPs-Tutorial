public class HierarchicalInheitance {
    public static void main(String[] args) {
        Human human = new Human();
        human.survive();

        Male male = new Male();
        male.survive();
        male.averageAge();

        Female female = new Female();
        female.survive();
        female.averageAge();
    }
}

class Human{
    void survive(){
        System.out.println("Human being is somehow alive!!!");
    }
}

class Male extends Human{
    void averageAge(){
        System.out.println("Average age of males is 60");
    }
}

class Female extends Human{
    void averageAge(){
        System.out.println("Average age of female is 75");
    }
}