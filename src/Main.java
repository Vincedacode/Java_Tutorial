import java.lang.reflect.Array;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public  static  int Addition(int fn, int ln){
        int sum =  fn + ln;
        return  sum;
    }

    public  static  String Prob(int num){
        if(num < 50){
            return  "Too Low";
        } else if (num >= 50 && num <= 80) {
            return  "Average";
        }else{
            return  "High";
        }
    }

    public  static  double Squareroot(double num){
        double result = Math.sqrt(num);
        return  result;
    }

    public  static  double MyFunc(double num){
        var result = Math.floor(num);
        return result;
    }


    public static double Percentage(double fn,double ln){
        double result = fn * ln /100;
        return  result;
    }
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int result = Addition(70,56);
        System.out.println("The addition result is " + result);
        String myprob = Prob(56);
        double percent = Percentage(22,70);
        double Squarenum = Squareroot(144);
        double Floor = MyFunc(17.6);
        System.out.println("Your score grade is "+myprob);
        System.out.println(percent + "%");
        System.out.println(Squarenum);
        System.out.println(Floor);
        Scanner myscan = new Scanner(System.in);

        boolean run = true;
        double firstnumber;
        double secondnumber;

        while (run) {
            System.out.print("Enter an operator. Pick either '+' to add, '-' to minus, '*' to multiply , '/' to divide, 'm' for modulus or q to quit");
            String myoperator = myscan.next();

            if (myoperator.equals("q")) {
                System.out.println("Exiting program...");
                break;
            }

            System.out.print("Enter first number: ");
            firstnumber = myscan.nextDouble();

            System.out.print("Enter second number: ");
            secondnumber = myscan.nextDouble();
            myscan.nextLine();

            double myresult;

            switch (myoperator) {
                case "+":
                    myresult = firstnumber + secondnumber;
                    System.out.println("Addition of " + firstnumber + " and " + secondnumber + " is " + myresult);
                    break;
                case "-":
                    myresult = firstnumber - secondnumber;
                    System.out.println("Subtraction of " + firstnumber + " and " + secondnumber + " is " + myresult);
                    break;
                case "*":
                    myresult = firstnumber * secondnumber;
                    System.out.println("Multiplication of " + firstnumber + " and " + secondnumber + " is " + myresult);
                    break;
                case "/":
                    if (secondnumber == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                    } else {
                        myresult = firstnumber / secondnumber;
                        System.out.println("Division of " + firstnumber + " and " + secondnumber + " is " + myresult);
                    }
                    break;
                case "m":
                    myresult = firstnumber % secondnumber;
                    System.out.println("Modulus of " + firstnumber + " and " + secondnumber + " is " + myresult);
                    break;
                default:
                    System.out.println("Invalid operation! Please enter a valid operator.");
                    break;
            }
        }









        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.


    }
}