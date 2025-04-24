package Employee_Services;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Employeeinput {

   ;



    static double fullTImeService(){
      try {
          double yearlySalary;
          double tax1, tax2;
          Scanner myscanner = new Scanner(System.in);
          System.out.println("Enter your monthly salary: ");
          double salary = myscanner.nextDouble();
          myscanner.nextLine();
          if(salary > 3000){
              double calcSalary = 5 * salary;
              double calcsalary2 = calcSalary / 100;
              salary += Math.round(calcsalary2);
              tax1 = 10 * salary;
              tax2 = tax1 / 100;
              salary -= Math.round(tax2);
              yearlySalary = Math.round(salary * 12);
              System.out.println("Your salary for this month is " + salary + ", this is after a 5% performace fee and 10% tax deduction have been applied! Estimated yearly salary is " + yearlySalary);
              return salary;
          }
          if(salary < 1000){
              double calcSalary = 10 * salary;
              double calcsalary2 = calcSalary / 100;
              salary += Math.round(calcsalary2);
              tax1 = 10 * salary;
              tax2 = tax1 / 100;
              salary -= Math.round(tax2);
              yearlySalary = Math.round(salary * 12);
              System.out.println("Your salary for this month is " + salary + ", this is after a 10% bonus and 10% tax deduction have been applied! Estimated yearly salary is " + yearlySalary);
              return salary;
          }else {
              tax1 = 10 * salary;
              tax2 = tax1 / 100;
              salary -= Math.round(tax2);
              System.out.println(salary);
              yearlySalary = Math.round(salary * 12);
              System.out.println("Your salary for this month is " + salary + ", a 10% tax deduction has been applied! Estimated yearly salary is " + yearlySalary);
              return salary;
          }




      }catch (InputMismatchException e){
          throw new InputMismatchException("Please enter an integer!");
      }


    }

    static double partTimeService(){
       try {
           Scanner myscanner = new Scanner(System.in);
           System.out.println("Enter number of working hours: ");
           double hours = myscanner.nextDouble();
           myscanner.nextLine();

           System.out.println("Enter hourly rate: ");
           double hourlyrate = myscanner.nextDouble();
           myscanner.nextLine();

           double salary = hours * hourlyrate;
           double tax1, tax2, yearlySalary;
           if(hours > 100){
               salary += 100;
               if(salary < 1000){
                   double calcSalary = 10 * salary;
                   double calcsalary2 = calcSalary / 100;
                   salary += Math.round(calcsalary2);
                   tax1 = 10 * salary;
                   tax2 = tax1 / 100;
                   salary -= Math.round(tax2);
                   yearlySalary = Math.round(salary * 12);
                   System.out.println("Your salary for this month is " + salary + ", this is after a 10% bonus and 10% tax deduction have been applied! Estimated yearly salary is " + yearlySalary);
                   return salary;
               }else{
                   tax1 = 10 * salary;
                   tax2 = tax1 / 100;
                   salary -= Math.round(tax2);
                   yearlySalary = Math.round(salary * 12);
                   System.out.println("Your salary for this month is " + salary + ", a 10% tax deduction and $100 bonus have been applied! Estimated yearly salary is " + yearlySalary);
                   return salary;
               }

           }

           else {
               tax1 = 10 * salary;
               tax2 = tax1 / 100;
               salary -= Math.round(tax2);
               yearlySalary = Math.round(salary * 12);
               System.out.println("Your salary for this month is " + salary + ", a 10% tax deduction have been applied! Estimated yearly salary is " + yearlySalary);
               return salary;
           }
       }catch (InputMismatchException e){
           throw new InputMismatchException("Please enter an integer!");

       }
    }

    static double contractService(){
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter contract salary: ");
        double salary = myscanner.nextDouble();
        myscanner.nextLine();
        double tax1, tax2, yearlySalary;

        if(salary < 2000){
            salary += 200;
            tax1 = 10 * salary;
            tax2 = tax1 / 100;
            salary -= Math.round(tax2);
            yearlySalary = Math.round(salary * 12);
            System.out.println("Your salary for this month is " + salary + ",this is after $200 transportation allowance and a 10% tax deduction have been applied! Estimated yearly salary is " + yearlySalary);
            return salary;
        }else {
            tax1 = 10 * salary;
            tax2 = tax1 / 100;
            salary -= Math.round(tax2);
            yearlySalary = Math.round(salary * 12);
            System.out.println("Your salary for this month is " + salary + ", a 10% tax deduction have been applied! Estimated yearly salary is " + yearlySalary);
            return salary;
        }

    }


    static void MyEmployeeServices() throws Exception {
        boolean loop = true;
        String employmenttype;
        String employeename;

        int employeeid;


        Scanner myscanner = new Scanner(System.in);
       while (loop){
           try {
               System.out.println("Enter Employee name: ");
               employeename = myscanner.nextLine();
               try {
                   System.out.println("Enter Employee ID: ");
                   employeeid =  myscanner.nextInt();
                   myscanner.nextLine();
               }catch (InputMismatchException e){
                   throw new Exception("ID must be an integer!");
               }
               try {
                   System.out.println("Enter Employment type: 'Full-time', 'Part-time' or 'Contract'");
                   employmenttype = myscanner.nextLine();
               }catch (Exception e){
                   throw new Exception("Error: " + e.getMessage());
               }
               try {
                   switch (employmenttype){
                       case "Full-time":
                           fullTImeService();
                           break;
                       case  "Part-time":
                           partTimeService();
                           break;
                       case "Contract":
                           contractService();
                           break;
                       default:
                           throw new IllegalArgumentException("Please enter a valid employment type!");
                   }
               }catch (Exception e){
                   throw new Exception("Error: " + e.getMessage());

               }

           }catch (Exception e){
               throw new Exception("Error: " +e.getMessage());

           }
       }


    }
    public static void main(String[] args) throws Exception {
        MyEmployeeServices();
    }
}
