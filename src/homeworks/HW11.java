package homeworks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW11 {
    public static void main(String[] args) {

        // Personal LV number as a String 112233-12345
        Scanner scanner = new Scanner(System.in);

        String i = "y";
        while (i.equals("y")) {
            System.out.println("Please enter your personal number: ");
            String personalNumber = scanner.nextLine();

            Pattern pattern1 = Pattern.compile("[0-9]{6}-[0-5]{5}");
            Matcher matcher1 = pattern1.matcher(personalNumber);
            boolean validNumber = matcher1.matches();  // gave us true or false
            if (validNumber) {
                System.out.println("Your inputted personal number is valid");
            }else {
                System.out.println("Your inputted personal number is not valid");
            }
            System.out.println(i + " Do you want to check your personal number again? y/n");
            String response = scanner.nextLine();
            // to upper case convert
            i=response;
        }
    }
}
