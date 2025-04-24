package Personal;
import java.util.ArrayList;
import java.util.Collections;

public class List_sorting {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

      //  Sort an ArrayList of Strings alphabetically in ascending order:

        Collections.sort(cars);
        for (String i: cars){
            System.out.println(i);
        }

        // You can also sort a list in reverse order, by using the reverseOrder() method.
        Collections.sort(cars, Collections.reverseOrder());
        for (String i: cars){
            System.out.println(i);
        }



        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        // Sort an ArrayList of Numbers alphabetically in ascending order:
        Collections.sort(myNumbers);
        for (int i: myNumbers){
            System.out.println(i);
        }

        // You can also sort a list in reverse order, by using the reverseOrder() method.
        Collections.sort(myNumbers, Collections.reverseOrder());
        for (int i: myNumbers){
            System.out.println(i);
        }




    }
}
