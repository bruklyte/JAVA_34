package homeworks;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        //Using scanner read speed in miles per hour mp/h
        // Calculate and output speed in km/h
        // e.g. input 122.7mp/h -> output 122.7 mp/h in kmm/h would be equal to 197.46651

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter speed in miles per hour (mp/h)");
        double milesPerHour = scanner.nextDouble();

        double i = 1.60934401d;
        double kmPerHour = milesPerHour * i;
        System.out.println( + milesPerHour + " in kmm/h would be equal to " + kmPerHour);
    }
}
