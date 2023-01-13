package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterfaceExample2 {
    public static void main(String[] args) {
        //Example1
        ArrayList<Integer> list = new ArrayList<>();   //truputi kitoks budas pasakyti, kad kintamieji bus interger  - Integer is didziosios nebeprimityvus, kaip objektas data type
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("List 1 : " + list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        System.out.println("List 2: " + list2);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Test 1");
        arrayList.add("Test 2");
        arrayList.add("Test 3");


        //For loop
        for(int i=0;i<arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        //For-each
        for(String str:arrayList){
            System.out.print(str + " ");
        }
        System.out.println();

        //LinkedList
        LinkedList<String> car = new LinkedList<>();
        car.add("Audi");
        car.add("Opel");
        car.add("Toyota");
        System.out.println(car);

        //Last element
        System.out.println(car.get(car.size()-1));
        System.out.println(car.getLast());

        //Fist element
        System.out.println(car.get(0));
        System.out.println(car.getFirst());

        //Create new LinkedList object int
        //Populate the list with values from 1 to 100
        //print all elements in the console

        LinkedList<Integer> number = new LinkedList<>();
        for (int i=1; i<=100; i++){
            number.add(i);
        }
        System.out.print(number);
    }
}
