package Data_topic;
import java.util.Comparator;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {

        // Treeset automatically sort elements in ascending order
        TreeSet<Integer> Numbers = new TreeSet<>();

        // You can sort in descending order by adding Comparator.reverseOrder()
        TreeSet<Integer> Numberstwo = new TreeSet<>(Comparator.reverseOrder());

        // Adding elements
        Numbers.add(10);
        Numbers.add(20);
        Numbers.add(40);
        Numbers.add(50);
        Numbers.add(30);
        System.out.println(Numbers); // Displays ascending order

        // Adding elements
        Numberstwo.add(10);
        Numberstwo.add(20);
        Numberstwo.add(40);
        Numberstwo.add(50);
        Numberstwo.add(30);
        System.out.println(Numberstwo); // Displays descending order

        // Getting First and last elements

        System.out.println(Numbers.first());
        System.out.println(Numbers.last());

        // Removing an element

        Numbers.remove(20);

        System.out.println(Numbers);

    }
}
