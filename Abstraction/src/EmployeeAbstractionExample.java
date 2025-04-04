public class EmployeeAbstractionExample {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("Ashutosh","1316748",83000);
        fullTimeEmployee.calculatePay(fullTimeEmployee.getName());

        Employee contractBasedEmployee = new ContractBasedEmployee("Sankalp","1243899",250,100);
        contractBasedEmployee.calculatePay(contractBasedEmployee.getName());
    }
}

abstract class Employee{

    private String name;
    private String empId;

    public Employee(String name, String empId) {
        this.name = name;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public String getEmpId() {
        return empId;
    }

    abstract void calculatePay(String name);
}

class FullTimeEmployee extends Employee{

    private double salary;

    public FullTimeEmployee(String name, String empId, double salary) {
        super(name, empId);
        this.salary = salary;
    }

    @Override
    void calculatePay(String name) {
        System.out.println(name + " is a full Time Employee with fixed salary of Rs." + salary + "/-");
    }
}

class ContractBasedEmployee extends Employee{

    private int hoursWorked;
    private double hourlyRate;

    public ContractBasedEmployee(String name, String empId, int hoursWorked, double hourlyRate) {
        super(name, empId);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    void calculatePay(String name) {
        System.out.println(name + " is a contract Based Employee with payment of Rs." + (hourlyRate*hoursWorked));
    }
}
