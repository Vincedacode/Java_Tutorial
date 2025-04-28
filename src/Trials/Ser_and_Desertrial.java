package Trials;
import java.io.*;
class Userdetails implements Serializable{
    private int userid;
    private transient String username;

    private String password;

    public Userdetails(int userid, String username, String password) {
        this.userid = userid;
        this.username = username;
        this.password = password;
    }


    public void displayUsers(){
        System.out.println("id: " + userid  + " name: " + username );
    }
}
public class Ser_and_Desertrial {
    public static void main(String[] args) {
        Userdetails newuser = new Userdetails(001, "Vincedacode", "vincedakilla");
        Userdetails newuser2 = new Userdetails(002, "Rema" ,"Anotherbanger");
       try{
           FileOutputStream myfile = new FileOutputStream("users.ser");
           ObjectOutputStream savedobject = new ObjectOutputStream(myfile);
           savedobject.writeObject(newuser);
           savedobject.writeObject(newuser2);
           System.out.println("User successfully serialized!");
           myfile.close();
           savedobject.close();
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }

       try {
           FileInputStream myfile = new FileInputStream("users.ser");
           ObjectInputStream getsavedobjects = new ObjectInputStream(myfile);

           Userdetails myusers = (Userdetails) getsavedobjects.readObject();
           System.out.println("Users successfully deserialized!");
           myusers.displayUsers();

           myfile.close();
           getsavedobjects.close();
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
    }
}
