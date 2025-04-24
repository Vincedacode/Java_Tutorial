package Personal;

import java.util.InputMismatchException;
import java.util.Scanner;



public class myexception {

    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        try {
            // Block of code to try
            System.out.println("Enter your age");
            int age = myscanner.nextInt();
            myscanner.nextLine();
            if(age < 18){
               throw new ArithmeticException("You are too young to vote!.You must be at least 18");
            }else{
                System.out.println("You are qualified to vote!");
            }
        }catch ( InputMismatchException e){
            // Block of code to handle errors
            System.out.println("Age must be an integer!");
        }finally {
            // The finally_statement lets you execute code, after try...catch, regardless of the result:
            System.out.println("Thanks for using this system!");
        }
    }
}
