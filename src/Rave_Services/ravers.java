package Rave_Services;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


class Raver {
    String name;
    long Raveid;
    String password;
    String confirmpassword;
    String raverStatus;
    int raveYears;
    String faveAlbum;
    String faveep;

    public Raver(String ravername, long Raverid, String raverpassword, String confirmraverpassword) {
        this.name = ravername;
        this.Raveid = Raverid;
        this.password = raverpassword;
        this.confirmpassword = confirmraverpassword;
    }
}

public class ravers {
    Scanner myscanner = new Scanner(System.in);
    HashMap<Long, Raver> myravers = new HashMap<>();
    Raver currentraver = null;
    boolean loop = true;

    public void RaverServices() {
        while (loop) {
            System.out.println("Welcome to Rave Cave!🦇");
            System.out.println("Enter 1 to register, 2 to Login, 3 to Display your profile, or 4 to Exit!🦇");

            int input;
            try {
                input = myscanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                myscanner.nextLine(); // Clear buffer
                continue;
            }

            if (input == 4) {
                System.out.println("Exiting program!...");
                break;
            }
            switch (input) {
                case 1:
                    registerRaver();
                    break;
                case 2:
                    loginRaver();
                    break;
                case 3:
                    displayRaverInfo();
                    break;
                default:
                    System.out.println("Please pick a number among the options!");
            }
        }
    }

    public void registerRaver() {
        System.out.println("Enter your name");
        if (myscanner.hasNextLine()) {
            myscanner.nextLine(); // Consume newline
        }
        String name = myscanner.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty!");
            return;
        }

        System.out.println("Enter a password. It must be between 8 - 32 characters!");
        String password = myscanner.nextLine().trim();

        System.out.println("Confirm password");
        String confirmpassword = myscanner.nextLine().trim();

        if (!password.equals(confirmpassword)) {
            System.out.println("Passwords do not match!");
            return;
        }
        if (password.length() < 8 || password.length() > 32) {
            System.out.println("Password must be between 8 and 32 characters!");
            return;
        }

        long Raveid = generateRaveid();
        while (myravers.containsKey(Raveid)) { // Prevent duplicate IDs
            Raveid = generateRaveid();
        }

        Raver newraver = new Raver(name, Raveid, password, confirmpassword);
        myravers.put(Raveid, newraver);
        System.out.println("Registration successful! Your Rave ID is " + Raveid);
        loginRaver();
    }

    private long generateRaveid() {
        return 10000000000000L + Math.abs(new Random().nextLong() % 90000000000000L);
    }

    public void buildProfile() {
        if (currentraver == null) {
            System.out.println("No user logged in!");
            return;
        }

        System.out.println("Welcome to Profile Section");
        System.out.println("Enter the year you fell in love with Rema's music (2018 - 2025): ");

        int userinput;
        try {
            userinput = myscanner.nextInt();
            myscanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid year input! Enter a number between 2018 - 2025.");
            myscanner.nextLine(); // Clear buffer
            return;
        }

        if (userinput < 2018 || userinput > 2025) {
            System.out.println("Year is invalid! Pick between 2018 - 2025");
            return;
        }

        switch (userinput) {
            case 2018 -> currentraver.raverStatus = "OG";
            case 2019 -> currentraver.raverStatus = "Legend";
            case 2020 -> currentraver.raverStatus = "Stan";
            case 2021 -> currentraver.raverStatus = "Ultimate Fan";
            case 2022 -> currentraver.raverStatus = "Super Fan";
            case 2023 -> currentraver.raverStatus = "Fan";
            case 2024, 2025 -> currentraver.raverStatus = "Newbie";
        }

        currentraver.raveYears = 2025 - userinput;
        System.out.println("Your profile has been updated! Your rave status: " + currentraver.raverStatus + ", You've been a fan for: " + currentraver.raveYears + " years.");

        while (true) {
            System.out.println("Enter your favorite Rema Album (e.g., 'raveandroses'):");
            String albuminput = myscanner.nextLine().toUpperCase().trim();

            if (albuminput.equals("RAVEANDROSES") || albuminput.equals("HEIS")) {
                currentraver.faveAlbum = albuminput.equals("RAVEANDROSES") ? "Rave & Roses" : "HEIS";
                System.out.println("Your profile has been updated, your favorite Album is: " + currentraver.faveAlbum);
                break;
            } else {
                System.out.println("Album not found! Try again.");
            }
        }

        while (true) {
            System.out.println("Enter your favorite Rema EP (e.g., 'Ravage'):");
            String epinput = myscanner.nextLine().toUpperCase().trim();

            switch (epinput) {
                case "REMA" -> currentraver.faveep = "Rema E.P";
                case "BADCOMMANDO" -> currentraver.faveep = "Bad Commando E.P";
                case "FREESTYLE" -> currentraver.faveep = "Freestyle E.P";
                case "RAVAGE" -> currentraver.faveep = "Ravage E.P";
                default -> {
                    System.out.println("EP not found! Try again.");
                    continue;
                }
            }
            System.out.println("Your profile has been updated, your favorite EP is: " + currentraver.faveep);
            break;
        }
    }

    public void displayRaverInfo() {

        System.out.println("Enter your Rave ID to view profile:");
        long userraveid;
        try {
            userraveid = myscanner.nextLong();
            myscanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid ID! Please enter a valid ID.");
            myscanner.nextLine(); // Clear buffer
            return;
        }

        if (!myravers.containsKey(userraveid)) {
            System.out.println("Account not found, please try again!");
            return;
        }

        currentraver = myravers.get(userraveid);
        System.out.println("Rave Name: " + currentraver.name);
        System.out.println("Rave ID: " + currentraver.Raveid);
        System.out.println("Raver Status: " + currentraver.raverStatus);
        System.out.println("Favorite Rema Album: " + currentraver.faveAlbum);
        System.out.println("Favorite Rema EP: " + currentraver.faveep);
        System.out.println("You've been a fan of Rema for: " + currentraver.raveYears + " years");
    }

    public void loginRaver() {
        System.out.println("Login with your RAVE ID");
        System.out.println("Enter your Rave ID:");
        long userraveid;
        try {
            userraveid = myscanner.nextLong();
            myscanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid ID! Please enter a valid number.");
            myscanner.nextLine();
            return;
        }

        if (!myravers.containsKey(userraveid)) {
            System.out.println("Account not found! Please sign up.");
            registerRaver();
            return;
        }

        currentraver = myravers.get(userraveid);
        System.out.println("Logged in successfully as " + currentraver.name);
        if(currentraver.faveep == null && currentraver.faveAlbum == null && currentraver.raverStatus == null){
            buildProfile();
        }else{
            displayRaverInfo();
        }

    }

    public static void main(String[] args) {
        ravers addraver = new ravers();
        addraver.RaverServices();
    }
}
