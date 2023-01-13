package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> salaryMap = new HashMap<>();
        //Add values to Map
        salaryMap.put("Bob the Great", 900);   // it is not possible tu have them separated
        salaryMap.put("John", 920);
        //salaryMap.put("John", 1000);   //over writes existing value
        System.out.println(salaryMap);

        //get value from key
        System.out.println("John's salary: " + salaryMap.get("John"));   // search by key

        // Get all key values
        System.out.println(salaryMap.keySet());

        //Size
        System.out.println("quantity: " + salaryMap.size());

        //Check if map contains key
        System.out.println(salaryMap.containsKey("Bob"));
        System.out.println(salaryMap.containsKey("Tonny"));

        //Check if map contains value
        System.out.println(salaryMap.containsValue(920));

        //Remove key/value pair
        salaryMap.remove("John");  // key is unique element
        System.out.println(salaryMap);

        //Example
        Map<String, String> capitalCity = new HashMap<>();
        capitalCity.put("Estonia", "Tallinn");
        capitalCity.put("Latvia", "Riga");
        capitalCity.put("Finland", "Helsinki");

        System.out.println(capitalCity.get("Finland"));

        for (Map.Entry<String, String> entry : capitalCity.entrySet()) {
            System.out.println(entry.getKey());  //will get key - salys
            System.out.println(entry.getValue()); // will get values - sostines
            System.out.println(entry.getKey() + "Has capital city of " + entry.getValue());

        }


    }


}
