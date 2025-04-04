public class MultilevelInheritance {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();

        Car car = new Car();
        car.start();
        car.stop();
        car.speed(20);

        Car superCar = new SuperCar();
        superCar.start();
        superCar.stop();
        superCar.speed(40);
    }
}

class Vehicle{
    void start(){
        System.out.println("Vehicle started!!!");
    }

    void stop(){
        System.out.println("Vehicle stopped!!!");
    }
}

class Car extends Vehicle{
    void speed(int increment){
        System.out.println("Car's speed is " + increment + " km/hr");
    }
}

class SuperCar extends Car{
    void speed(int increment){
        System.out.println("Super Car's speed is " + increment + " km/hr");
    }
}
