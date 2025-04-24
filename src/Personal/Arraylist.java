package Personal;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        cars.add("Benz");
        cars.add("BMW");
        cars.add("Lamborghini");
        cars.add("Tesla");
        System.out.println(cars);

        cars.add(1, "Audi"); // Insert element at the second position in list (1)
        System.out.println(cars);

        System.out.println( cars.get(3)); // To access an element in the ArrayList, use the get() method and refer to the index number

        cars.set(2, "Bentley"); // To modify an element, use the set() method and refer to the index number
        System.out.println(cars);

        cars.remove(1); // To remove an element, use the remove() method and refer to the index number
        System.out.println(cars);

        // To find out how many elements an ArrayList have, use the size method
        System.out.println(cars.size());

        // To remove all the elements in the ArrayList, use the clear() method
       // cars.clear();

        // Looping through arraylist with for loop

        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        // Looping through arraylist with for-each loop
        Collections.sort(cars);  // Sort cars
        for (String i : cars){
            System.out.println(i);
        }
    }
}
