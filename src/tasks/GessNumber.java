package tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GessNumber {
    public static void main(String[] args) {
/*        Guess number:
        Create a JAVA program that allows you to enter a maximum random number for program to generate.
        Generate a random number from 0 to entered max number.
        And then using while loop ask user to guess the number. Allow user to guess as long as they enter the
        same number that was generated.
             Ask for user to enter a positive number
             Generate random number in range 0 – entered number
             Ask user to guess the number, allow to guess as long as they enter they enter generated number
             Congratulate user for guess the number*/

        int rand, guess, max;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter max random range");
        max = scanner.nextInt();

        rand = (int) (Math.random() * (max+1));
       //System.out.println("generated random value = " + rand);

        do {
            System.out.println("Guess the number");
            guess = scanner.nextInt();
            if (guess<rand){
                System.out.println("Try bigger");
            }else if (guess>rand){ //it is nessecery with if,kad nespausdintu visada sios eilutes, kai jau atspejai
                System.out.println("Try smaller");
            }

        } while (guess != rand);
        System.out.println(" Congratulations you won");



    }
}
