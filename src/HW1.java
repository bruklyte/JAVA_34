import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        // Using scanner ask user to Enter name and year of birth
        // Print out:
        // input e.g.  John, 2000
        // "Your name is John and you are 22 years old"

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();

        int i = 2022;
        int age = 2022 - yearOfBirth;

        System.out.println("Your name is " + name + " and you are " + age + " years old.");
    }
}
