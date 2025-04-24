package Personal;
import java.util.Collections;
import java.util.LinkedList;
public class Linkedlist<S> {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>(); // Create a Linkedlist object
        cars.add("Benz");
        cars.add("BMW");
        cars.add("Lamborghini");
        cars.add("Tesla");
        System.out.println(cars);

        cars.addFirst("Maybach"); // Adds an item to the beginning of the list

        cars.addLast("Cybertruck"); // Adds an item to the end of the list

        System.out.println(cars.getFirst()); // Get the item at the beginning of the list

        System.out.println(cars.getLast()); // Get the item at the end of the list

        cars.removeFirst(); // Remove an item from the beginning of the list

        cars.removeLast(); // Remove an item from the end of the list

        cars.add(1, "Audi"); // Insert element at the second position in list (1)
        System.out.println(cars);

        System.out.println( cars.get(3)); // To access an element in the ArrayList, use the get() method and refer to the index number

        cars.set(2, "Bentley"); // To modify an element, use the set() method and refer to the index number
        System.out.println(cars);

        cars.remove(1); // To remove an element, use the remove() method and refer to the index number
        System.out.println(cars);

        // To find out how many elements a linkedlist have, use the size method
        System.out.println(cars.size());

        // To remove all the elements in the linkedlist, use the clear() method
        // cars.clear();

        // Looping through linkedlist with for loop

        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        // Looping through linkedlist with for-each loop
        Collections.sort(cars);  // Sort cars
        for (String i : cars){
            System.out.println(i);
        }

    }

}
