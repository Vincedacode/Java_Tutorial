package Thrift_Market;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThriftMarket {
    ArrayList<String> productlist = new ArrayList<>();
    ArrayList<Double> pricelist = new ArrayList<>();

    HashMap<String, String> userlist = new HashMap<>();

    static Scanner myscanner = new Scanner(System.in);
    protected String username;
    protected String password;
    protected double price;
    protected String productname;
    protected double sellerbalance;

    protected  double buyerbalance = 10000;

    protected boolean loop = true;

    public void ThriftMarketServices(){
      while (loop){
          try{
              System.out.println("Welcome to Thrift Market Services");
              System.out.println("Pick one of the options below");
              System.out.println("1. Buy");
              System.out.println("2. Sell");
              System.out.println("3. Exit");
              int userchoice = myscanner.nextInt();
              if(userchoice == 3){
                  System.out.println("Exiting program..");
                  break;
              }
              switch (userchoice){
                  case 1:
                      BuyServices();
                      break;
                  case 2:
                      SellServices();
                      break;
                  default:
                      System.out.println("Please enter a valid option");
                      break;
              }
          }catch (InputMismatchException e){
              System.out.println("Please enter a valid input!");
              continue;
          }catch (Exception e){
              System.out.println("Error occurred: " + e.getMessage());
              continue;
          }
      }
      }
      public void BuyServices(){
        try{
            System.out.println("Welcome Buyer!");
            System.out.println("Pick one of the options below");
            System.out.println("1. Create Buyer Account");
            System.out.println("2. Login Buyer Account");
            int userchoice = myscanner.nextInt();
            switch (userchoice){
                case 1:
                    createBuyerAccount();
                    break;
                case 2:
                    loginBuyerAccount();
                    break;
                default:
                    System.out.println("Please enter a valid option!");
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a valid input!");
        }catch (Exception e){
            System.out.println("Error occurred: " + e.getMessage());
        }
      }
      public void createBuyerAccount(){

            try{
                System.out.println("Enter username");
                username = myscanner.next();

                System.out.println("Enter password");
                password = myscanner.next();

                if(password.length() < 8 || password.length() > 32){
                    System.out.println("Password length cannot be less than 8 or more than 32!");
                    BuyServices();
                }
                userlist.put(username, password);
                System.out.println(username + " has been successfully registered");
                BuyServices();


            }
            catch (InputMismatchException e){
                System.out.println("Please enter a valid input!");
                BuyServices();
            }catch (Exception e){
                System.out.println("Error occurred: " + e.getMessage());
            }
        }

        public void loginBuyerAccount(){
            try {
                System.out.println("Enter username to login");
                username = myscanner.next();
                System.out.println("Enter password to login");
                password = myscanner.next();
                boolean isUserExisting = userlist.containsKey(username);
                boolean isPasswordExisting = userlist.containsValue(password);
                if(isUserExisting && isPasswordExisting){
                    System.out.println(username + " successfully logged in");
                    buyProduct();
                }else{
                    System.out.println("Account not found! Please check login details or create an account");
                    BuyServices();
                }
            } catch (InputMismatchException e){
                System.out.println("Please enter a valid input!");
            }catch (Exception e){
                System.out.println("Error occurred: " + e.getMessage());
            }
        }

        public void SellServices(){

            try{
                System.out.println("Welcome Seller!");
                System.out.println("Pick one of the options below");
                System.out.println("1. Create Seller Account");
                System.out.println("2. Login Seller Account");
                int userchoice = myscanner.nextInt();
                switch (userchoice){
                    case 1:
                        createSellerAccount();
                        break;
                    case 2:
                        loginSellerAccount();
                        break;
                    default:
                        System.out.println("Please enter a valid option!");
                        break;
                }
            }
            catch (InputMismatchException e){
                System.out.println("Please enter a valid input!");
        }catch (Exception e){
                System.out.println("Error occurred: " + e.getMessage());
            }
        }

    public void createSellerAccount(){

        try{
            System.out.println("Enter username");
            username = myscanner.next();

            System.out.println("Enter password");
            password = myscanner.next();

            if(password.length() < 8 || password.length() > 32){
                System.out.println("Password length cannot be less than 8 or more than 32!");
                SellServices();
            }
            userlist.put(username, password);
            System.out.println(username + " has been successfully registered");
            SellServices();


        }
        catch (InputMismatchException e){
            System.out.println("Please enter a valid input!");
            SellServices();
        }catch (Exception e){
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    public void loginSellerAccount(){
        try {
            System.out.println("Enter username to login");
            username = myscanner.next();
            System.out.println("Enter password to login");
            password = myscanner.next();
            boolean isUserExisting = userlist.containsKey(username);
            boolean isPasswordExisting = userlist.containsValue(password);
            if(isUserExisting && isPasswordExisting){
                System.out.println(username + " successfully logged in");
                sellProduct();
            }else{
                System.out.println("Account not found! Please check login details or create an account");
                SellServices();
            }
        } catch (InputMismatchException e){
            System.out.println("Please enter a valid input!");
            SellServices();
        }catch (Exception e){
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    public void sellProduct(){
       try{
           System.out.println("Enter product name");
           productname = myscanner.next();
           System.out.println("Enter product price");
           price = myscanner.nextDouble();
           if(price < 0){
               System.out.println("Price cannot be less than zero!");
           }
           productlist.add(productname);
           pricelist.add(price);
           sellerbalance += price;
               System.out.println(productname + " has been sold at a price of " + price + ". User balance: " + sellerbalance);

       }catch (InputMismatchException e){
           System.out.println("Please enter a valid input!");
       }catch (Exception e){
           System.out.println("Error occurred: " + e.getMessage());
       }
    }

    public void buyProduct(){
       try{
           System.out.println("Available Products: ");
           if(productlist.isEmpty()){
               System.out.println("No available products!");
           }else{
           for(int i = 0; i < productlist.size(); i++){
               System.out.println(productlist.get(i) + " : " + pricelist.get(i));
           }
           System.out.println("Enter product you want to buy");
           productname = myscanner.next();
           boolean isProductExisting = productlist.contains(productname);
           if(isProductExisting){
               int productindex = productlist.indexOf(productname);
             if(buyerbalance >= pricelist.get(productindex)){
                 buyerbalance -= pricelist.get(productindex);
                 System.out.println(productlist.get(productindex) + " has been successfully bought at a price of " + pricelist.get(productindex) + ". User balance: " + buyerbalance);
                 productlist.remove(productindex);
                 pricelist.remove(productindex);
             }else{
                 System.out.println("Insufficient funds!");
             }
           }}
       }catch (InputMismatchException e){
           System.out.println("Please enter a valid input!");
       }catch (Exception e){
           System.out.println("Error occurred: " + e.getMessage());
       }
    }


    public static void main(String[] args) {
        ThriftMarket thriftMarket = new ThriftMarket();
        thriftMarket.ThriftMarketServices();
    }
}
