package tasks.grocery;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){      // "!" perjungia i oposite value
            System.out.println("Enter your choise");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice){
                    case 0:
                        //print all options
                        printInstructions();
                        break;
                    case 1:
                        //print grocery list;
                        groceryList.printGroceryList();
                        break;
                    case 2:
                        //add item
                        addItem();
                        break;
                    case 3:
                        //modify item
                        modifyItem();
                        break;
                    case 4:
                        //remote item
                        removeItem();                   //   sukurti metodą reikia ta padarom zemiau
                        break;
                    case 5:
                        //searchItem
                        searchItem();
                    case 6:
                        //delete all the item
                        groceryList.deleteAllItems();
                        break;
                    case 7:
                        quit = true;
                        break;
                    default:
                        System.out.println("Input not valid (0-7)");
                        break;

                }




        }catch (InputMismatchException e){
                System.err.println("Wrong input! Integers only");
                scanner.nextLine();

            }
        }









        /*GroceryList groceryList = new GroceryList();   // object
        groceryList.printGroceryList();
        groceryList.addGroceryItem("Bread");
        groceryList.addGroceryItem("Water");
        groceryList.addGroceryItem("Sweets");
        groceryList.addGroceryItem("Bred");
        groceryList.printGroceryList();

        groceryList.removeGroceryItem("Bread");
        groceryList.printGroceryList();


        groceryList.modifyGroceryItem(1, "Oranges");
        groceryList.printGroceryList();

        System.out.println(groceryList.searchItem("Oranges"));
        System.out.println(groceryList.searchItem("Bear"));

        groceryList.deleteAllItems();
        groceryList.printGroceryList();*/

    }

    private static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To delete all item in the list");
        System.out.println("\t 7 - To quit the application");
    }

    private static void addItem(){
        System.out.println("Please enter the grocery item");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void modifyItem () {
        System.out.println("Enter item number");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo - 1, newItem);  // vartotojas mano numeris, o programa index vieta, kuri prasideda nuo 0}
    }

    private static void removeItem(){
        System.out.println("Enter item name");
        groceryList.removeGroceryItem(scanner.nextLine());
    }

    public static void searchItem (){
        System.out.println("Enter item to search for");
        String searchItem = scanner.nextLine();
        if(groceryList.searchItem(searchItem)){
            System.out.println("Found " + searchItem + " in your grocery lsit");
        }else {
            System.out.println(searchItem + " is not in the chopping list");
        }


    }
}
