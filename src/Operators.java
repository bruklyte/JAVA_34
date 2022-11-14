import java.sql.SQLOutput;

public class Operators {
    public static void main(String[] args) {

        // Assigment operators =, +=, -=, *=, /=
        int a = 100;
        System.out.println("a = " + a);
        a *= 10;
        System.out.println("a = " + a);

        // Basic arithmetic operators -, +, *, /, %
        int x = 100;
        x = 45 + 10;
        x = 15 * 3;
        System.out.println("x = " + x);

        System.out.println(x + 15);

        //Incrementation operators and decrementation operators
        //post-incrementation
        int num1 = 10;
        num1++;
        System.out.println("num1 = " + num1);
        System.out.println("num1++ = " + num1++);
        System.out.println("num1 = " + num1);

        //pre-incrementation
        System.out.println("num1 = " + --num1);

        // 4 ways to increase or decrease variable by one
        num1 += 1;
        num1 = num1 + 1;
        num1++;
        ++num1;
        System.out.println(num1);

        //Relation operators ==, !=, >, <, >=, <=
        // Equality ==
        int i = 10;
        int b = 10;
        System.out.println("Equality: " + (i==b));

        // Inequality !=
        System.out.println("Equality: " + (i!=b));

        //Greater than > and greater than or equal to >=
        System.out.println("Greater than: " + (i > b));
        System.out.println("Greater than or equal to: " + (i >= b));

        //Greater than > and greater than or equal to <=
        System.out.println("Greater than: " + (i < b));
        System.out.println("Greater than or equal to: " + (i <= b));

        //Logical operators and, or (only boolean values)
        //Logical AND - &&

        boolean sun = true;
        boolean dry = false;
        System.out.println("I will go outside: " + (sun&&dry));




    }
}
