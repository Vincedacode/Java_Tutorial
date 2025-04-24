package HouseholdInventory;
        import java.io.IOException;
        import java.util.ArrayList;
        import java.util.InputMismatchException;
        import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        ArrayList<String> namelist = new ArrayList();
        ArrayList<Double> pricelist = new ArrayList();
        ArrayList<Integer> quantitylist = new ArrayList();
        ArrayList<String> categorylist = new ArrayList();
        boolean loop = true;
        while (loop) {
            try {
                System.out.println("Welcome to Household Inventory");
                System.out.println("1. Add Item");
                System.out.println("2. Modify Item");
                System.out.println("3. Delete Item");
                System.out.println("4. View Total Expenses");
                System.out.println("5. Exit");
                int userchoice = myscanner.nextInt();
                myscanner.nextLine();
                if(userchoice == 5){
                    System.out.println("Exiting program..");
                    break;
                }
                if (userchoice < 1 || userchoice > 5){
                    System.out.println("Please pick between 1 and 5!");
                }
                switch (userchoice){
                    case 1:
                        System.out.println("Enter item name");
                        String itemname = myscanner.nextLine();

                        System.out.println("Enter item price");
                        double itemprice = myscanner.nextDouble();
                        if (itemprice < 0){
                            System.out.println("Price cannot be less than 0!");
                            continue;
                        }
                        myscanner.nextLine();

                        System.out.println("Enter item quantity");
                        int itemquantity = myscanner.nextInt();
                        if (itemquantity <= 0){
                            System.out.println("Quantity cannot be 0 or less than 0!");
                            continue;
                        }
                        myscanner.nextLine();

                        System.out.println("Item Categories");
                        System.out.println("1. Food");
                        System.out.println("2. Electronics");
                        System.out.println("3. Clothing");
                        System.out.println("4. Furniture");
                        System.out.println("5. Miscellaneous");
                        System.out.println("Enter Item Category");
                        int itemcategory = myscanner.nextInt();
                        myscanner.nextLine();
                        if (itemcategory < 1 || itemcategory > 5) {
                            System.out.println("Please enter a valid category. Choose between 1-5");
                        }
                        String itemcategories = null;
                        if(itemcategory == 1){
                            itemcategories = "Food";
                        }else if(itemcategory == 2){
                            itemcategories = "Electronics";
                        } else if (itemcategory == 3) {
                            itemcategories = "Clothing";
                        } else if (itemcategory == 4) {
                            itemcategories = "Furniture";
                        } else if (itemcategory == 5) {
                            itemcategories = "Miscellaneous";
                        }
                        namelist.add(itemname);
                        pricelist.add(itemprice);
                        quantitylist.add(itemquantity);
                        categorylist.add(itemcategories);
                        for(int i = 0; i < namelist.size(); i++){
                            System.out.println(namelist.get(i)+ " has a price of " + pricelist.get(i) + " and a quantity of " + quantitylist.get(i) + " and falls under " + categorylist.get(i) + " category");
                        }
                        break;
                    case 2:
                        System.out.println("Enter item name");
                        String modifyitem = myscanner.nextLine();
                        boolean checklist = namelist.contains(modifyitem);
                        if(checklist){
                            int itemindex = namelist.indexOf(modifyitem);


                            System.out.println("Enter new item name");
                            String newitemname = myscanner.nextLine();

                            System.out.println("Enter new item price");
                            double newitemprice = myscanner.nextDouble();
                            if (newitemprice < 0){
                                System.out.println("Price cannot be less than 0!");
                                continue;
                            }
                            myscanner.nextLine();

                            System.out.println("Enter new item quantity");
                            int newitemquantity = myscanner.nextInt();
                            if (newitemquantity <= 0){
                                System.out.println("Quantity cannot be 0 or less than 0!");
                                continue;
                            }
                            myscanner.nextLine();

                            System.out.println("Item Categories");
                            System.out.println("1. Food");
                            System.out.println("2. Electronics");
                            System.out.println("3. Clothing");
                            System.out.println("4. Furniture");
                            System.out.println("5. Miscellaneous");

                            System.out.println("Enter new item category");
                            int newitemcategory = myscanner.nextInt();
                            myscanner.nextLine();

                            String newitemcategories = null;

                            if (newitemcategory < 1 || newitemcategory > 5) {
                                System.out.println("Please enter a valid category. Choose between 1-5");
                            }
                            if(newitemcategory == 1){
                                newitemcategories = "Food";
                            }else if(newitemcategory == 2){
                                newitemcategories = "Electronics";
                            } else if (newitemcategory == 3) {
                                newitemcategories = "Clothing";
                            } else if (newitemcategory == 4) {
                                newitemcategories = "Furniture";
                            } else if (newitemcategory == 5) {
                                newitemcategories = "Miscellaneous";
                            }

                            namelist.set(itemindex, newitemname);
                            pricelist.set(itemindex, newitemprice);
                            quantitylist.set(itemindex, newitemquantity);
                            categorylist.set(itemindex, newitemcategories);

                            System.out.println(namelist.get(itemindex)+ " has been successfully modified it now has a price of " + pricelist.get(itemindex) + " and a quantity of " + quantitylist.get(itemindex) + " and falls under " + categorylist.get(itemindex) + " category");




                        }
                        else{
                            System.out.println("Item not found!");
                        }

                        break;
                    case 3:
                        System.out.println("Enter item name");
                        String deleteitem = myscanner.nextLine();
                        boolean checkdelete = namelist.contains(deleteitem);
                        if(checkdelete){
                            int itemindex = namelist.indexOf(deleteitem);
                            System.out.println(namelist.get(itemindex)+ " has been successfully deleted");
                            namelist.remove(itemindex);
                            pricelist.remove(itemindex);
                            quantitylist.remove(itemindex);
                            categorylist.remove(itemindex);

                        }else{
                            System.out.println("Item not found!");
                        }
                        break;
                    case 4:
                        System.out.println("Enter item name");
                        String expensename = myscanner.nextLine();
                        boolean checkexpense = namelist.contains(expensename);
                        if(checkexpense){
                            int itemindexes = namelist.indexOf(expensename);
                            double expense = (double) pricelist.get(itemindexes) * quantitylist.get(itemindexes);

                            System.out.println("Total Expenses for " + namelist.get(itemindexes) + " is " + expense);
                        }
                        else{
                            System.out.println("Item not found!");
                        }
                        break;

                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid value entered! Please try again.");
                myscanner.nextLine();
                continue;
            } catch (Exception e){
                System.out.println("Error occurred: " + e.getMessage());
               continue;
            }
        }
    }
}
