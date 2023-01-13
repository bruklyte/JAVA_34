package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetInterfaceExample {                      //SET  - only hold unique elements
    public static void main(String[] args) {
        //HashSet

        HashSet<String> names = new HashSet<>();
        //Add elements
        names.add("Bob");
        names.add("Anna");
        names.add("Liam");
        names.add("Anna");

        //Print out all elements
        System.out.println(names);

        //Remove element

        names.remove("Bob");    // exact value must be written
        System.out.println(names);

        //Size
        System.out.println(names.size());

        //Contains
        System.out.println(names.contains("Liam")); //ar tas setas turi specifine reiksme su listu taip negalima
        System.out.println(names.contains("Bob"));

        //Iterate
        for(String str: names){
            System.out.println(str);
        }

        Iterator<String> i = names.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        //Example 2

        HashSet<Integer> intSet1 = new HashSet<>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);

        System.out.println("intSet1 : " + intSet1);

        HashSet<Integer> intSet2 = new HashSet<>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);

        System.out.println("intSet2 : " + intSet2);

        //Fined union
        HashSet<Integer> union = new HashSet<>(intSet1);   // construktorius kuriuo galima perduoti reiksme
        System.out.println("union before : " + union);

        union.addAll(intSet2);
        System.out.println("union after : " + union);

        //Find Intersection - kas yra bendro tarp ju dvieju
        HashSet<Integer> intersection = new HashSet<>(intSet1);
        intersection.retainAll(intSet2);
        System.out.println("Intersection: " + intersection);

        //Find difference for intSet1
        HashSet<Integer> difference1 = new HashSet<>(intSet1);
        difference1.removeAll(intSet2);
        System.out.println("Difference intSet1: "+ difference1);

        //Find difference for intSet2
        HashSet<Integer> difference2 = new HashSet<>(intSet2);
        difference2.removeAll(intSet1);
        System.out.println("Difference intSet1: "+ difference2);

        //Find all differences
        HashSet<Integer> diffAll = new HashSet<>(difference1);
        diffAll.addAll(difference2);
        System.out.println("All differences: " + diffAll);

        //linkedHashSet

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add ("Estonia");
        linkedHashSet.add ("Lithuania");
        linkedHashSet.add ("Latvia");
        linkedHashSet.add ("Italy");
        System.out.println(linkedHashSet);
        linkedHashSet.remove("Latvia");
        System.out.println(linkedHashSet);

    }
}
