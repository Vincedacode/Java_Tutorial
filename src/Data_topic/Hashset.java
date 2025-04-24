package Data_topic;
import java.util.HashSet;
public class Hashset {
    public static void main(String[] args) {
        HashSet<String>names = new HashSet<>();

        // Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");  // Duplicates won't be added

        System.out.println(names); // Output order is unpredictable

        // Checking if an element exists
        System.out.println(names.contains("Alice"));

        // Removing an element
        names.remove("Bob");

        System.out.println(names);


    }
}
