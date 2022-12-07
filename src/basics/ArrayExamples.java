package basics;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        //Declare array that will store 3 elements of type String
        String[] names = new String[3];

        //Setting element values using each element's index
        names[0] = "Ben";
        names[1] = "Tom";
        names[2] = "Bob";

        //Getting value from array
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        //Length method
        System.out.println(names.length);

        //Second way - declare and initialize array at the same time
        String[] dreamCars = new String[]{"BMW", "Tesla", "Ferrari", "Opel", "Ford"};

        //Iterate throuth all elements in array with for loop

        for (int i=0; i < dreamCars.length; i++){
           // System.out.println(dreamCars[i]);
            System.out.println(i+1 + ". " + dreamCars[i]);
        }

        //Same thing but using for-each loop

        for (String car: dreamCars){
            System.out.println("hello car " + car);
        }

        //very fast print of the all values
        System.out.println(Arrays.toString(dreamCars));


        //Example for every element print it is even or odd number in the array

        int table[] = {321,44,52,32,52,11};
        for (int value: table) {
            if(value % 2 ==0){
                System.out.println(value + " - Value even number");
            }else{
                System.out.println(value + " - Value odd number");
            }

        }





    }
}
