package homeworks;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array size");
        float arraySize = scanner.nextFloat();

        float array []= new float[(int)arraySize];
        System.out.println("Enter the grades of the array one by one");

        for (int i = 0; i < arraySize; i++) {  //  i<arraySize.length;
            System.out.println("Please enter grade number: " + (i + 1));
            array[i] = scanner.nextInt();
        }
        float sum = 0;
        float average = 0;
            for (float value : array) {
                sum += value;
                average = sum/arraySize;
        }
        System.out.println("Average grade: " + average);
        System.out.println("There ws passed: " + (int) arraySize + " values");
    }
}
    /*Average grade in array:
    Use the same functionality from previous task (change array type to float) and create
    array. Sum all elements in the array and calculate average grade.
             Ask for user to enter a positive number that will be the arrays size
 Create an empty array that will contain Float data type values in size of
    entered value
 Using for loop ask user to enter array elements one by one
 Calculate and print out all value average
 Print out count of grades:*/

