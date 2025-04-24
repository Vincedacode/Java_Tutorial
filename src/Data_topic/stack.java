package Data_topic;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> mystack = new Stack<>();

        // Push elements onto the stack(from the end)

        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(5);
        System.out.println(mystack);

        // Peek at the last element
        System.out.println(mystack.peek());

        // Pop an element(removes the last element)
        mystack.pop();
        System.out.println(mystack);

        // Check if empty
        System.out.println(mystack.isEmpty());

        // Getting index
        System.out.println(mystack.indexOf(20));

    }
}
