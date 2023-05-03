// Chapter 7, Lesson 4 - Array List Example

import java.util.*;

public class FrameworkArrayList {
    public static void main(String[] args) {
        List <String> myList = new ArrayList<>();
        myList.add("This");
        myList.add("makes");   
        myList.add("no");
        myList.add("sense");
        System.out.println(myList.get(1));

        myList.set(2, "perfect");
        for(String theValue : myList) {
            System.out.print(theValue + ' ');
        }
    }
}
