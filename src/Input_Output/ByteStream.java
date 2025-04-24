package Input_Output;
import java.io.*;
public class ByteStream {
    public static void main(String[] args) {
        try{
            FileInputStream inputfile = new FileInputStream("image.jpg"); // Reads binary data from the file
            FileOutputStream outputfile = new FileOutputStream("newimage.jpg"); // Writes binary data to a file

            int data;
            while ((data = inputfile.read()) != -1){ // Reads byte by byte
                outputfile.write(data); // Writes binary data, creates the file if it doesn't exist or overwrites if it exists
                System.out.println(data);
            }
            inputfile.close();
            outputfile.close();
        }catch (IOException e){
           e.printStackTrace();
        }catch (Exception e){
            System.out.println("Error occurred!: " + e.getMessage());
        }
    }
}
