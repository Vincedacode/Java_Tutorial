package Input_Output;
import java.io.*;


    // The class we want to serialize must implement Serializable interface. Serializable has no methods. It just marks the class as okay to serialize
    class Student implements Serializable{
        private int id;
        private transient String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public void displayStudent(){
            System.out.println("id: " + id  + " name: " + name );
        }
    }
public class Serialize_And_Deserialize {
    public static void main(String[] args) {
        // Create the object we want to save
        Student mystudent = new Student(101, "Alice");

        // SERIALIZATION: Save the object to a file
        try {
            // In Java, when we are dealing with files and need to write data, we need to create a stream to the file. The streamline is like a pipeline
            // that connects the program to the file, allowing us to send (write) data into the file.
            // Create a stream of the file "student.ser" (ObjectOutputStream) cannot directly write
            FileOutputStream fileOutputStream = new FileOutputStream("student.ser"); // .ser extension

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Write the object
            objectOutputStream.writeObject(mystudent);

            // Always close your stream
            fileOutputStream.close();
            objectOutputStream.close();

            System.out.println("Object has been successfully serialized and saved to student.ser\n");
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Error occurred: " + e.getMessage());
        }

        //  DESERIALIZATION - Read the object back
        try {
            // Open the file stream
            FileInputStream fileInputStream = new FileInputStream("student.ser");

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // reads the bytes from the file and converts those bytes back into the original Student class
            // Casting (Student) converts the general Object into a specific type (Student), allowing
          Student getstudent = (Student) objectInputStream.readObject();

            System.out.println("Object has been deserialized Here is the data: ");
            getstudent.displayStudent();

          // Close streams
            fileInputStream.close();
            objectInputStream.close();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
