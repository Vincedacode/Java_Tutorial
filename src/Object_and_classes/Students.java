package Object_and_classes;

class TheStudents {
    private String name;
    private int age;
    private String address;

    private String course;

    // Constructor
    public TheStudents(String myname, int myage, String myaddress, String mycourse) {
        this.name = myname;
        this.age = myage;
        this.address = myaddress;
        this.course = mycourse;
    }

    // Setter methods1
    // Setter methods are used to change or set values of variables that are private
    // Setter methods are also used to change or update values of attributes of a class
    public void setName(String thename) {
        this.name = thename;
    }

    public void setAge(int theage) {
        if (theage > 0) {
            this.age = theage;
            System.out.println("You are "+ theage +" years old!");
        } else {
            System.out.println("Age must be positive!");
        }
    }

    public void setAddress(String theaddress) {
        this.address = theaddress;
    }

    public void setCourse(String thecourse) {
        if (thecourse.equals("HTML") || thecourse.equals("CSS")) {
            System.out.println("Not a programming language!");
        } else {
            this.course = thecourse;
            System.out.println("You are studying " + thecourse);
        }
    }

    public boolean isAdult(){
        if(age >= 18){
            System.out.println("You are old enough!, you are "+ age + " years old!");
            return  true;
        }else{
            System.out.println("Wait till you are 18!");
            return  false;
        }
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getCourse() {
      return  course;
    }

    public void introduction() {
        System.out.println("My name is " + name + " ,my age is " + age + " and I live at " + address);
    }

        public void addCourse() {
        System.out.println(name + " is studying " + course);
    }



}

    // Inheritance
   class Person{
    protected String name;
    protected int age;



    public Person(String myname, int myage){
        this.name = myname;
        this.age = myage;
    }
    // Method overloading - Naming methods with same name but different parameters. It is a form of polymorphism

    public void introduce(){
        System.out.println("My name is " + name + " and I am " + age + " years old" );
    }
    public void introduce(String greeting){
        System.out.println(greeting + name);
    }
    public void introduce(String greeting, int year){
        System.out.println(greeting + name + " we are in "+ year);
    }

        // End of method overloading

        public int calculateBirthYear(int currentyear){
            int result = currentyear - age;
            System.out.println("Your birth year is "+ result + " and you are " + age + " years old");
            return result;

        }

        public  void setAge( int theage){
        if(theage < 0){
            System.out.println("Invalid age entered!");
        }else{
            this.age = theage;
            System.out.println("You are " + theage + " years old!");
        }
        }


}




class Mystudent extends Person{
    private String address;
    private int yearjoined;
    public Mystudent(String myname, int myage, String myaddress, int year) {
        super(myname, myage);
        this.address = myaddress;
        this.yearjoined = year;
    }
    public void displayStudentInfo(){
        introduce();
        System.out.println("I live at " +address);
    }

    // Method Overriding. This overrides the method inherited from the parent class
    @Override
    public int calculateBirthYear(int currentyear) {
        int birthYear = super.calculateBirthYear(currentyear);
        int yearsinschool = 2025 - yearjoined;
        System.out.println(name + " was likely born in " + birthYear + " and has been in school for " + yearsinschool + " years");
        return birthYear;
    }
}
public class Students{
    public static void main(String[] args) {
        Person newperson = new Person("kate", 15);
        TheStudents mystudent = new TheStudents("Joe", 23, "Lagos", "Java");
        mystudent.setAge(32);
        mystudent.introduction();
        mystudent.addCourse();
        mystudent.setCourse("Software Engineering");
        mystudent.isAdult();



    }
}