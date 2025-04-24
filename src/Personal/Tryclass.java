package Personal;

public class Tryclass {
    int x = 56;
    int y;

    int a =77;

    final  int b = 89;



    String fname = "Vincent";
    String lname= "Toluwani";

    int age = 20;

    public static void main(String[] args) { // Corrected method signature
        Tryclass useclass = new Tryclass();
        Tryclass useclass2 = new Tryclass();
        Tryclass useclass3 = new Tryclass();
        Tryclass useclass4 = new Tryclass();
        Tryclass introduction = new Tryclass();
        useclass2.x = 67;
        useclass3.y = 99;
        useclass4.a = 90;
//        useclass4.b = 90; -- Cannot override value assigned to final variable
        System.out.println(useclass.x);
        System.out.println(useclass2.x);
        System.out.println(useclass3.y);
        System.out.println(useclass4.a);
        System.out.println("My name is "+ introduction.fname + " "+ introduction.lname +  " and I am " + introduction.age + " years old");
    }
}
