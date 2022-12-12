package oop;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        System.out.println("Hello world");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        //let's cool our method
        printName(name);
        printName("Bob");

        //Method with return type
        greetings("Bob");

        String text = greetings("Bob");  // gives a response, that we can use
        System.out.println(text);

        //PersonInfo
        personInfo("Jonh", 45);
        personInfo("Jonh II", 67);

        //SUM
        System.out.println(sum(1,2,3));
    }

    public static void printName(String name){               //creating local variable
        //this method will have input argument
        System.out.println("Hello your name is " + name);
    }

    public static String greetings (String name){
        String result = "Hi " + name;
        return result;
    }

    public static void personInfo (String name, int age) {
        System.out.printf("Your name is %s and you are %d years old\n",name,age);
    }

    public static int sum (int num1, int num2, int num3){
        return num1+num2+num3;
    }


}
