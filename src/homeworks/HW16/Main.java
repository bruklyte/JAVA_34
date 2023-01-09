package homeworks.HW16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fuel");
        float fuel = scanner.nextFloat();

        System.out.println("Enter fuel usage");
        float fuelUsage = scanner.nextFloat();

        System.out.println("Enter passengers");
        int passengers = scanner.nextInt();

        //Create Vehicle object
        Vehicle vehicle = new Vehicle(fuel, fuelUsage, passengers);
        System.out.println("fuel * 100) / fuelUsage - maxDistance: " + vehicle.maxDistance());

    }

}
