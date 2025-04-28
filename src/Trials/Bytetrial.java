package Trials;
import java.io.*;
public class Bytetrial {
    public static void main(String[] args) {
        try{
            FileInputStream myimage = new FileInputStream("rema.jpg");
            FileOutputStream newimage = new FileOutputStream("newrema.jpg");

            int data;
            while ((data = myimage.read()) != -1){
                newimage.write(data);
                System.out.println(data);
            }
            myimage.close();
            newimage.close();
        }catch (IOException e){
            e.printStackTrace();

        }
    }
}
