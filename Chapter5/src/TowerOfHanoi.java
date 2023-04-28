// Chapter 5, Lesson 2 - Tower Of Hanoi Game Recursion Example

public class TowerOfHanoi{
    public void solvePuzzle(int n, String begin, String temp, String end) {
        if(n == 1) {
            System.out.println(begin + " ---> " + end);
        }
        else {
            solvePuzzle(n-1, begin, end, temp);
            System.out.println(begin + " ---> " + end);
            solvePuzzle(n-1, temp, begin, end);
        }
    }
    public static void main(String[] args) {
        TowerOfHanoi tower = new TowerOfHanoi();
        int disks = 3;

        System.out.println("Welcome to the Tower of Hanoi! Solution below:");
        tower.solvePuzzle(disks, "Peg 1", "Peg 2", "Peg 3");
    }
}