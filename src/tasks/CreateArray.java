package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array size");
        int arraySize = scanner.nextInt();

        int [] array = new int[arraySize];
        System.out.println("Enter one by one");

        for(int i=0; i<arraySize; i++){  //  i<arraySize.length;
            System.out.println("Enter number: " + (i+1));
            array[i]=scanner.nextInt();
        }
      System.out.println("Source array : ");
        System.out.println(Arrays.toString(array));

    }
}
