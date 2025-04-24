package Employee_Services;

public class Employee {
    private String employmenttype;
    private String employeename;

    private int employeeid;

    private double salary;

    private int hours;

    private int hourlyrate;

    double totalSalary;

    public Employee(String myemploymenttype, String myemployeename, int myemployeeid, double mysalary, int myhours, int myhourlyrate){
        this.employmenttype = myemploymenttype;
        this.employeename = myemployeename;
        this.employeeid = myemployeeid;
        this.salary = mysalary;
        this.hours = myhours;
        this.hourlyrate = myhourlyrate;
    }

    public void salaryBonus(){
            if (salary < 1000) {
                double calcSalary = 10 * salary;
                double calcsalary2 = calcSalary / 100;
                totalSalary = calcsalary2 + salary;
                salary = totalSalary;
                System.out.println("Congratulations! " + employeename + ", 10% bonus has been added to your salary! Total salary is: " + salary);
            } else {
                System.out.println("Monthly salary is more than 1000. 10% Bonus is not applied!");
            }
    }

    public void taxDeduction(){

            double calcSalary = 10 * salary;
            double calcsalary2 = calcSalary / 100;
            totalSalary =   salary - calcsalary2;
            salary = totalSalary;
            System.out.println( employeename+", 10% tax has been deducted from your salary! Total salary: "+ salary);



    }

    public double fullTimeEmployee(){
        double calcSalary = 5 * salary;
        double calcsalary2 = calcSalary / 100;
        if(salary > 3000){
            totalSalary = calcsalary2 + salary;
            salary = totalSalary;
            System.out.println("Congratulations!, "+ employeename + " a 5% performance fee has been added to your salary! Total salary is: " + salary);
            return salary;
        }else{
            System.out.println( employeename + ", Your monthly salary is " + salary);
            return salary;
        }
    }

    public double partTimeEmployee(){
        salary = hours * hourlyrate;
        totalSalary = salary + 100;
        if(hours > 100){
            salary = totalSalary;
            System.out.println("Congratulations! "+ employeename + ", you have received $100 bonus having worked more than 100 hours! Total salary: "+ totalSalary);
            return salary;
        }else{
            System.out.println(employeename + ", Your salary is "+ salary);
            return salary;
        }
    }

    public double contractEmployee(){
        double transportallowance = 200;
        if(salary < 2000){
            salary += transportallowance;
            System.out.println("Congratulations!, " + employeename + " you have received $200 transport allowance. Total salary: " + salary);
            return salary;
        }else{
            System.out.println(employeename+ ", Your salary is: " + salary);
            return salary;
        }
    }

    public void employeeService(){
        switch (employmenttype){
            case "Full-time":
                fullTimeEmployee();
                break;
            case  "Part-time":
                partTimeEmployee();
                break;
            case "Contract":
           contractEmployee();
                break;
            default:
                throw new IllegalArgumentException("Please enter a valid employment type!");

        }
    }

    public void yearlyEarning(){
        double yearlysalary = salary;

        switch (employmenttype){
            case "Full-time":
                yearlysalary*=12;
                System.out.println(employeename + ", Your estimated yearly earnings is: "+ yearlysalary);
                break;
            case "Part-time":
                yearlysalary *=12;
                System.out.println(employeename + ", Your estimated yearly earnings is: "+ yearlysalary);
                break;
            case "Contract":
                yearlysalary *=12;
                System.out.println(employeename + ", Your estimated yearly earnings is: "+ yearlysalary);
                break;
            default:
                throw new IllegalArgumentException("Please enter a valid employment type!");
        }
    }




    public double getSalary() {
        return salary;
    }



    public int getEmployeeid() {
        return employeeid;
    }

    public int getHourlyrate() {
        return hourlyrate;
    }

    public int getHours() {
        return hours;
    }

    public String getEmployeename() {
        return employeename;
    }

    public String getEmploymenttype() {
        return employmenttype;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public void setEmploymenttype(String employmenttype) {
        this.employmenttype = employmenttype;
    }

    public void setHourlyrate(int hourlyrate) {
        this.hourlyrate = hourlyrate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee("Full-time", "Joy", 101, 3200, 0, 0);
        Employee employee2 = new Employee("Part-time", "Peter", 102, 0, 120, 10);
        Employee employee3 = new Employee("Contract", "Oscar", 103, 1800, 0, 0);
        employee1.employeeService();
        employee2.employeeService();
        employee3.employeeService();
        employee1.yearlyEarning();
        employee2.salaryBonus();
        employee3.taxDeduction();
    }
}
