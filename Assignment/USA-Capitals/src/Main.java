// CS201: Data Structures & Algorithms - Array Sorting and Hashmaps Assignment
// by Richard Galvez - Completed 5/15/2023
/* 
FOR ASSIGNMENT GRADER: Provided as .txt file with all notes/comments. Please rename the file to Main.java to compile.
If other format needed, please specify.
*/

/*
  Develop a program that asks the user to enter a capital for a U.S. state. Upon receiving the user input, 
  the program reports whether the user input is correct. For this application, the 50 states and their capitals 
  are stored in a two-dimensional array in order by state name. Display the current contents of the array 
  then use a bubble sort to sort the content by capital. Next, prompt the user to enter answers for all the state capitals 
  and then display the total correct count. The user's answer is not case-sensitive.

  Now revise the code to store the pairs of each state and its capital in a Map using the HashMap function. Display the 
  content of the Map, then use the TreeMap class to sort the map while using a binary search tree for storage. 
  Next, your program should prompt the user to enter a state and it should then display the capital for the state.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create 2D array for states and their capitals, in order by state name with capital next to it
        String stateCapitals[][] = {
                                  {"Alabama", "Montgomery"},
                                  {"Alaska", "Juneau"},
                                  {"Arizona","Phoenix"},
                                  {"Arkansas", "Little Rock"},
                                  {"California", "Sacramento"},
                                  {"Colorado", "Denver"},
                                  {"Connecticut", "Hartford"},
                                  {"Delaware", "Dover"},
                                  {"Florida", "Tallahassee"},
                                  {"Georgia", "Atlanta"},
                                  {"Hawaii", "Honolulu"},
                                  {"Idaho", "Boise"},
                                  {"Illinois", "Springfield"},
                                  {"Indiana", "Indianapolis"},
                                  {"Iowa", "Des Moines"},
                                  {"Kansas", "Topeka"},
                                  {"Kentucky", "Frankfort"},
                                  {"Louisiana", "Baton Rouge"},
                                  {"Maine", "Augusta"},
                                  {"Maryland", "Annapolis"},
                                  {"Massachusetts", "Boston"},
                                  {"Michigan", "Lansing"},
                                  {"Minnesota", "St. Paul"},
                                  {"Mississippi", "Jackson"},
                                  {"Missouri", "Jefferson City"},
                                  {"Montana", "Helena"},
                                  {"Nebraska", "Lincoln"},
                                  {"Nevada", "Carson City"},
                                  {"New Hampshire", "Concord"},
                                  {"New Jersey", "Trenton"},
                                  {"New Mexico", "Santa Fe"},
                                  {"New York", "Albany"},
                                  {"North Carolina", "Raleigh"},
                                  {"North Dakota", "Bismarck"},
                                  {"Ohio", "Columbus"},
                                  {"Oklahoma", "Oklahoma City"},
                                  {"Oregon", "Salem"},
                                  {"Pennsylvania", "Harrisburg"},
                                  {"Rhode Island", "Providence"},
                                  {"South Carolina", "Columbia"},
                                  {"South Dakota", "Pierre"},
                                  {"Tennessee", "Nashville"},
                                  {"Texas", "Austin"},
                                  {"Utah", "Salt Lake City"},
                                  {"Vermont", "Montpelier"},
                                  {"Virginia", "Richmond"},
                                  {"Washington", "Olympia"},
                                  {"West Virginia", "Charleston"},
                                  {"Wisconsin", "Madison"},
                                  {"Wyoming", "Cheyenne"},
        };
        // Welcome message and ask the user for input (Enter capital for U.S. state)
        System.out.println("Welcome to the U.S. State Capital Guessing Game!");
        System.out.print("Please enter a capital for any U.S. state: ");
        Scanner guessObj1 = new Scanner(System.in);
        String userGuess1 = guessObj1.nextLine();
        System.out.println("You entered " + userGuess1 + ", let me check that out...");
        // Initialize boolean value for while loop to determine match of capital to user's input
        boolean guessMatch = false;
        while(guessMatch != true) {
          for(int i = 0; i < stateCapitals.length; i++) {
            // Loop through array for a match of user input capital to U.S. state
            if(stateCapitals[i][1].equalsIgnoreCase(userGuess1)) {
              guessMatch = true;
              System.out.println("Nice! That matches for the state of " + stateCapitals[i][0] + "!");
              break;
            }
            // If no match, end the loop and continue on to next prompts
          }
          if(guessMatch == false) {
            System.out.println("Hmm, that does not seem to match anything... Better luck next time!");
            break;
          }
        }
        System.out.println("=====================================================");
        // Per Assignment Part 1, display contents of the 2D array
        System.out.println("Okay, per our sponsor, here's a quick look at what we've got for our 2D array, currently sorted by state name: ");
        for(String[] r : stateCapitals){
          System.out.println(Arrays.toString(r));
        }
        // Carry out bubble sort to arrange 2D array by state captial
        for(int i = 0; i < stateCapitals.length; i++) {
          for(int j = i + 1; j < stateCapitals.length; j++) {
            // Temporary values to store for swapping while sorting
            String tState;
            String tCapital;
            // Compare values during iteration
            if(stateCapitals[j][1].compareTo(stateCapitals[i][1]) < 0) {
              // Swap values if capital is less than current capital, do the same for state so state and capital names will match up properly
              tCapital = stateCapitals[i][1];
              stateCapitals[i][1] = stateCapitals[j][1];
              stateCapitals[j][1] = tCapital;
              tState = stateCapitals[i][0];
              stateCapitals[i][0] = stateCapitals[j][0];
              stateCapitals[j][0] = tState;
            }
          }
        }
        System.out.println("=====================================================");
        // Print out new bubble sorted array on display
        System.out.println("Bubble sorted, now arranged by capital order: ");
        for(String[] r : stateCapitals){
          System.out.println(Arrays.toString(r));
        }
        System.out.println("=====================================================");
        // Prompt user to enter as many capitals one by one, instructing them how to play the game
        System.out.println("Alright, you've now seen them listed twice, let's see how good your memory is...");
        System.out.println("Enter as many state capitals as you can and we'll keep score of how many you got right!");
        System.out.println("Hit the 'Enter' key after typing each answer to submit, or type 'quit' or 'q' when you are done below. ");
        // Initialize counter for correct answers, scanner object for string input
        int correctCount = 0;
        Scanner guessObj2 = new Scanner(System.in);
        // Set while loop to keep prompting user for next answer, with option to quit
        while(true) {
          String userGuess2 = guessObj2.nextLine();
          if(userGuess2.equalsIgnoreCase("quit") || userGuess2.equalsIgnoreCase("q")) {
            break;
          }
          // Iterate over the second array to check if it matches, increment correctCount by 1 if so to track score
          for(String[] tempArray : stateCapitals) {
            for(String e : tempArray) {
            if(e.equalsIgnoreCase(userGuess2)) {
              correctCount++;
            }
          }
        }
      }
      // Display the amount correctly guessed U.S. state capital names, end of Part 1
      System.out.println("You have " + correctCount + " correct capitals!");
      System.out.println("=====================================================");
      // Begin Part 2 - Create HashMap with 2D array's values, initialize HashMap
      System.out.println("Let's move on... Make it into a HashMap and let's see what it looks like!");
      Map<String, String> mapCapitals = new HashMap<>();
      // Iterate through the arrays and insert as key-value pairs in the HashMap
      for(int i = 0; i < stateCapitals.length; i++) {
        mapCapitals.put(stateCapitals[i][0], stateCapitals[i][1]);
      }
      // Print HashMap contents (key-value pair of all 50 states and their capitals)
      for(String s : mapCapitals.keySet()) {
        String key = s.toString();
        String value = mapCapitals.get(s).toString();
        System.out.println(key + ", " + value);
      }
      System.out.println("=====================================================");
      // Use TreeMap class to sort the map in ascending order, printing for proof
      System.out.println("Great! Looking good, but let's use TreeMap to sort it! Here's what it is now: ");
      TreeMap<String, String> mapCapitalTree = new TreeMap<>(mapCapitals);
      for(String t : mapCapitalTree.keySet()) {
        String key = t.toString();
        String value = mapCapitalTree.get(t).toString();
        System.out.println(key + ", " + value);
      }
      System.out.println("=====================================================");
      // Ask user to enter a state, then display the corresponding state's capital, similar to previous game instruction
      System.out.println("Last thing! Give me a U.S. state name (proper name, case-sensitive) and I'll give you the capital of that state.");
      System.out.println("Hit the 'Enter' key after typing each answer to submit, or type 'quit' or 'q' when you are done below. ");
      // Initialize boolean for while loop, scanner object for user input
      boolean loopOver = false;
      Scanner guessObj3 = new Scanner(System.in);
      while(!loopOver) {
        String userGuess3 = guessObj3.nextLine();
        // Quit if user decides
        if(userGuess3.equalsIgnoreCase("quit") || userGuess3.equalsIgnoreCase("q")) {
          System.out.println("Exiting now. That's all folks!");
          loopOver = true;
          continue;
        }
        // Match user-specified state with corresponding capital and display
        if(mapCapitalTree.containsKey(userGuess3)) {
          System.out.println("Alright! The capital of " + userGuess3 + " is " + mapCapitalTree.get(userGuess3) + "!");
        }
        // Error out if not correctly specified, user can continue to input or quit from there
        else {
          System.out.println("State not found... Please enter again or feel free to exit with 'quit' or 'q'.");
      }
    }
  }
}