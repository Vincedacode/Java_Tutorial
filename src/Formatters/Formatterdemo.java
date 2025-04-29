package Formatters;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;
public class Formatterdemo {
    public static void main(String[] args) {

        // 1. Basic formatting with variables
        Formatter basicFormatter = new Formatter();
        basicFormatter.format("Name: %s%n Age: %d%n GPA: %.2f", "Alice", 21, 4.03);
        System.out.println("1. Basic Formatting:\n" + basicFormatter);
        basicFormatter.close();

        // 2. Aligning columns(right and left)
        Formatter alignFormatter = new Formatter();
        alignFormatter.format("%-10s %5s%n", "Name", "Age");
        alignFormatter.format("%-10s %5d%n", "Alice", 21);
        alignFormatter.format("%-10s %5d%n", "Bob", 25);
        System.out.println("2. Aligned Columns:\n" + alignFormatter);
        alignFormatter.close();

        // 3. Formatting numbers with different specifiers
        Formatter numberFormatter = new Formatter();
        numberFormatter.format("Decimal: %d%n", 255);
        numberFormatter.format("Hex: %x%n", 255);
        numberFormatter.format("Octal: %o%n", 255);
        numberFormatter.format("Float (2dp): %.2f%n", 3.14159);
        numberFormatter.format("Scientific: %e%n", 12345.6789);
        System.out.println("Number Formatting:\n" + numberFormatter);
        numberFormatter.close();

        // 4. Boolean and character
        Formatter miscFormatter = new Formatter();
        miscFormatter.format("Boolean true: %b%n", true);
        miscFormatter.format("Boolean false: %b%n", false);
        miscFormatter.format("Character: %c%n", 'A');
        System.out.println("4. Boolean and characters:\n" + miscFormatter);
        miscFormatter.close();

        // 5. Writing formatted text to a file
        try{
            Formatter fileFormatter = new Formatter(new FileOutputStream("mystudents.txt"));
            fileFormatter.format("%-10s %-5s %-5s%n", "Name", "Age", "Score");
            fileFormatter.format("%-10s %-5d %-5.1f%n", "Alice", 21, 90.5);
            // The field is 5 characters wide, and since 84.2 occupies 4 characters, 1 space is added to the right to meet the total width of 5
            fileFormatter.format("%-10s %-5d %-5.1f%n", "Bob", 23, 84.0);
            fileFormatter.format("%-10s %-5d %-5.1f%n", "Clara", 20, 95.2);
            System.out.println("5. Formatted text written to 'mystudents.txt' 🎉");
            fileFormatter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file " + e.getMessage());
        }

        // 6. Storing formatted text in a string
        String firstmessage = String.format("Welcome, %s! You have %d new messages.%n", "John", 3);
        System.out.println("6. Stored formatted string:\n" + firstmessage);

        Formatter stringFormatter = new Formatter();
        stringFormatter.format("Welcome, %s! You have %d new messages.%n", "Alice", 7);
        // If we didn't call .toString(), we would be passing the Formatter object itself (not the
        String secondmessage = stringFormatter.toString();
        System.out.println("6. Stored formatted string:\n" + secondmessage);
        stringFormatter.close();
    }
}
