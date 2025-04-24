package Candidate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class candidate {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int testscore1, testscore2, testscore3, testaverage;
       String choice = "Y";
       int  totalAccepts = 0;
       int totalRejects = 0;

        try {

            while (choice == "Y") {
                System.out.println("Enter test score 1");
                testscore1 = myscanner.nextInt();
                myscanner.nextLine();

                System.out.println("Enter test score 2");
                testscore2 = myscanner.nextInt();
                myscanner.nextLine();

                System.out.println("Enter test score 3");
                testscore3 = myscanner.nextInt();
                myscanner.nextLine();

                int totalScore = testscore1 + testscore2 + testscore3;
                testaverage = totalScore / 3;

               if(testaverage >= 80 && testscore1 > 75 && testscore2  > 75 && testscore3 > 75){
                   totalAccepts += 1;
                   System.out.println("This candidate has been accepted!");
                   System.out.println("Total accepted candidates: " + totalAccepts);
               }else{
                   totalRejects += 1;
                   System.out.println("This candidate has been rejected!");
                   System.out.println("Total rejected candidates: " + totalRejects);
               }
            }
        }catch (InputMismatchException e){
            System.out.println("Please enter an integer!");
        }catch (Exception e){
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
