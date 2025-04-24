package Data_topic;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class List_iterator {
    public static void main(String[] args) {

        // ListIterator<E> (Advanced Iterator- Forward & Backward)
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);

        // Creating a List Iterator
        ListIterator<Integer> listIterator = numbers.listIterator();

        // hasPrevious - Moves backward
        // previous - Retrieves the previous element
        // set(E) - Modifies the last accessed element

        // Forward iteration
        System.out.println("Forward Iteration:");
        while (listIterator.hasNext()) {
            int num = listIterator.next();
            System.out.println(num);

            // Modify an element
            if (num == 20) {
                listIterator.set(25); // Replaces 20 with 25
            }
        }
        System.out.println(numbers);

        // Backward iteration
        System.out.println("\n Backward Iteration:");
        while (listIterator.hasPrevious()){
            int num = listIterator.previous();
            System.out.println(num);
        }
        System.out.println("\nUpdated List: " + numbers);
    }


    }
