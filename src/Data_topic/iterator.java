package Data_topic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {
    public static void main(String[] args) {
        // Iterator<E> (Basic Iterator - Forward only)
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Creating an Iterator
        Iterator<String> myiterator = names.iterator();

        // Checking first element in an iterator
        System.out.println(myiterator.next());

        // Iterating through the list
        // hasNext() - Checks if more elements exist
        // next() - Retrieves the next element
        // remove() - Deletes the current element safely

        while (myiterator.hasNext()){
            String element = myiterator.next();
            System.out.println(element);

            // Remove an element
            if(element.equals("Bob")){
                myiterator.remove();
            }
        }

        System.out.println("After removing Bob: " + names);
    }
}
