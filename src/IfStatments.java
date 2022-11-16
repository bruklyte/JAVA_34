import java.util.Scanner;

public class IfStatments {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // IF
        System.out.println("Enter a grade: ");
        int grade = scanner.nextInt();


        // Print out "good job" if grade is over 6
        if(grade > 6){
            System.out.println("good job");
        }
        // else dalis nebutina,uzkomentuota nes rasom kita bloka.
        //System.out.println("good luck next time");


        //Print out "You can do better" if grade is less or equal to 4

        if(grade <= 4){
            System.out.println("You can do better");
        }

        // IF ELSE
        // Print "You have passed the test" if grade is equal or greater than 4,
        // if it is not then print "You have failed the test"

        if(grade >= 4){
            System.out.println("You have passed the test" );
        } else {
            System.out.println("You have failed the test" );
        }
                 //Same question different logic
        if (grade <4){
            System.out.println("You have failed the test2" );
        }else {
            System.out.println("You have passed the test2" );
        }


        // Print out "You have a fever" if temp is over 36.8, if not then print "You are healthy"
      float temp=36.6f;
        if (temp >36.8f){
            System.out.println("You have a fever");

        } else {
            System.out.println("You are healthy");
        }

        // IF - ELSE IF
        // Print comments about grades:
        // 1-3 "Very bad"
        // 4-5 "Okey"
        // 6 "Nice"
        // 7-10 "Very good"
        if (grade < 4 && grade >=1 ){
            System.out.println("Very bad");
        } else if ( grade >=4 && grade <=5){
            System.out.println("Okey");
        } else if (grade == 6){
            System.out.println("Nice");
        } else if (grade > 6 && grade <= 10){
            System.out.println("Very good");

        }

    }
}
