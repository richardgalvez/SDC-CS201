// Chapter 7, Lesson 4 - Array List Example 2

import java.util.*;

public class NameList {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Jimmy");
        listOfNames.add("Sheen");
        listOfNames.add("Cindy");
        listOfNames.add("Libby");
        listOfNames.add("Carl");
        listOfNames.add("Hugh");
        listOfNames.add("Lora");
        if(listOfNames.contains("Lora")) {
            System.out.println("Record found!");
        }
        else {
            System.out.println("Record not found...");
        }

        System.out.println("");

        Collections.sort(listOfNames);
        for(String theName : listOfNames) {
            System.out.println(theName);
        }

        System.out.println("");

        for(int i = 0; i < listOfNames.size(); i++) {
            String tempName = listOfNames.get(i);
            listOfNames.set(i, tempName.substring(0, 1).toLowerCase() + tempName.substring(1));
        }
        for(String theName : listOfNames) {
            System.out.println(theName);
        }
    }
}
