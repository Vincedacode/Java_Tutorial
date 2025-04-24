package Object_and_classes;

import java.util.Arrays;

public class Stringclass {
    public static void main(String[] args) {
        // This is stored in string pool
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2)); // Returns true

        // This is stored in heap memory
        String str3 = new String("Morning");

        // How to intern string manually
        String str4 = "Hello";
        String str5 = new String("Hello").intern();

        System.out.println(str4 == str5);

        // String class and immutability
        String name = "Alice";
        name.concat(" Smith"); // This does not change Alice
        System.out.println(name) ;

        // To modify a string, you must reassign it
        name = name.concat(" Smith");
        System.out.println(name + " " + name.length());

        // String methods
        String str6 = "hey";
        String str7 = "GOOD";
        String str8 = "Hey there";
        String str9 = "Vincedacode";
        String str10 = "Apple";
        String str11 = "One , Two";
        String str12 = "Try";
        String str13 = "Java Programming";

        // For checking length of string
        System.out.println(str6.length());

        // For converting string to uppercase
        System.out.println(str6.toUpperCase());

        // For converting string to lowercase
        System.out.println(str7.toLowerCase());

        // For removing/trimming spaces
        System.out.println(str8.trim());

        // Checking characters at a specific index number
        System.out.println(str9.charAt(3));

        // Checking if a string contains a word or alphabet
        System.out.println(str9.contains("Vince"));

        // Extracting a substring
        System.out.println(str13.substring(5));
        System.out.println(str13.substring(0,4));

        // Finding a character or substring - Finds index of first occurence
        System.out.println(str12.indexOf("r"));

        // Replacing a character
        System.out.println(str10.replace("p", "b"));

        // Splitting strings
        System.out.println(Arrays.deepToString(str11.split(",")));
//
//        int[] thestrinngs = {1,2,3,4};
//       for(int i = 0; i < thestrinngs.length; i++){
//           int x = thestrinngs[i];
//           System.out.println(x);
//       }

        String x ="Hello";
        String y = "Hello";
        String a = new String("Hello");
        String b = new String("Hello");
        System.out.println(x == y);
        System.out.println(x.equals(y));
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
