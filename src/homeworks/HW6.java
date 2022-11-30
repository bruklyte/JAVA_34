package homeworks;

public class HW6 {
    public static void main(String[] args) {
        /* Write an application, that will print the full latin alphabet (upper case letters) in alphabetical order.
        Each letter should be printed in new/same line.*/
//

         for (int i = 65; i != 91; i++){
            System.out.print((char) i + " ");
                  }
        System.out.println();

         for (char i = 'A'; i<='Z'; i++){
             System.out.print(i + " ");
         }

    }
}
