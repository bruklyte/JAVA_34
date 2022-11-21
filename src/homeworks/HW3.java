package homeworks;

import java.time.temporal.ValueRange;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

//  somewhere in the range. use one of the metods near 100 , difference between no bigger than 10 - 99 103 - near 100
/*  Write an application, that will read one number from user (of type int) and check, if given number is "near" 100.
    A number is "near" 100 when difference between it and 100 is no bigger than 10.
    Your application should read one number (int) and print false or true on the screen, according to instructions above.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = scanner.nextInt();
//1
        if (num >= 90 && num <= 110) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
//2
        if (ValueRange.of(90, 110).isValidIntValue(num)) {
            System.out.println("true2");
        } else {
            System.out.println("false2");
        }




    }
}
