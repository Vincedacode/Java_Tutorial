package Personal;

public class Wrapper_Classes {
    public static void main(String[] args) {
        Integer myint = 67;
        Double mydouble = 90.2;
        Character mychar = 'A';
        System.out.println(myint);
        System.out.println(mychar);
        System.out.println(mydouble);

        // Since you're now working with objects, you can use certain methods to get information about the specific object.

        // For example, the following methods are used to get the value associated with the corresponding wrapper object:
        // intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().

        System.out.println(myint.intValue());
        System.out.println(mychar.charValue());
        System.out.println(mydouble.doubleValue());

        // Another useful method is the toString() method, which is used to convert wrapper objects to strings.
        Integer nextint = 100;
        String nextstring = nextint.toString();
        System.out.println(nextstring.length());
    }
}
