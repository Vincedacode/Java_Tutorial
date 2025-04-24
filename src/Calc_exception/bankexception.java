package Calc_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bankexception {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        try{
            System.out.println("Enter your account balance: ");
            double balance = myscanner.nextDouble();

            System.out.println("Enter withdrawal amount: ");
            double withdrawalamount = myscanner.nextDouble();

            if(balance < 0){
                throw new IllegalArgumentException("Balance must be positive!");
            }

            if(withdrawalamount < 0){
                throw new IllegalArgumentException("Amount must be positive!");
            }

            if(withdrawalamount > balance){
                throw new ArithmeticException("Insufficient funds!");
            }

            double amount = balance - withdrawalamount;
            System.out.println(withdrawalamount + " has been debited from your account. Balance is: " + amount);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid amount! Enter a number.");
        }
        catch (Exception e){
            System.out.println("Error encountered: "+ e.getMessage());
        }
    }
}
