package Input_Output;
import java.io.*;
public class FileHandling {
    public static void main(String[] args) {
        try {
            File newfile = new File("example.txt");
            if(newfile.createNewFile()){
                System.out.println("File created: " + newfile.getName());
            }else {
                System.out.println("File already exists!");
            }
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
