package Personal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tryregex2 {
    public static void main(String[] args) {
        String mystring = "12345678";
        Pattern mypattern = Pattern.compile("^\\w{8,32}$");
        Matcher mymatch = mypattern.matcher(mystring);
        if(mymatch.matches()){
            System.out.println("Valid Password!");
        }else{
            throw new IllegalArgumentException("Invalid Password!");
        }
    }
}
