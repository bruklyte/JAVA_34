package homeworks;
//Sandra Rimke
import java.util.Random;
import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char again = 'y';
        while (again == 'y'){
            System.out.println("First player - Please enter:   rock / scissors / paper / lizard / spock");
            String player1 = scanner.nextLine().toLowerCase();
       /* System.out.println("Second player - Please enter rock / scissors / paper");
        String player2 = scanner.nextLine().toLowerCase();*/

            String[] computer = new String[]{"scissor", "rock", "paper", "lizard", "spock"};
            String random = (computer[new Random().nextInt(computer.length)]);
            System.out.println("Second player - Computers choice: " + random);
            String player2 = random;

            if(player1.equals("rock")) {
                rockPaperScissors(player1, player2);
            } else if(player1.equals("scissors")){
                rockPaperScissors(player1, player2);
            } else if(player1.equals("paper")) {
                rockPaperScissors(player1, player2);
            } else if(player1.equals("lizard")) {
                rockPaperScissors(player1, player2);
            } else if(player1.equals("spock")){
                rockPaperScissors(player1, player2);
            }else{
                System.out.println("Player 1 did invalid input");
            }

            System.out.println("Do you want to check something again? y (yes)/n (no)");
            again = scanner.next().charAt(0);
            scanner.nextLine();
        }
    }


    public static void rockPaperScissors(String player1, String player2) {
        System.out.println("\t" + "GAME ON: " + player1 + " VS " + player2);
        if(player1.equals(player2)){
            System.out.println("It is a TIE");
        } else if (player1.equals("rock") && player2.equals("scissors")){
            System.out.println("Player 1 wins");
        }else if (player1.equals("scissors") && player2.equals("paper")) {
            System.out.println("Player 1 wins");
        } else if (player1.equals("paper") && player2.equals("rock")) {
            System.out.println("Player 1 wins");
        } else if (player1.equals("rock") && player2.equals("lizard")){
            System.out.println("Player 1 wins");
        }else if (player1.equals("scissors") && player2.equals("lizard")) {
            System.out.println("Player 1 wins");
        } else if (player1.equals("paper") && player2.equals("spock")) {
            System.out.println("Player 1 wins");
        } else if (player1.equals("lizard") && player2.equals("paper")){
            System.out.println("Player 1 wins");
        }else if (player1.equals("lizard") && player2.equals("spock")) {
            System.out.println("Player 1 wins");
        } else if (player1.equals("spock") && player2.equals("rock")) {
            System.out.println("Player 1 wins");
        } else if (player1.equals("spock") && player2.equals("scissors")) {
            System.out.println("Player 1 wins");
        } else {
            System.out.println("Player 2 wins");
        }

    }

}


