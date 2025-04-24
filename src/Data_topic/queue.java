package Data_topic;
import java.util.LinkedList;
import java.util.Queue;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> myqueue = new LinkedList<>();

        // Enqueue elements (from the end)
        myqueue.offer(10);
        myqueue.offer(20);
        myqueue.offer(30);
        myqueue.offer(5);
        System.out.println(myqueue);

        // Peek at the front/first element
        System.out.println(myqueue.peek());

        // Dequeue an element(removes the front/first element)
        myqueue.poll();
        System.out.println(myqueue);

        // Check if empty
        System.out.println(myqueue.isEmpty());

    }
}
