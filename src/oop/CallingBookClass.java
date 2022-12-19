package oop;

public class CallingBookClass {
    public static void main(String[] args) {
        //creating new book class object
        Book book1 = new Book();

        //Set public field values

        book1.title = " Test title";
        book1.author = "Test author";

        //Set private field using setter method
        book1.setNumberOfPages(100);

        book1.printBookInfo();


        Book book2 = new Book();
        book2.title = "This is secondbook";
        book2.author = "This is Second Aurthor";
        book2.setNumberOfPages(-50);
        book2.printBookInfo();


    }
}
