package Pirate;
import java.util.LinkedList;
import java.util.ArrayList;

public class piratecrew {
    public static void main(String[] args) {
        ArrayList<String> arraycrew = new ArrayList<String>();
        LinkedList<String> linkedcrew = new LinkedList<String>();

        arraycrew.add("Luffy");
        arraycrew.add("Zoro");
        arraycrew.add("Nami");
        arraycrew.add("Usopp");
        arraycrew.add("Sanji");

        arraycrew.remove(3);

        arraycrew.add(3, "Robin");

        System.out.println(arraycrew);


        linkedcrew.add("Luffy");
        linkedcrew.add("Zoro");
        linkedcrew.add("Nami");
        linkedcrew.add("Usopp");
        linkedcrew.add("Sanji");

        linkedcrew.remove(3);

        linkedcrew.add(3, "Robin");

        System.out.println(linkedcrew);

    }
}
