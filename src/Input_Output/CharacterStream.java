package Input_Output;
import java.io.*;
public class CharacterStream {
    public static void main(String[] args) {
        try {
            // You can't just pass a text file directly to BufferedReader - It needs a Reader
            // FileReader reads the file character-by-character
            // BufferedReader adds speed and convenience, especially by letting you read whole lines
            BufferedReader myreader = new BufferedReader(new FileReader("git.txt"));
            String line;
            while ((line = myreader.readLine()) != null){
                System.out.println(line); // Prints each line
            }
            myreader.close();
        }catch (IOException e){
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
