package basics;

public class BranchingStatements {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
            if (i == 1) {
                break;
            }
        }


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 8) {
                continue;  //skips - viska kas yra po juo,ir eina vel is naujo - siuo atveju jei 8 praleidzia spausdinima
            }
            //  System.out.println(i);
        }
        //atspausdinti lyginius skaicius
 //1
        for (int i = 0; i <= 100; i++) {
            if (i % 2 > 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
//2 nelyginius
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " *");
        }
        System.out.println();
//2 lyginius
            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " +");
                }
            }

//3
        System.out.println();
        for (int i = 0; i <= 100; i+=2) {
            System.out.print(i + " ");
        }
    }
}
