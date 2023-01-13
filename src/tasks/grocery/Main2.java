package tasks.grocery;

public class Main2 {
    public static void main(String[] args) {

        GroceryList groceryList = new GroceryList();   // object
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
        groceryList.printGroceryList();



    }
}
