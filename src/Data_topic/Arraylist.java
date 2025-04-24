package Data_topic;

import java.util.ArrayList;
// import hashset, treeset, treeset, hashmap, treemap, stack, queue, iterator, list, listiterator


public class Arraylist {

    public static void main(String[] args) {
        // LISTS - Characteristics - ArrayList
        //
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to arraylist
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Grape");

        // Getting elements from arraylist
        System.out.println(arrayList.get(0));

        // Removing elements from arraylist
         arrayList.remove(3);

         // Default capacity of arraylist is 10
        // Adding more elements triggers resizing of the arraylist. A new arraylist is created and the elements of the previous is added to it.
         ArrayList<String> arrayList2 = new ArrayList<>();
         for (int i = 1; i <= 10; i++){
             arrayList2.add("Element " + i);
             System.out.println(arrayList2);
         }

         // Add the 11th element, triggering a resize
         // A new arraylist is created
         arrayList2.add("Element 11");
        System.out.println(arrayList2);
        System.out.println("Size after adding 11th element: " + arrayList2.size());
    }
}
