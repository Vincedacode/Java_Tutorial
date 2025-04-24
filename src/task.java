import java.util.Scanner;

public class task {


    public static void main(String[] args){
        Scanner myscanner = new Scanner(System.in);

        boolean loop = true;

        while (loop){
            System.out.println("Enter a number , enter special code '9999' to quit");
            int mynumber =  myscanner.nextInt();
            myscanner.nextLine();

            if(mynumber == 9999){
                System.out.println("Exiting program...");
                break;
            }else if (mynumber == 0){
                System.out.println("Number entered is zero");
            } else if (mynumber < 0) {
                System.out.println("This is a negative number");
            }

             else{
                System.out.println("This is a positive number");
            }
        }

        myscanner.close();


    }
}
