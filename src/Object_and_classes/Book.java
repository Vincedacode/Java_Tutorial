package Object_and_classes;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable = true;

    public Book(String booktitle, String bookauthor, boolean isbookAvailable){
        this.title = booktitle;
        this.author = bookauthor;
        this.isAvailable = true;
    }

    public void borrowBook(){
        if(isAvailable){
         isAvailable = false;
         System.out.println("You have successfully borrowed "+ title);
        }else{
            System.out.println(title + " has already been borrowed!");
        }
    }

    public void returnBook(){
        if(!isAvailable){
            isAvailable = true;
            System.out.println("You have successfully returned "+ title);
        }else{
            System.out.println(title + " has already been returned!");
        }
    }

    public void displayBookInfo(){

        System.out.println(title + " by " + author  );
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public boolean isbookAvailable(){
        return  isAvailable;
    }

    public  static  void main(String[] args){
//        Book newbook = new Book("Othello", "William Shakespeare", true);
//        newbook.displayBookInfo();
    }

}
