package Anime_Recommendace_System;
import java.util.*;
public class Anime {
    protected String title;
    protected  String genre;
    protected double rating;
  final  protected String adminusername = "Vincedacode";
  final  protected String adminpassword = "12345678";
  protected boolean loop = true;

  enum Genres{
      Shonen,
      Isekai
  }

    ArrayList<String> titlelist = new ArrayList<>();
    ArrayList<String> genrelist = new ArrayList<>();
    ArrayList<Double> ratinglist = new ArrayList<>();
    Queue<String> lastwatched= new LinkedList<>();
    TreeMap<String, List<Anime>> mytreemap = new TreeMap<>();

    HashMap<String,String> admindetails =  new HashMap<>();

    HashMap<String, String> userlist = new HashMap<>();
    static Scanner myscanner = new Scanner(System.in);

    public void AnimeServices(){
       while (loop){
           try{
               System.out.println("Welcome to Anime World!");
               System.out.println("1. Access as Admin");
               System.out.println("2. Access as User");
               System.out.println("3. Exit");
               int userchoice = myscanner.nextInt();
               if(userchoice == 3){
                   System.out.println("Exiting program...");
                   break;
               }
               switch (userchoice){
                   case 1:
                       AdminServices();
                       break;
                   case 2:
                       userServices();
                       break;
               }
           }catch (InputMismatchException e){
               System.out.println("Invalid value entered!");
               continue;
           }
       }
    }

    public void AdminServices(){
       try {
           System.out.println("Login Admin Account");
           System.out.println("Enter admin username");
           String username = myscanner.next();
           System.out.println("Enter admin password");
           String password = myscanner.next();
           if(password.length() < 8 || password.length() > 32){
               System.out.println("Password should be between 8 and 32 characters");
           }
           if(username.equals(adminusername) && password.equals(adminpassword)){
               AdminFeatures();
           }else{
               System.out.println("Invalid login credentials");
               AdminServices();
           }
       }
        catch (InputMismatchException e){
            System.out.println("Invalid value entered!");
            AdminFeatures();

        }

    }
    public void AdminFeatures(){
   try{
       System.out.println("Welcome Admin!");
       System.out.println("1. Add Anime");
       System.out.println("2. Update Anime");
       System.out.println("3. Delete Anime");
       System.out.println("4. View Available Anime");
       int adminchoice = myscanner.nextInt();
       switch (adminchoice){
           case 1:
               addAnime();
               break;
           case 2:
               updateAnime();
               break;
           case 3:
               deleteAnime();
               break;
           case 4:
               viewAnimeList();
               break;
           default:
               System.out.println("Please enter a valid option!");
               AdminFeatures();
       }
   }catch (InputMismatchException e){
       System.out.println("Invalid value entered!");
       AdminFeatures();

   }



    }

