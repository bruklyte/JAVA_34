package basics;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class MathClassSandros {
    public static void main(String[] args) {

        float num = - 5.6f;
        System.out.println(num);

        //Rounding down
        System.out.println("Floor " + Math.floor(num));

        System.out.println(num);

        //Rounding up
        System.out.println("Ceil " + Math.ceil(num));

        //According to math rules
        System.out.println("Round " + Math.round(num)); // always returns an integer, not float, even num was float

        //ABS absolute value - visas teigiamas -2 tai abs 2 ir pan.
        System.out.println("ABS " + Math.abs(num));

        //Power - pakelta laipsniu
        System.out.println("Pow " + (int) Math.pow(2, 2));

        //Max
        System.out.println("Max " + Math.max(150, 100));

        //Min
        System.out.println("Min " + Math.min(100,150));

        //Max out of three numbers
        System.out.println("Max out of 3: " + Math.max(Math.max(2,3),1));

        //SQRT - kvadratinė šaknis
        System.out.println("SQRT: " + Math.sqrt(64));

        //Random - Generate random values
        System.out.println("Random " + Math.random());
        System.out.println("Random (0-9) " + (int) (Math.random() * 10)); //max will be 9
        System.out.println("Random (0-10) " + (int) (Math.random() * 11)); //max will be 10
        System.out.println("Random (0-99) " + (int) (Math.random() * 100)); //max will be 99)
        System.out.println("Random (1-10)" + ((int) (Math.random() * 10)+1)); //min 1 , max will be 10));


    }
}
