package Market;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

class Userbalance{
  protected   double balance = 10000;




}
class Marketprice extends Userbalance{
    Userbalance myuser= new Userbalance();
    private String product;

    private double price;

    public Marketprice(String productname, double productprice){
        this.product = productname;
        this.price = productprice;
    }

    public void calcUser(){
        double user = myuser.balance;
        double calcbalance = user - price;
        LocalDate mydate = LocalDate.now();
        LocalDateTime mydatetime = LocalDateTime.now();
        LocalTime mytime = LocalTime.now();
        if(price <= user){
            System.out.println(product + " successfully bought at a price of " + price + ", balance remaining is " + calcbalance + ". Transaction date and time: " + mydatetime);
        }else{
            System.out.println("Insufficient balance to proceed with transaction!. Transaction date and time: " + mydatetime);
        }
    }
}
public class market {
   public static void main(String[] args){
       Marketprice order1 = new Marketprice("Iphone 16", 2000);
       Marketprice order2 = new Marketprice("Mac Pro", 30000);
       order1.calcUser();
       order2.calcUser();
   }



}
