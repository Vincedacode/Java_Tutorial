package Employee_Services;

class fullTImeEmployee extends Employeeinherit{
    private double employeesalary;
    public fullTImeEmployee(String name, int id, double salary) {
        super(name, id);
        this.employeesalary = salary;
    }

    public double FullTimeService(){
        if(employeesalary < 1000){
            employeesalary += 0.1 * employeesalary;
            employeesalary -= 0.1 * employeesalary;
            System.out.println("Congratulations! " + employeename + ", 10% bonus has been added to your salary! Total salary is: " + employeesalary);
            return employeesalary;
        }
        if(employeesalary > 3000){
            employeesalary += 0.05 * employeesalary;
            employeesalary -= 0.1 * employeesalary;
            System.out.println("Congratulations!, "+ employeename + " a 5% performance fee has been added to your salary! Total salary is: " + employeesalary);
            return employeesalary;
        }else{
            employeesalary -= 0.1 * employeesalary;
            System.out.println(employeename + ", your total salary is: " + employeesalary);
        }

        return employeesalary;
    }
}

class partTimeEmployee extends Employeeinherit{
    private int employeehours;

    private double employeehourlyrate;
    public partTimeEmployee(String name, int id, int hours, double hourlyrate) {
        super(name, id);
        this.employeehours = hours;
        this.employeehourlyrate = hourlyrate;
    }

    public double partTimeService(){
        double salary = (double) employeehours * employeehourlyrate;
        if(salary < 1000){
            salary += 0.1 * salary;
            salary -= 0.1 * salary;
            System.out.println("Congratulations! " + employeename + ", 10% bonus has been added to your salary! Total salary is: " + salary);
            return salary;
        }
        if(employeehours > 100){
            salary += 100;
            salary -= 0.1 * salary;
            System.out.println("Congratulations! "+ employeename + ", you have received $100 bonus having worked more than 100 hours! Total salary: "+ salary);
        }
        return salary;
    }
}

class contractEmployee extends Employeeinherit{
private double contractsalary;
    public contractEmployee(String name, int id, double contractSalary) {
        super(name, id);
        this.contractsalary = contractSalary;
    }

    public double contractService(){
        if(contractsalary < 1000){
            contractsalary += 0.1 * contractsalary;
            contractsalary -= 0.1 * contractsalary;
            System.out.println("Congratulations! " + employeename + ", 10% bonus has been added to your salary! Total salary is: " + contractsalary);
            return contractsalary;
        }
        if(contractsalary < 2000){
            contractsalary += 200;
            System.out.println("Congratulations!, " + employeename + " you have received $200 transport allowance. Total salary: " + contractsalary);
            return contractsalary;
        }
        return contractsalary;
    }
}


public class Employeeinherit {
    protected String employeename;
    protected int employeeid;


    public Employeeinherit(String name, int id){
        this.employeename = name;
        this.employeeid = id;
    }

    public static void main(String[] args) {
        fullTImeEmployee fulltime = new fullTImeEmployee("Joy", 101, 3200);
        fulltime.FullTimeService();
        partTimeEmployee parttime = new partTimeEmployee("Peter", 102, 120, 10);
        parttime.partTimeService();
        contractEmployee contract = new contractEmployee("Oscar", 103, 1800);
        contract.contractService();
    }
}


