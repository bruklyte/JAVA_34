package homeworks;

import java.util.Arrays;
import java.util.Collections;

public class HW10 {
    public static void main(String[] args) {
        // Integer [] numbersArray = new int[]{11, 12, 13, 14, 15};
        Integer numbersArray[] = {1, 6, 3, 9, 5, 4};
        System.out.println(Arrays.toString(numbersArray));
        int n = numbersArray.length;
       // System.out.println(numbersArray.length);

        for (int i = 0; i < n / 2; i++) {
            int temporary = numbersArray[i];
            numbersArray[i] = numbersArray[n - i - 1];
            numbersArray[n - i - 1] = temporary;
        }
        System.out.println(Arrays.toString(numbersArray));

        // destytojo
        int[] myArray = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println("Original array: " + Arrays.toString(myArray));
        for(int i=0; i<myArray.length/2; i++){
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length-1-i];
            myArray[myArray.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(myArray));

       // maiking new array to solve the task

        int [] reverseArray = new int [myArray.length];
        for (int i = 0; i< myArray.length; i++){
            reverseArray[i]=myArray[myArray.length-1-i];
        }
        System.out.println(Arrays.toString(reverseArray));
    }
}




