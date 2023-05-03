// Chapter 7, Lesson 5 - Positional List 2 Example

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class PositionalListExample {
    public static void main(String[] args) {
        List dogNames = new ArrayList();
        dogNames.add("Fido");
        dogNames.add("Java");
        dogNames.add("Cujo");
        dogNames.add("Abby");
        dogNames.add("Muzzy");
        dogNames.add("Brandy");
        System.out.println(dogNames);

        dogNames.add(1, "George");
        System.out.println(dogNames);

        System.out.println("");

        String theDog = (String) dogNames.get(2);
        System.out.println("The dog at Position 2 (3rd dog) is " + theDog + "!");

        System.out.println("");

        int numberOfDogs = dogNames.size();
        System.out.println("There are " + numberOfDogs + " dogs in our list!");

        System.out.println("");

        for(int thePosition = 0; thePosition < dogNames.size(); thePosition++) {
            System.out.println("The dog at Position " + thePosition + " is " + dogNames.get(thePosition) + ".");
        }

        Collections.sort(dogNames);
        System.out.println(dogNames);
    }
}
