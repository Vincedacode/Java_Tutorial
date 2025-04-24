package Inventory;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Map;

public class Inventory {
    static HashMap<String, Integer> userinventory = new HashMap<>();
    static HashMap<String, Integer> storeinventory = new HashMap<>();

    static Scanner myscanner = new Scanner(System.in);
    static int userbalance = 200;
    static int storebalance = 350;

    // Display Store Inventory
    static void displayStoreInventory() {
        System.out.println("\n🛒 Store Inventory:");
        System.out.printf("%-20s %s%n", "Item Name", "Price (Gold)");
        System.out.println("--------------------------------");

        System.out.println("--------------------------------");
    }

    // Display User Inventory
    static void displayUserInventory() {
        System.out.println("\n🎒 Your Inventory:");
        if (userinventory.isEmpty()) {
            System.out.println("You have no items.");
        } else {
            System.out.printf("%-20s %s%n", "Item Name", "Price (Gold)");
            System.out.println("--------------------------------");
            for (Map.Entry<String, Integer> entry : userinventory.entrySet()) {
                System.out.printf("%-20s %d%n", entry.getKey(), entry.getValue());
            }
        }
        System.out.println("--------------------------------");
    }

    static void buyService() {
        displayStoreInventory();
        System.out.println("\nWhat would you like to buy? (Item name only)");
        String item = myscanner.nextLine();

        if (storeinventory.containsKey(item)) {
            int price = storeinventory.get(item);

            if (userbalance >= price) {
                userbalance -= price; // Deduct from user balance
                storebalance += price; // Store earns money

                // Remove from store inventory
                storeinventory.remove(item);

                // Add to user inventory
                userinventory.put(item, price);

                System.out.println("✅ You bought " + item + " for " + price + " gold.");
            } else {
                System.out.println("❌ Not enough gold!");
            }
        } else {
            System.out.println("❌ Item not available.");
        }
    }

    static void sellService() {
        displayUserInventory();
        System.out.println("\nWhat would you like to sell? (Item name only)");
        String item = myscanner.nextLine();

        if (userinventory.containsKey(item)) {
            int price = userinventory.get(item) / 2; // Selling at half price

            userbalance += price; // Add money to user balance
            storebalance -= price; // Store loses money

            // Remove from user inventory
            userinventory.remove(item);

            // Add to store inventory
            storeinventory.put(item, price * 2); // Store sells at full price

            System.out.println("✅ You sold " + item + " for " + price + " gold.");
        } else {
            System.out.println("❌ You don't own this item.");
        }
    }

    public static void main(String[] args) {
        System.out.println("What's your name?");
        String name = myscanner.nextLine();

        // Initializing inventories
        userinventory.put("Health Potion", 10);
        userinventory.put("Magic Potion", 15);
        userinventory.put("Heal Potion", 10);
        userinventory.put("Wooden Club", 20);

        storeinventory.put("Health Potion", 10);
        storeinventory.put("Magic Potion", 15);
        storeinventory.put("Heal Potion", 10);
        storeinventory.put("Iron Dagger", 30);
        storeinventory.put("Daedric Helm", 120);
        storeinventory.put("Mage Robe", 50);
        storeinventory.put("Akaviri Katana", 200);
        storeinventory.put("Wabbajack", 500);

        boolean loop = true;
        while (loop) {
            // Display updated balances
            System.out.println("\n==============================");
            System.out.println("💰 Your balance: " + userbalance + " gold");
            System.out.println("🏪 Store balance: " + storebalance + " gold");
            System.out.println("==============================");

            // User options
            System.out.println("\nWhat would you like to do?");
            System.out.println("1) Buy an item");
            System.out.println("2) Sell an item");
            System.out.println("3) Leave");

            try {
                int userinput = myscanner.nextInt();
                myscanner.nextLine(); // Consume newline

                switch (userinput) {
                    case 1:
                        buyService();
                        break;
                    case 2:
                        sellService();
                        break;
                    case 3:
                        System.out.println("👋 Goodbye!");
                        loop = false; // Exit loop
                        break;
                    default:
                        System.out.println("❌ Invalid choice, try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input! Please enter a number.");
                myscanner.nextLine(); // Clear invalid input
            }
        }
    }
}
