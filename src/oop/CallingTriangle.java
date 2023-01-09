package oop;

import java.util.Scanner;

public class CallingTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter side1");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side2");
        double side2 = scanner.nextDouble();
        System.out.println("Enter side3");
        double side3 = scanner.nextDouble();

        Triangle triangle1 = new Triangle();
        triangle1.getSide1();
        triangle1.getSide2();
        triangle1.getSide3();

        triangle1.areaTriangle(side1,side2,side3);

        //pagal destytoja
        triangle1.setSide1(side1);
        triangle1.setSide2(side2);
        triangle1.setSide3(side3);

        double result = triangle1.areaTriangle();
        System.out.println("result (pagal destytoja): "+ result);




    }
}
