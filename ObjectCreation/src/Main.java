import java.io.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, IOException {
        //Different ways of creating objects:

        //using new keyword:-> It invokes constructor of the class
        System.out.println("Using New Keyword:----->");
        Car obj1 = new Car("Black","Tata Safari");
        obj1.start();
        obj1.accelerate(20);
        obj1.brake();

        System.out.println();
        //using factory method (static method)
        System.out.println("Using Static Method:----->");
        Car obj2 = CarFactory.createCar("Red","Toyota Corolla");
        obj2.start();
        obj2.accelerate(20);
        obj2.brake();

        System.out.println();

        //using object deserialization: It requires the class to implement the Serializable interface.
        System.out.println("Using Deserialization:----->");
        Car myCar = new Car("Purple", "Bolero");
        FileOutputStream fileOut = new FileOutputStream("car");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(myCar);
        out.close();
        fileOut.close();

        FileInputStream inputStream = new FileInputStream("car");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Car obj3 = (Car) objectInputStream.readObject();
        objectInputStream.close();
        inputStream.close();

        obj3.start();
        obj3.accelerate(20);
        obj3.brake();

        System.out.println();

        //using clone() method: It requires the class to implement Cloneable Interface and override clone method
        System.out.println("Using Clone method:----->");
        Car temp = new Car("White","Tata Harrier");
        Car obj4 = (Car) temp.clone();
        obj4.start();
        obj4.accelerate(20);
        obj4.brake();

        //using Class.forName().newInstance()
//        Car obj3 = (Car) Class.forName("Car").newInstance();
//        obj3.start();
//        obj3.accelerate(20);
//        obj3.brake();
    }
}

class Car implements Cloneable, Serializable {
    private String color;
    private String model;
    private int speed;

    public Car(String color, String model){
        this.color = color;
        this.model = model;
        this.speed = 0;    // initially set to 0
    }

    public void start(){
        speed = 10;   //starting speed
        System.out.println(model + " started and current speed is " + speed + "km/hr");
    }

    public void accelerate(int increment){
        speed += increment;
        System.out.println(model + " accelerated and current speed is "+ speed + "km/hr");
    }

    public void brake(){
        speed = 0;
        System.out.println(model + " stopped and current speed is " + speed + "km/hr");
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // call to Object's clone()
    }
}

class CarFactory{
    public static Car createCar(String color, String model){
        return new Car(color,model);
    }
}