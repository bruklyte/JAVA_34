package homeworks;

import java.util.Arrays;

public class HW14 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,9,0,100};
        System.out.println(Arrays.toString(array) + " - original array");

        int max = max(array);
        System.out.println("Maximum value for the above array = " + max);

        int min =  min(array);
        System.out.println("Minimum value for the above array = " + min);
    }

    public static int max(int [] array) {
        int max = array[0];
        for (int i=0; i<array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        //System.out.println(max + " max");
       return max;
    }

    public static int min(int [] array) {
        int min = array[0];
        for (int i=0; i<array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        //System.out.println(min + " min");
        return min;
    }

}
// sukurti du metodus, kad surasatu min ir max reiksme. gauti integer is metodu min ir max