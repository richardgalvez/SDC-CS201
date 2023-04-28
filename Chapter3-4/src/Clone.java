// Chapter 3, Lesson 9 - Shallow Copy Example

public class Clone {
    public static void main(String[] args) {
        int highScores[] = {250, 275, 300, 525, 705};
        
        // Create new array and use arraycopy from the starting position (0) of highScores
        int[] newScores = new int[5];
        System.arraycopy(highScores, 0, newScores, 0, 5);

        System.out.println("Check out the High Scores: ");
        for (int i = 0; i < highScores.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("New Scores: ");
        for (int i = 0; i < newScores.length; i++) {
            System.out.print(i + " ");
        }

        /* The below will result in null pointer exception error as deep copy is not possible here
        Scores[] scoresArray = new Scores[5];
        scoresArray[0].scores = 100;
        scoresArray[1].scores = 500;

        
        Scores[] mewScoresArray = new Scores[5];
        System.arraycopy(scoresArray, 0, newScoresArray, 0, 2);
        */
    }
}