package New_task;

abstract class Employee {
    protected String name;
    protected int salary;
    protected int hours;
    protected int days;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateSalary();

    void getDetails() { // No need for a parameter
        System.out.println("Employee: " + name);
    }
}

// Part-Time Employee
class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, int hourlyRate, int hours, int days) {
        super(name, hourlyRate);
        this.hours = hours;
        this.days = days;
    }

    @Override
    double calculateSalary() {
        return salary * hours * days;  // Hourly wage × Hours worked × Days
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Salary: $" + salary + " per hour");
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

// Full-Time Employee
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int fixedSalary) {
        super(name, fixedSalary);
    }

    @Override
    double calculateSalary() {
        return salary; // Fixed salary
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Salary: $" + salary);
    }
}

// Main Class
public class Tryabstract {

    public static void main(String[] args) {
        FullTimeEmployee fullTime = new FullTimeEmployee("Kate Abdo", 1500);
        PartTimeEmployee partTime = new PartTimeEmployee("John", 20, 8, 12);

        fullTime.getDetails();
        System.out.println();
        partTime.getDetails();
    }
}
