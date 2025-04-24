package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {


    public static void main(String[] args) {
        // Define the regex pattern
        Pattern mypattern = Pattern.compile("Java");

        // Create matcher object for finding matches
        Matcher mymatcher = mypattern.matcher("I love Java programming");

        // Check if pattern is found in the text
        boolean matchFound = mymatcher.find();

        if(matchFound){
            System.out.println("Match Found!");
        }else{
            System.out.println("Match not found!");
        }

        String mytext = "C# is my favorite programming language. C# is powerful!";

        Pattern pattern2 = Pattern.compile("C#");
        Matcher matcher2 = pattern2.matcher(mytext);
        while (matcher2.find()){ // Keep finding C# in the text
            System.out.println("Found at index: " + matcher2.start());
        }

        //matches()
        Pattern pattern3 = Pattern.compile("Golang");
        Matcher matcher3 = pattern3.matcher("Golang");

        boolean isMatch = matcher3.matches();
        System.out.println("Does the whole string match? " + isMatch);

        String phone = "+2349069753398";
        Pattern pattern4 = Pattern.compile("^\\+234\\d{10}$");
        Matcher matcher4 = pattern4.matcher(phone);
        boolean ismatching = matcher4.matches();
        if(ismatching){
            System.out.println("Valid phone number!");
        }else {
            System.out.println("Invalid phone number!");
        }

        String phonecode ="+1";
        Pattern pattern5 = Pattern.compile("^\\+\\d{1,3}$");
        Matcher matcher5 = pattern5.matcher(phonecode);
        if(matcher5.matches()){
            System.out.println("Valid phone code!");
        }else{
            System.out.println("Invalid phone code");

        }

        // Using regex to match a price
        String price = "$235.99";
        Pattern pattern6 = Pattern.compile("\\$\\d+\\.\\d{2}");// Matches $5.99
        Matcher matcher6 = pattern6.matcher(price);
        if(matcher6.matches()){
            System.out.println("Valid price!");

        }else{
            throw new IllegalArgumentException("Invalid price!");
        }

        // Replace all spaces in a sentence using regex
        String atext = "Hello World,Regex is fun!";
        String newtext = atext.replaceAll("\\s", "_");
        System.out.println(newtext);

        String testext1 = "hello@gmail.com";
        String testext2 = "user.name@yahoo.com";
        String testext3 = "admin_123@company-site.com";
        String testext4 = "test@my_domain.net";
        Pattern pattern7 = Pattern.compile("^\\w+@[a-zA-Z_]+\\.[a-zA-Z]{2,3}$");
        Matcher testmatch = pattern7.matcher(testext1);

        if(testmatch.matches()){
            System.out.println("Email is valid!");
        }else{
            throw new IllegalArgumentException("Invalid Email! Enter a valid email");
        }

        String secondtest1 = "123-9876543210";
        String secondtest2 = "98-1234567890";
        String secondtest3 = "9876543210";
        String secondtest4 = "12-12345";
        Pattern pattern8 = Pattern.compile("^(\\d{2,3}-)?\\d{10}$");
        Matcher testmatch2 = pattern8.matcher(secondtest1);
        if(testmatch2.matches()){
            System.out.println("Valid phone number!");
        }else{
            throw new IllegalArgumentException("Invalid phone number!");
        }

        String thirdtest1 = "hello@gmail.com";
        String thirdtest2= "user.name@yahoo.com";
        String thirdtest3 = "website123@domain.net";
        String thirdtest4 = "admin@site.abcde";

        Pattern pattern9 = Pattern.compile("^\\w+@\\w+\\.\\w{2,3}$");
        Matcher testmatch3 = pattern9.matcher(thirdtest2);
        if(testmatch3.matches()){
            System.out.println("Valid email address");
        }else{
            throw new IllegalArgumentException("Invalid email!");
        }
    }


}
