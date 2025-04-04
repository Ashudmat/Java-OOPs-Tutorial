public class CarEngineCompositionExample {
    public static void main(String[] args) {
    Car car = new Car();
    car.startCar();
    car.stopCar();
    }
}

class Engine{

    void start(){
        System.out.println("Engine Started First!!!");
    }

    void stop(){
        System.out.println("Engine Stopped First!!!");
    }
}

class Car {

    private Engine engine;

    public Car(){
        this.engine = new Engine();
    }
    void startCar(){
        engine.start();
        System.out.println("And then Car started");
    }
    void stopCar(){
        engine.stop();
        System.out.println("And then Car Stopped");
    }

}
