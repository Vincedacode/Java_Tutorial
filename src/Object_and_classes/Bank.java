package Object_and_classes;

public class Bank {
    private String accountHolderName;
    private double balance;

    public Bank(String username, double userbalance){
        this.accountHolderName = username;
        this.balance = userbalance;
    }
    public double depositMoney(double depositamount){
        double depositbalance = balance + depositamount;
        if(depositamount > 0){
            System.out.println(depositamount + " has been deposited to your account. Your balance is now " + depositbalance );
            balance = depositbalance;
            return balance;
        }else{
            System.out.println("Deposit amount must be greater than zero!");
            return balance;
        }
    }

    public double withdrawMoney(double withdrawalAmount){
        double withdrawbalance = balance - withdrawalAmount;
        if(withdrawalAmount > 0){
            if(withdrawalAmount <= balance){
                System.out.println(withdrawalAmount + " has been withdrawn from your account. Your balance is now " + withdrawbalance);
                balance = withdrawbalance;
                return  balance;
            }else{
                System.out.println("Insufficient funds!");
                return balance;
            }
        }else{
            System.out.println("Withdrawal amount cannot be less than zero");
            return balance;
        }
    }

    public void getAccountDetails(){
        System.out.println(accountHolderName + " Your account balance is " + balance);
    }

    public void setAccountHolderName(String userName){
        this.accountHolderName = userName;
    }

    public  void setBalance(double userBalance){
        if(userBalance > 0){
            this.balance = userBalance;
            System.out.println("Your balance is " + balance);
        }else{
            System.out.println("Balance cannot be less than zero!");
        }
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public double getBalance(){
        return balance;
    }





    public static void main(String[] args){
        Bank bank1 = new Bank("Bethel", 1000);
        bank1.depositMoney(500);
        bank1.withdrawMoney(700);
        bank1.withdrawMoney(1000);bank1.getAccountDetails();

    }

}
