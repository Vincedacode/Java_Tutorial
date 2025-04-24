//public class Student {
//    // Attributes
//    private String name;
//    private int age;
//    private String address;
//
//    private String course;
//
//    // Constructor
//    public Student(String myname, int myage, String myaddress, String mycourse) {
//        this.name = myname;
//        this.age = myage;
//        this.address = myaddress;
//        this.course = mycourse;
//    }
//
//    // Setter methods1
//    // Setter methods are used to change or set values of variables that are private
//    public void setName(String thename) {
//        this.name = thename;
//    }
//
//    public void setAge(int theage) {
//        if (theage > 0) {
//            this.age = theage;
//        } else {
//            System.out.println("Age must be positive!");
//        }
//    }
//
//    public void setAddress(String theaddress) {
//        this.address = theaddress;
//    }
//
//    public void setCourse(String thecourse) {
//        if (thecourse.equals("HTML")) {
//            System.out.println("Not a programming language!");
//        } else {
//            this.course = thecourse;
//        }
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public String getCourse() {
//        return course;
//    }
//
//    public void introduction() {
//        System.out.println("My name is " + name + " ,my age is " + age + " and I live at " + address);
//    }
//
//    public void addCourse() {
//        System.out.println(name + " is studying " + course);
//    }
//
//    public static void main(String[] args) {
//        Student mystudent = new Student("Joe", 23, "Lagos", "Java");
//        mystudent.setAge(-1);
//        mystudent.introduction();
//        mystudent.addCourse();
//    }
//
//
//}
