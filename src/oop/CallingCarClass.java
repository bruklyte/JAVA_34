package oop;

import java.util.Scanner;

public class CallingCarClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter cars brand");
        String brand = scanner.nextLine();
        System.out.println("Please enter cars color");
        String color = scanner.nextLine();
        System.out.println("Please enter cars max speed");
        int maxSpeed = scanner.nextInt();

        //Create a new car class object
        //Set field values we got from the user
        //Call printCarInfo method to get the information about the car

      /*  Car car0 = new Car();   //new Car class object - empty
        car0.brand = brand;     // not empty :) - raudoni nepasiekiami nes padaryti privat kitoj klasej.
        car0.color = color;
        car0.maxSpeed = maxSpeed;
        car0.printCarInfo();*/

/*        Car car2 = new Car();   //second object
        car2.brand = "AUdi";*/

        Car car1 = new Car();
        car1.setBrand(brand);
        car1.setColor( color);
        car1.setMaxSpeed(maxSpeed);
        car1.printCarInfo();

        //Get max speed - get one value
        System.out.println("max speed (getMaxSpeed method) "+ car1.getMaxSpeed());

        if (car1.getMaxSpeed() >= 300){
            System.out.println("Sports car");

        }else {
            System.out.println("Regular car");

        }


    }
}
