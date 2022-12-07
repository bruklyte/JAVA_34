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
    }
}




