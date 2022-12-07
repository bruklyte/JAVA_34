package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW7 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array size");
        int arraySize = scanner.nextInt();
        int sum2=0;

        int [] array = new int[arraySize];
        System.out.println("Enter one by one");

        for(int i=0; i<arraySize; i++){  //  i<arraySize.length;
            System.out.println("Enter number: " + (i+1));
            array[i]=scanner.nextInt();
            sum2+=arraySize;

        }
        System.out.println(Arrays.toString(array));
        System.out.println("sum2 " + sum2);
        int sum = 0;
        for (int value:array) {
            sum+=value;
        }
        System.out.println("sum of the array: " + sum);
//
        }

    }

