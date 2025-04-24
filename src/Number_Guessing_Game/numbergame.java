package Number_Guessing_Game;

import java.util.Scanner;

public class numbergame {
    double num = Math.random() * 100;
    int num2 = (int) Math.round(num);
    public static void main(String[] args){
        boolean loop = true;
        Scanner myscanner = new Scanner(System.in);
        numbergame mynumber = new numbergame();

       while (loop){
           System.out.println("Guess the random number computer generated!");
           int userinput = myscanner.nextInt();
           myscanner.nextLine();

           if(userinput == mynumber.num2){
               System.out.println("Congratulations, you guessed right!");
           } else if (userinput < mynumber.num2) {
               System.out.println("You guessed too low. Computer generated " + mynumber.num2);
           } else if (userinput > mynumber.num2) {
               System.out.println("You guessed too high. Computer generated " + mynumber.num2);
           }
       }

    }
}
