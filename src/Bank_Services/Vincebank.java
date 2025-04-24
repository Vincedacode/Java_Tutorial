package Bank_Services;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Vincebank {
    Scanner myscanner = new Scanner(System.in);
    HashMap<Long, User> users = new HashMap<>(); // Store users by account number
    User currentUser = null; // Track logged-in user

    public void Bankservices() {
        while (true) { // Loop to allow multiple users
            System.out.println("Welcome to VinceBank Services");
            System.out.println("Enter '1' to Signup, '2' to Login, '3' to Exit");
            int userinput = myscanner.nextInt();
            myscanner.nextLine(); // Consume newline

            if (userinput == 1) {
                signup();
            } else if (userinput == 2) {
                login();
            } else if (userinput == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Please enter 1, 2, or 3.");
            }
        }
    }

    private void signup() {
        System.out.println("Enter your full name:");
        String username = myscanner.nextLine();
        System.out.println("Enter your email address:");
        String email = myscanner.nextLine();
        System.out.println("Enter your password (8 to 32 characters):");
        String password = myscanner.nextLine();

        if (password.length() >= 8 && password.length() <= 32) {
            long accountNumber = generateAccountNumber();
            User newUser = new User(username, email, password, accountNumber);
            users.put(accountNumber, newUser); // Store user in HashMap

            System.out.println("Successfully registered! Your account number is: " + accountNumber);
        } else {
            System.out.println("Password must be between 8 and 32 characters!");
        }
    }

    private void login() {
        System.out.println("Enter your account number:");
        long accNum = myscanner.nextLong();
        myscanner.nextLine();

        if (users.containsKey(accNum)) {
            currentUser = users.get(accNum);
            System.out.println("Logged in successfully as " + currentUser.username);
            UserServices();
        } else {
            System.out.println("Account not found. Please sign up first.");
        }
    }

    public void UserServices() {
        if (currentUser == null) {
            System.out.println("Please log in first!");
            return;
        }

        System.out.println("Enter '1' to Deposit, '2' to Withdraw, '3' to Transfer or '4' to Check Balance ");
        int choice = myscanner.nextInt();
        myscanner.nextLine();

        if (choice == 1) {
            deposit();
        } else if (choice == 2) {
            withdraw();
        } else if (choice == 3) {
            transfer();
        } else if (choice == 4) {
            checkBalance();
        }else {
            System.out.println("Invalid input");

        }
    }

    private void checkBalance(){
        System.out.println("Your bank balance is: " + currentUser.balance);
    }

    private void deposit() {
        System.out.println("Enter deposit amount:");
        double amount = myscanner.nextDouble();
        myscanner.nextLine();

        if (amount > 0) {
            currentUser.balance += amount;
            System.out.println(amount + " deposited. New balance: " + currentUser.balance);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    private void withdraw() {
        System.out.println("Enter amount to withdraw:");
        double amount = myscanner.nextDouble();
        myscanner.nextLine();

        if (amount > 0 && amount <= currentUser.balance) {
            currentUser.balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: " + currentUser.balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    private void transfer() {
        System.out.println("Enter recipient account number:");
        long recipientAccNum = myscanner.nextLong();
        myscanner.nextLine();

        if (!users.containsKey(recipientAccNum)) {
            System.out.println("Recipient not found!");
            return;
        }

        System.out.println("Enter transfer amount:");
        double amount = myscanner.nextDouble();
        myscanner.nextLine();

        if (amount > 0 && amount <= currentUser.balance) {
            User recipient = users.get(recipientAccNum);
            currentUser.balance -= amount;
            recipient.balance += amount;

            System.out.println(amount + " transferred to " + recipient.username);
            System.out.println("Your new balance: " + currentUser.balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    private long generateAccountNumber() {
        return 10000000000000L + new Random().nextLong() % 90000000000000L;
    }

    public static void main(String[] args) {
        Vincebank bank = new Vincebank();
        bank.Bankservices();
    }
}

class User {
    String username;
    String email;
    String password;
    long accountNumber;
    double balance = 0;

    public User(String username, String email, String password, long accountNumber) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.accountNumber = accountNumber;
    }
}
