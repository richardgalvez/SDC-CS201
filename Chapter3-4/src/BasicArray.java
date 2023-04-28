// Chapter 3 Lesson 1 - Basic Array and Dimensions Example

public class BasicArray {
    public static void main(String[] args) {
        int[] sequence;
        sequence = new int[50];     // new int is the array length, cannot change

        int[] series1 = new int[5];
        series1[0] = 22;
        series1[1] = 44;
        series1[2] = 96;
        series1[3] = 122;
        series1[4] = 199;

        int[] series2 = {22, 44, 96, 122, 889};

        int [][] myMatrix;      // Two-dimensional matrix
        myMatrix = new int[10][3];

        System.out.println(sequence[0]);
        System.out.println(series2[4]);
        System.out.println(sequence.length);    // Get length of sequence array
        System.out.println("------Below is the print using a loop------");
        System.out.println(myMatrix[0] + " <--- Invalid");

        for(int i = 0; i < series1.length; i++) {
            System.out.println(series1[i]);
        }
    }
}