    public void addAnime(){
        try {

            System.out.println("Add anime by inserting title, genre and rating");
            System.out.println("Enter anime title📕");
            title = myscanner.next();
            myscanner.nextLine();
            if(titlelist.contains(title)){
                System.out.println("Anime already exists!");
                AdminFeatures();
            }
            System.out.println("Enter anime genre🎞");
            System.out.println("1. Shonen");
            System.out.println("2. Isekai");
            System.out.println("3. Sports");
            System.out.println("4. Harem");
            System.out.println("5. Shojo");
            System.out.println("6. Seinen");
            System.out.println("7. Josei");
            System.out.println("8. Kodomomuke");
            int genrechoice = myscanner.nextInt();
            myscanner.nextLine();
            if(genrechoice < 1 || genrechoice > 8){
                System.out.println("Please enter a valid option! Pick between1-8");
                addAnime();
            }
            switch (genrechoice){
                case 1:
                    genre = "Shonen";
                    break;
                case 2:
                    genre = "Isekai";
                    break;
                case 3:
                    genre = "Sports";
                    break;
                case 4:
                    genre = "Harem";
                    break;
                case 5:
                    genre = "Shojo";
                    break;
                case 6:
                    genre = "Seinen";
                    break;
                case 7:
                    genre = "Josei";
                    break;
                case 8:
                    genre = "Kodomomuke";
                    break;
                default:
                    System.out.println("Please enter a valid option! Pick between 1-8");
                    addAnime();
                    break;
            }
            System.out.println("Enter anime rating✨. 1-10");
            rating = myscanner.nextDouble();
            myscanner.nextLine();
            if(rating < 0 || rating > 10){
                System.out.println("Please rate on  a scale of 1-10");
            }

            titlelist.add(title);
            genrelist.add(genre);
            ratinglist.add(rating);
            for(int i = 0; i < titlelist.size(); i++){
                System.out.println(titlelist.get(i) + " has been added to " + genrelist.get(i) + " genre and has a rating of " + ratinglist.get(i) + "/10 ✨");
            }
            AdminFeatures();
    }
        catch (InputMismatchException e){
            System.out.println("Invalid Input entered!");
            AdminFeatures();
        }


    }
    public void updateAnime(){
        try {
            System.out.println("Update anime my inputting anime name");
            System.out.println("Enter anime name: ");
            String inputitle = myscanner.next();
            boolean checkiftitleexists = titlelist.contains(inputitle);
            if(checkiftitleexists){
                int titleindex = titlelist.indexOf(inputitle);
                System.out.println("Update anime name");
                title = myscanner.next();
                myscanner.nextLine();
                System.out.println("Update anime genre");
                System.out.println("1. Shonen");
                System.out.println("2. Isekai");
                System.out.println("3. Sports");
                System.out.println("4. Harem");
                System.out.println("5. Shojo");
                System.out.println("6. Seinen");
                System.out.println("7. Josei");
                System.out.println("8. Kodomomuke");
                int genrechoice = myscanner.nextInt();
                myscanner.nextLine();
                if(genrechoice < 1 || genrechoice > 8){
                    System.out.println("Please enter a valid option! Pick between1-8");
                    addAnime();
                }
                switch (genrechoice){
                    case 1:
                        genre = "Shonen";
                        break;
                    case 2:
                        genre = "Isekai";
                        break;
                    case 3:
                        genre = "Sports";
                        break;
                    case 4:
                        genre = "Harem";
                        break;
                    case 5:
                        genre = "Shojo";
                        break;
                    case 6:
                        genre = "Seinen";
                        break;
                    case 7:
                        genre = "Josei";
                        break;
                    case 8:
                        genre = "Kodomomuke";
                        break;
                    default:
                        System.out.println("Please enter a valid option! Pick between 1-8");
                        addAnime();
                        break;
                }
                System.out.println("Update anime rating✨. 1-10");
                rating = myscanner.nextDouble();
                myscanner.nextLine();
                if(rating < 0 || rating > 10){
                    System.out.println("Please rate on  a scale of 1-10");
                }
                titlelist.set(titleindex, title);
                genrelist.set(titleindex, genre);
                ratinglist.set(titleindex, rating);
                System.out.println(titlelist.get(titleindex) + " has been successfully updated! It has been added to " + genrelist.get(titleindex) + " genre and has a rating of " + ratinglist.get(titleindex) + "/10");
                AdminFeatures();

            }else{
                System.out.println("Anime not found!");
                AdminFeatures();
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input entered!");
            AdminFeatures();
        }

    }

    public void deleteAnime(){
       try{
           System.out.println("Delete anime my inputting anime name");
           System.out.println("Enter anime name");
           String inputname = myscanner.next();
           boolean checkifnameisexisting = titlelist.contains(inputname);
           if(checkifnameisexisting){
               int nameindex = titlelist.indexOf(inputname);
               System.out.println(titlelist.get(nameindex) + " has been successfully deleted!");
               titlelist.remove(nameindex);
               genrelist.remove(nameindex);
               ratinglist.remove(nameindex);
               AdminFeatures();
           }else{
               System.out.println("Anime not found!");
               AdminFeatures();
           }
       }catch (InputMismatchException e){
           System.out.println("Invalid Input entered!");
           AdminFeatures();
       }
    }
    public void viewAnimeList(){
     try {
         if(titlelist.isEmpty()){
             System.out.println("No available anime!");
             AdminFeatures();
         }
         else{
             System.out.println("Available Animes: ");
             for (int i = 0; i < titlelist.size(); i++){
                 System.out.println("Anime title: " + titlelist.get(i) + ". Genre: " + genrelist.get(i) + ". Rating: " + ratinglist.get(i) + "/10");
             }
             AdminFeatures();
         }
     }catch (InputMismatchException e){
         System.out.println("Invalid Input entered!");
         AdminFeatures();
     }
    }
    public void userServices(){
        try{
            System.out.println("Welcome User!");
            System.out.println("1. Create User account");
            System.out.println("2. Login User account");
            int userchoice = myscanner.nextInt();
            if(userchoice < 1 || userchoice > 2){
                System.out.println("Please pick a valid option!");
            }
            switch (userchoice){
                case 1:
                    createUser();
                    break;
                case 2:
                    loginUser();
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input entered!");
            userServices();
        }
    }
    public void createUser(){
       try{
           System.out.println("Enter username");
           String  username = myscanner.next();

           System.out.println("Enter password");
           String password = myscanner.next();

           if(password.length() < 8 || password.length() > 32){
               System.out.println("Password length cannot be less than 8 or more than 32!");
           }else {
               userlist.put(username, password);
               System.out.println(username + " has been successfully registered");
           }
       }catch (InputMismatchException e){
           System.out.println("Please enter a valid input!");
       }
       }

    public void loginUser(){
        try {
            System.out.println("Enter username to login");
           String username = myscanner.next();
            System.out.println("Enter password to login");
           String password = myscanner.next();
            boolean isUserExisting = userlist.containsKey(username);
            boolean isPasswordExisting = userlist.containsValue(password);
            if(isUserExisting && isPasswordExisting){
                System.out.println(username + " successfully logged in");
            }else{
                System.out.println("Account not found! Please check login details or create an account");
            }
        } catch (InputMismatchException e){
            System.out.println("Please enter a valid input!");
        }
    }
    public static void main(String[] args) {
        Anime myanime = new Anime();
        myanime.AnimeServices();
    }


}
