package Data_topic;
import java.util.Comparator;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        // Treemap automatically sort elements in ascending order
        TreeMap<Integer, String> student = new TreeMap<>();

        // You can sort in descending order by adding Comparator.reverseOrder()
        TreeMap<Integer, String> studenttwo = new TreeMap<>(Comparator.reverseOrder());

        // Adding key-value pairs
        student.put(102, "Vince");
        student.put(104, "Alice");
        student.put(105, "Charlie");
        student.put(103, "John");
        student.put(101, "Larry");

        studenttwo.put(103, "Vince");
        studenttwo.put(104, "Alice");
        studenttwo.put(105, "Charlie");
        studenttwo.put(102, "John");
        studenttwo.put(101, "Larry");

        System.out.println(student);
        System.out.println(studenttwo);

        // First and last key-value pair
        System.out.println(student.firstEntry());
        System.out.println(student.lastEntry());

        // Removing an entry
        student.remove(103);
        System.out.println(student);
    }
}
