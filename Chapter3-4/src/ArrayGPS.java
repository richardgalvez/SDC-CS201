// CHapter 3, Lesson 3 - Processing Arrays Example involving GPS coordinates

import java.util.*;
public class ArrayGPS {
    public static void main(String[] args) {
        int row;
        int column;
        double distance;
        double shortestDistance = 0;
        int userX = 0;      // User is at 0,0
        int userY = 0;
        int [][] gps = {
            {-2, 4},
            {3, 2},
            {-5, -5},
            {4, -1},
        };
        for(row = 0; row < gps.length; row++) {
            for(column = 0; column < gps[row].length; column++) {
                distance = distance(gps[row][0], gps[row][1], gps[column][0], gps[column][1]);
                if(shortestDistance < distance) {
                    userX = row;
                    userY = column;
                    shortestDistance = distance;
                }
            }
        }
        System.out.println("The nearest point is " + "(" + gps[userY][0] + ", " + gps[userY][1] + ")");
    }
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) * (y2 - y1) * (y2 - y1));
    }
}
