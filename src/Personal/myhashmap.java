package Personal;


import java.util.HashMap;

public class myhashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> artistes = new HashMap<String, Integer>(); // Creating an hashmap

        // Add keys and values
        artistes.put("Rema", 24);
        artistes.put("Tems", 27);
        artistes.put("Fireboy", 28);
        artistes.put("Ayra", 22);

        // To access a value in the HashMap, use the get() method and refer to its key:
        System.out.println(artistes.get("Rema"));

        // To remove an item, use the remove() method and refer to the key:
        System.out.println(artistes.remove("Fireboy"));

        // To find out how many items there are, use the size() method:
        System.out.println(artistes.size());


//        artistes.clear(); To remove all items, use the clear() method:
    }
}
