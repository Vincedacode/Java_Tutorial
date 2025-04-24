package Personal;
import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // To check whether an item exists in a HashSet, use the contains() method
        System.out.println(cars.contains("BMW"));;

        // To remove an item, use the remove() method
        cars.remove("Volvo");

        // To remove all items, use the clear() method
       //  cars.clear();

        // To find out how many items there are, use the size method
        System.out.println(cars.size());

        // Loop through the items of an HashSet with a for-each loop
        for (String i : cars){
            System.out.println(i);
        }


        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}
