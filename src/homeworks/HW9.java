package homeworks;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input tree size");
        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++){
            for (int tarpas=1; tarpas<=num-i; tarpas++) {
                System.out.print(" ");
            }
            for (int star=1; star<i*2; star++){
               System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 1; i++){
            for (int tarpas=1; tarpas<=num-i; tarpas++) {
                System.out.print(" ");
            }
            for (int star=1; star<i*2; star++){
                System.out.print("#");
            }
            System.out.println();
        }
// destytojo eglute

        //levels
        for (int i = 0; i < num; i++) {

            //spaces
            for (int j = 0; j < num-1-i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 0; j<i*2+1; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i= 0; i< num-1; i++){
            System.out.print(" ");
        }
        System.out.println("#");

    }

}


