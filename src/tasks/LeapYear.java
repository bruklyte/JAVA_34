package tasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = scanner.nextInt();

/*        if (input > 0) {
            if (input <= 2100) {
                if (input % 4 == 0 && input % 100 != 0 || 400 == 0) {
                    System.out.println("It is a leap year");
                }
            } else {
                System.out.println("it is not a leap year");
            }
        } else {
            System.out.println("too far ");
        }
    } else {
        System.out.println( "invalid");
          }
}*/


        if ( ((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0) ) {
            System.out.println("Leap year");

        } else {
            System.out.println("Not leap year");


        }




    }
}
