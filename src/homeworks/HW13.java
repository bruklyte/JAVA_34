package homeworks;

import java.util.Scanner;

public class HW13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = scanner.nextInt();

      determinLeapYear(year);
      String methodWithReturnType = determinLeapYearReturn(year);
      System.out.println(methodWithReturnType);
      //2
      String methodWithReturnType2 = determinLeapYearReturn2(year);
        System.out.println(methodWithReturnType2);


    }
    public static void determinLeapYear(int year){
        if ( ((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0) ) {
            System.out.println(year + " - is a leap year");
        } else {
            System.out.println(year + " - is not a leap year");
        }
    }

    public static String determinLeapYearReturn(int year){
        if ( ((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0) ) {
            String result = year + " this is leep year (return type method)";
            return result;

        } else {
            String result = year + " this is not leep year (return type method)";
            return result;
        }

    }

    public static String determinLeapYearReturn2(int year){
        String answer;
        if ( ((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0) ) {
            answer = year + " this is leep year (return type method2)";
        } else {
            answer = year + " this is not leep year (return type method2)";
        }
        return answer;
    }

}
//papildoma uzduotis, skirtumas kuris grazina, ir kuris negrazina.

