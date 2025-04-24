package Personal;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tryregex {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your phone number!");
        String phoneNumber = myScanner.nextLine();

        Pattern myPattern = Pattern.compile("^\\+\\d{1,3}\\d{4,12}$");
        Matcher myMatcher = myPattern.matcher(phoneNumber);
        boolean isMatching = myMatcher.matches();

        if (isMatching) {
            System.out.println("Valid Phone Number!");
        } else {
            System.out.println("Invalid Phone Number!");
        }

        myScanner.close();
    }
}
