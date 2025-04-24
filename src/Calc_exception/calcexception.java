package Calc_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calcexception {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.println("Enter first number: ");
            double fnum = myScanner.nextDouble();

            System.out.println("Enter second number: ");
            double snum = myScanner.nextDouble();

            if (snum == 0) {
                throw new ArithmeticException("Can't divide by zero");
            }

            double result = fnum / snum;
            System.out.println("Result: " + result);

        } catch (InputMismatchException e) { // Handles non-numeric input
            System.out.println("Please enter a valid number!");
        } catch (ArithmeticException e) { // Handles division by zero
            System.out.println(e.getMessage());
        } catch (Exception e) { // Handles any unexpected error
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            myScanner.close(); // Always close scanner
        }
    }
}
