package Arrayobj;
import java.util.ArrayList;
import java.util.LinkedList;
 class Books{
     protected  String title;
     protected String author;
     protected int year;

     public Books(String title, String author, int year) {
         this.title = title;
         this.author = author;
         this.year = year;
     }


     @Override
     public String toString() {
         return "Title: " + title + ", Author: " + author + ", Year: " + year;
     }
 }
public class arrayobj {
    public static void main(String[] args) {
        Books book1 = new Books("Othello", "William Shakespeare", 1896);
        Books book2 = new Books("Eat That Frog", "Mark Twain", 2003);
        Books book3 = new Books("To catch a killer", "Mark Judge", 1998);
        Books book4 = new Books("Wuthering Heights", "William Shakespeare", 1968);
        Books book5 = new Books("Naruto", "Kishimoto", 1989);

        ArrayList<Books> mybook = new ArrayList<Books>();
        LinkedList<Books> mybooks = new LinkedList<Books>();

        mybook.add(book1);
        mybook.add(book2);

        mybooks.add(book1);
        mybooks.add(book2);
        mybooks.add(book3);
        mybooks.add(book4);
        mybooks.add(book5);
        mybooks.removeFirst();
        mybooks.addFirst(book1);


        for (int i = 0; i < mybook.size(); i++){
            System.out.println(mybook.get(i));
        }

        for (int i = 0; i < mybooks.size(); i++){
            System.out.println("\n" +mybooks.get(i));
        }

    }
}
