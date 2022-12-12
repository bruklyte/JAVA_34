package basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpresion {
    public static void main(String[] args) {
        // 1 Example
        Pattern pattern = Pattern.compile("a+b");
        Matcher matcher = pattern.matcher("aab");

        System.out.println(matcher.matches());
        System.out.println(matcher.find());

        //2 Example
        //Any 3 lower case letters or any number 5-9

        System.out.println(Pattern.matches("[a-z5-9]{3}","Ax8")); //[a-z5-9] atom range, {3} quantifare

        //2upper case letters, 2 lower case letter, 3 numbers
        System.out.println(Pattern.matches("[A-Z]{2}[a-z]{2}[0-9]{3}","GFjh255"));

        //2upper case letters, 2 lower case letter, 3 numbers  = 7 any  letter or any numbers
        System.out.println(Pattern.matches("[a-zA-Z0-9]{7}","GFjh255"));

        // Examples NF-2356 - latviski masinos numeriai - arba GF-234 arba GW-01
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your car's plate: ");
        String plateNumber = scanner.nextLine();

        Pattern pattern1 = Pattern.compile("[A-Z]{2}-[0-9]{2,4}");  // 0-9 can be simplified \d , from lower a-upper Z just "."
        Matcher matcher1 = pattern1.matcher(plateNumber);
        boolean validPlateNumber = matcher1.matches();  // gave uz true or false

        if (validPlateNumber){     //galima rasyti taip: validPlateNumber == true - kintamasis yra boolean if ciklas supranta ir trumpai parasyta
            System.out.println("Your plate number is valid");
        }else{
            System.out.println("Your plate number is not valid");
        }


    }
}
