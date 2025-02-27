
abstract class Employee {
    protected String name;
    protected int id;
    protected String department;
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    public abstract double calculatePay();

    public void displayEmployee() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
}

class FullTimeEmployee extends Employee {
    private double fixedSalary;
    public FullTimeEmployee(String name, int id, String department, double fixedSalary) {
        super(name, id, department);
        this.fixedSalary = fixedSalary;
    }
    @Override
    public double calculatePay() {
        return fixedSalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    public PartTimeEmployee(String name, int id, String department, double hourlyRate, int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

class ContractEmployee extends Employee {
    private String projectName;
    private double contractAmount;
    public ContractEmployee(String name, int id, String department, String projectName, double contractAmount) {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }
    @Override
    public double calculatePay() {
        return contractAmount;
    }
}

public class practiceproblem8a {
    public static void main(String[] args) {
        FullTimeEmployee fullTime = new FullTimeEmployee("Alice", 101, "IT", 5000);
        fullTime.displayEmployee();
        System.out.println("Salary: $" + fullTime.calculatePay());

        System.out.println();
        PartTimeEmployee partTime = new PartTimeEmployee("Bob", 102, "HR", 20, 120);
        partTime.displayEmployee();
        System.out.println("Salary: $" + partTime.calculatePay());

        System.out.println();
        ContractEmployee contract = new ContractEmployee("Charlie", 103, "Finance", "Budget Analysis", 8000);
        contract.displayEmployee();
        System.out.println("Contract Amount: $" + contract.calculatePay());
    }
}
