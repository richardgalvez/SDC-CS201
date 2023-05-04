// Chapter 10, Lesson 7 - Practical Application for Hash Table Excercise

import java.util.*;
import java.io.*;

public class HashTableExample {
    public static void main(String[] args) {
        // Create a new hash table to store library books by id and subject
        Hashtable libraryBooks = new Hashtable();

        // (a) Store books in a library by code and subject area
        libraryBooks.put("748.5", "Stained Glass");
        libraryBooks.put("553.8", "Gems");
        libraryBooks.put("363.739", "Air Pollution");
        libraryBooks.put("567.2", "Grassland");
        libraryBooks.put("100.4", "History");
        libraryBooks.put("200.9", "Geography");        

        // (b) Retreive a book by its id
        System.out.println("Retreive book by id 748.5: " + libraryBooks.get("748.5"));
        System.out.println("Retreive book by id 300.8: " + libraryBooks.get("300.8"));
        System.out.println("Retreive book by id 349.78: " + libraryBooks.get("349.78"));

        // (c) Check to see if id exists
        System.out.println("If id 553.8 exists: " + libraryBooks.containsKey("553.8"));
        System.out.println("if id 448.7 exists: " + libraryBooks.containsKey("448.7"));

        // (d) Check to see if a subject exists
        System.out.println("If subject Gems exists: " + libraryBooks.containsValue("Gems"));
        System.out.println("If subject Wheat Grass exists: " + libraryBooks.containsValue("Wheat Grass"));

        // (e) Print out all the values contained in the hash table
        /*
        Enumeration enumeration = libraryBooks.elements();
        while(enumeration.hasMoreElements()) {
            System.out.println("hashtable values: " + enumeration.nextElement());
        }
        */

        Enumeration enumeration = libraryBooks.elements(); 
        while (enumeration.hasMoreElements()) {
            System.out.println("hashtable values: " + enumeration.nextElement()); 
        }

        // (f) Find the size of the hash table
        System.out.println("Size of hashtable in Java: " + libraryBooks.size());

        // (g) Clear the hash table
        libraryBooks.clear();

        System.out.println("Is the hash table empty now? " + libraryBooks.isEmpty());
    }
}