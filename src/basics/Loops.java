package basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
  //    System.out.println("Hello World!");

        int z=1;
        for (int i = 1; i <= 10; i++){              //i aprašome tik šiame loop'e, už jo ribų jo nėra. kitam loop'e naudojamas naujas i
            System.out.println(i + " Hello World!" + z);
            z++;
        }
        for (int i = 1; i <= 10; i++){             // i += 1
            System.out.print(i);
        }

        int i = 1;
        while (i <= 10){
            System.out.println(i + " This is wile loop");
            i++;
        }

        i=100;  //reseting i to 1

        do{
            System.out.println(i + " This is do wile loop");
            i++;

        } while (i <= 10);


        int input;
        do{
            System.out.println("Please enter number");
            input = scanner.nextInt();
            System.out.println(input * 2);

        } while (input != 0);




    }
}
