package Object_and_classes;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> mybooks;

    public  Library(){
        mybooks = new ArrayList<>();
    }

    public void addBook(Book newbook){
        mybooks.add(newbook);
    }

    public void displayavailablebooks(){
        System.out.println("\nAvailable Books:");
        for (Book book : mybooks) {
            if (book.isbookAvailable()) {
                book.displayBookInfo();
            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : mybooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }
    public void returnBook(String title) {
        for (Book book : mybooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }


    public static void main(String[] args){
        Library mylibrary = new Library();
        mylibrary.addBook(new Book("Othello", "William Shakespeare", true));
        mylibrary.addBook(new Book("Wuthering Heights", "William Shakespeare", false));
        mylibrary.addBook(new Book("Naruto", "Kishimoto", true));
        mylibrary.addBook(new Book("One Piece", "Oda", false));

        mylibrary.displayavailablebooks();
        mylibrary.borrowBook("Naruto");
        mylibrary.displayavailablebooks();
        mylibrary.returnBook("Naruto");
    }
}
