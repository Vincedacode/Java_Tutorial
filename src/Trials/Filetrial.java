package Trials;
import java.io.*;

public class Filetrial {
    public static void main(String[] args) {
       try{
           File myfile = new File("trial.txt");
           if(myfile.createNewFile()){
               System.out.println("File created: " + myfile.getName());
           }else {
               System.out.println(myfile.length());
               System.out.println("File already exists!");
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
