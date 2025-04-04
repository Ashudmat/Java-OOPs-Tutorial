public class AbstractionWithInterface {
    public static void main(String[] args) {
        SuperCar superCar = new SuperCar();
        superCar.start();
        superCar.speed();
        superCar.stop();
    }
}
class SuperCar implements Car{

    @Override
    public void start() {
        System.out.println("Rolls Royce started.......current speed is 20km/hr");
    }

    @Override
    public void speed() {
        System.out.println("Current speed is 100 km/hr");
    }

    @Override
    public void stop() {
        System.out.println("Stopped........ current speed = 0 km/hr");
    }
}
interface Car{
    void start();
    void speed();
    void stop();
}
