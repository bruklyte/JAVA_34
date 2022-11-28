package homeworks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
 /*Alex is an owner of grocery store. Among many products he sells,
he's mostly famous for his hand-made jam, that is being
sold in jars of 1kg or 7kg. Alex sells only full jars
(i.e. it's only possible to buy the whole jar of 1kg, or 7kg).

Will is asked by his wife Jane to buy some amount of Alex's jam.
Will forgot to take his bag, thus he can take home no more than six jars of jam
(three jars in each of his two hands). Jane is very serious about the
shopping list - if she asked for specific amount of jam, she expects exactly this
amount, no more, no less.

Write an application that will check if Will is able to take home the
amount of jam specified by Jane. Amount of jam should be read from user
(positive int value). You can assume that there's always enough jam in Alex's shop.
Your application should print true or false.*/

// 6 six jars per 1 time
//       15 kg 2*7 and 1 * 1
// 27 kg 7*3 and 1*6 = FALSE - he cannot buy this amount
//can he bring this specified amount TRUE or FALSE he cannot
// hint - use operators

/*        System.out.println(10/3);  // hint
        System.out.println(10.0f/3.0f);*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of kilos to buy");
        int num = scanner.nextInt();
//1
        int jar1 = 1;
        int jar7 = 7;
        int vnt = 6;
        int i = num/jar7;
        int j = num - (i*7);

        System.out.println(i);
        System.out.println(j);

        if (i+j<=vnt){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
//3
        System.out.println((i + j) <=vnt);

//4
        System.out.println("Please enter number of amountOfJam");
        int amountOfJam = scanner.nextInt();
        //Let's calculate how many big jars we need
        //division / of integer values in Java "cuts" non integer part of the result

        int amountOf7KgJars = amountOfJam / 7;
        int amountOf1KgJars = amountOfJam % 7;
        System.out.println(amountOf7KgJars + amountOf1KgJars <=6);


    }
}
