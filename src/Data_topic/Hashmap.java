package Data_topic;
import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        // Adding key value pairs
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charles");
        students.put(104, "David");
        students.put(101, "Eve"); // Overwrites Alice
        System.out.println(students); // Output order is unpredictable

        // Get a value using a key
        System.out.println(students.get(102));

        // Checking if a key exists
        System.out.println(students.containsKey(104));

        // Removing an entry
        students.remove(103);
        System.out.println(students);
    }
}
