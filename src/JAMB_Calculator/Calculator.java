package JAMB_Calculator;


import java.util.Scanner;

public class Calculator {
    Scanner myscanner = new Scanner(System.in);
    public void Calc(){
        boolean loop = true;
        System.out.println("Welcome to Vincedacode Academy Admission Probability Portal");
        System.out.println("You have to enter your correct JAMB score for each subject");

        while (loop){
            System.out.println("Press 'c' to continue or 'q' to quit");
            String input = myscanner.nextLine();

            System.out.println("We offer 3 courses. Select 'M' for Medicine, 'L' for Law or 'A' for Accounting");
            String course =  myscanner.nextLine();
             if(input.equals("q")){
                System.out.println("Exiting calculator...");
                break;
            }

             switch(course){
                 case "M":
                     if(input.equals("c") || input.equals("C")) {
                         System.out.println("Enter your score for Physics");
                         int physicsscore = myscanner.nextInt();

                         System.out.println("Enter your score for Chemistry");
                         int chemscore = myscanner.nextInt();

                         System.out.println("Enter your score for Biology");
                         int bioscore = myscanner.nextInt();

                         System.out.println("Enter your score for English");
                         int engscore = myscanner.nextInt();
                         myscanner.nextLine();

                         int admissionscore = 300;
                         int result = physicsscore + chemscore + bioscore + engscore;

                         if(physicsscore<= 100 && physicsscore >=0 && chemscore <= 100 && chemscore >=0 && bioscore <= 100 && bioscore >= 0 && engscore <= 100 && engscore >= 0){
                             if(result >= admissionscore){
                                 System.out.println("✅You are qualified for our admission examination with a JAMB score of " + result);
                             }else{
                                 System.out.println("❌Your score didn't meet admission score requirements for Medicine, kindly consider  other courses!");
                             }
                         }else{
                             System.out.println("Subject score can't be higher than 100 or lower than 0!");
                         }
                     }else{
                         System.out.println("Invalid value entered!");
                         break;

                     }
                     break;
                 case "L":
                     if(input.equals("c") || input.equals("C")) {
                         System.out.println("Enter your score for Literature");
                         int litscore = myscanner.nextInt();

                         System.out.println("Enter your score for Government");
                         int govscore = myscanner.nextInt();

                         System.out.println("Enter your score for Mathematics");
                         int mathscore = myscanner.nextInt();

                         System.out.println("Enter your score for English");
                         int engscore = myscanner.nextInt();
                         myscanner.nextLine();

                         int admissionscore = 300;
                         int result = litscore + govscore + mathscore + engscore;

                         if(litscore<= 100 && litscore >=0 && govscore <= 100 && govscore >=0 && mathscore <= 100 && mathscore >= 0 && engscore <= 100 && engscore >= 0){
                             if(result >= admissionscore){
                                 System.out.println("✅You are qualified for our admission examination with a JAMB score of " + result);
                             }else{
                                 System.out.println("❌Your score didn't meet admission score requirements for Law, kindly consider  other courses!");
                             }
                         }else{
                             System.out.println("Subject score can't be higher than 100 or lower than 0!");
                         }
                     }else{
                         System.out.println("Invalid value entered!");
                         break;

                     }
                     break;
                 case "A":
                     if(input.equals("c") || input.equals("C")) {
                         System.out.println("Enter your score for Account");
                         int accountscore = myscanner.nextInt();

                         System.out.println("Enter your score for Commerce");
                         int commercescore = myscanner.nextInt();

                         System.out.println("Enter your score for Government");
                         int govscore = myscanner.nextInt();

                         System.out.println("Enter your score for English");
                         int engscore = myscanner.nextInt();
                         myscanner.nextLine();

                         int admissionscore = 300;
                         int result = accountscore + commercescore + govscore + engscore;

                         if(accountscore<= 100 && accountscore >=0 && commercescore <= 100 && commercescore >=0 && govscore <= 100 && govscore >= 0 && engscore <= 100 && engscore >= 0){
                             if(result >= admissionscore){
                                 System.out.println("✅You are qualified for our admission examination with a JAMB score of " + result);
                             }else{
                                 System.out.println("❌Your score didn't meet admission score requirements for Accounting, kindly consider  other courses!");
                             }
                         }else{
                             System.out.println("Subject score can't be higher than 100 or lower than 0!");
                         }
                     }else{
                         System.out.println("Invalid value entered!");
                         break;

                     }
                     break;
                 default:
                     System.out.println("Invalid value entered! Please enter either 'M', 'L' or 'A'");
             }

               }




        myscanner.close();


    }

    public static void main(String[] args){
        Calculator calc1 = new Calculator();
        calc1.Calc();
    }
}
