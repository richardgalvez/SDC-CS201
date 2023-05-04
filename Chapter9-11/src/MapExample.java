// Chapter 10, Lesson 1 - Map Data Type Example

import java.util.HashMap;
import java.util.Map;

import javax.management.openmbean.ArrayType;

public class MapExample {
    public static void main(String[] args) {
        Map arrayCars = new HashMap();
        arrayCars.put("Toyota", 6);
        arrayCars.put("Ford", 10);
        arrayCars.put("Honda", 5);
        arrayCars.put("Chrysler", 4);
        arrayCars.put("Honda", 10);

        System.out.println(arrayCars.get("Honda"));
        System.out.println(arrayCars.containsValue(2));
        System.out.println(arrayCars.containsValue(10));

        if(arrayCars.containsKey("Honda")) {
            System.out.println(arrayCars.containsKey("Honda"));
        }

        System.out.println(arrayCars.size());
    }
}