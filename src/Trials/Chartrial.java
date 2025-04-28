package Trials;
import java.io.*;
public class Chartrial {
    public static void main(String[] args) {
        try{
            BufferedReader myreader = new BufferedReader(new FileReader("java.txt"));
            String line;
            while ((line = myreader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
