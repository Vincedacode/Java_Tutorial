package Data_topic;
import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to Linkedlist
        linkedList.add(10);
        linkedList.add(20);
        linkedList.addFirst(5); // Insertion to start of the list
        linkedList.addLast(30); // Insertion to end of the list
        linkedList.add(3, 7); // Insertion to specific position on the list

        // Getting elements from Linkedlist
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        // Removing elements from Linkedlist
        linkedList.remove(4);

        System.out.println(linkedList);

    }

}
