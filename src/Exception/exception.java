package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


// Checked Custom Exceptions
class CheckedCustomException extends Exception{
    public CheckedCustomException(String errormessage){
        super(errormessage);
    }
}

// Unchecked Custom Exceptions
class UnCheckedCustomException extends RuntimeException{
    public UnCheckedCustomException(String errormessage){
        super(errormessage);
    }
}

public class exception {
    public static void main(String[] args) {
        // Checked Exceptions(Compile-time exceptions)
        try{
            File myfile = new File("notexisting.txt"); // a pointer to a possible file
//            myfile.createNewFile(); This actually creates file on disk
            Scanner reader = new Scanner(myfile); // This may throw file not found error
            reader.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found! Please check the filename");
        }

        // Unchecked Exceptions(Runtime exceptions)
        try{
            int result = 10/0; // Causes Arithmetic Exception
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        }finally {
            System.out.println("This will always execute");
        }

        // Try-Catch
        try{
            int[] numbers = {1,2,3};
            System.out.println(numbers[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds!");
        }

        try{
            Scanner myscanner = new Scanner(System.in);
            System.out.println("Enter your age");
           int age =  myscanner.nextInt();
           myscanner.nextLine();
            int i = 23 / age;
            myscanner.close();
        }
        catch (InputMismatchException | ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }

        // Multiple catch blocks
        try{
            int[] arr = new int[3];
            arr[5] = 10; // Cause ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index out of bounds");
        }catch (ArithmeticException e){
            System.out.println("Error: Division by zero!");
        }catch (Exception e){
            System.out.println("General error occurred: "+ e);
        }

        // throw keyword
        int age = -5;
        if (age < 0){
            throw new IllegalArgumentException("Age cannot be negative!");
        }else{
            System.out.println("Your age is: " + age);
        }


    }
}
