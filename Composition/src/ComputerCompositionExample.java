public class ComputerCompositionExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();
    }
}
class Computer{
    private RAM ram;
    private CPU cpu;
    private HardDrive hardDrive;

    public Computer(){
        this.ram = new RAM();
        this.cpu = new CPU();
        this.hardDrive = new HardDrive();
    }

    void startComputer(){
        cpu.process();
        ram.load();
        hardDrive.readData();
        System.out.println("Computer started!!!");
    }
}

class RAM{

    void load(){
        System.out.println("RAM Loading........Ram Loaded successfully");
    }

}

class HardDrive{

    void readData(){
        System.out.println("Data read successfully......");
    }
}

class CPU{
    void process(){
        System.out.println("CPU Processing started.....");
    }
}