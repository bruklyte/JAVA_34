package homeworks;

import java.util.Scanner;

public class HW13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = scanner.nextInt();

        determinLeapYear(year);

    }


    public static void determinLeapYear(int year){
        if ( ((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0) ) {
            System.out.println("Leap year");

        } else {
            System.out.println("Not leap year");
        }
    }

    //papildoma uzduotis, skirtumas kuris grazina, ir kuris negrazina.
}
