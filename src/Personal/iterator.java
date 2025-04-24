package Personal;
import java.util.ArrayList;
import java.util.Iterator;


public class iterator {
    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> myiterator = cars.iterator();

        // Print the first item
        System.out.println(myiterator.next());

        // To loop through a collection, use the hasNext() and next() methods of the Iterator
        while (myiterator.hasNext()){
            System.out.println(myiterator.next());
        }

        // Iterators are designed to easily change the collections that they loop through. The remove() method can remove items from a collection while looping.
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> numberiterator = numbers.iterator();
        while (numberiterator.hasNext()){
            Integer numberlessthan10 = numberiterator.next();
            if(numberlessthan10 < 10){
                numberiterator.remove();
            }
            System.out.println(numbers);
        }
    }
}
