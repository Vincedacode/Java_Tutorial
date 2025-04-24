package Pirate;
import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceTest {
    public static void main(String[] args) {
        int count = 100_000;

        // ArrayList test
        ArrayList<String> arrayList = new ArrayList<>();
        long startArray = System.nanoTime();
        for (int i = 0; i < count; i++) {
            arrayList.add("Crew_" + i);
        }
        long endArray = System.nanoTime();
        long durationArray = endArray - startArray;
        System.out.println("ArrayList add time: " + durationArray + " ns");

        // LinkedList test
        LinkedList<String> linkedList = new LinkedList<>();
        long startLinked = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedList.add("Crew_" + i);
        }
        long endLinked = System.nanoTime();
        long durationLinked = endLinked - startLinked;
        System.out.println("LinkedList add time: " + durationLinked + " ns");
    }
}

