// CHapter 5, Lesson 1 - Recursion Example

public class Recursive {
    public static void main(String[] args) {
        private static String reverseNameRecursive (String theName) {
            if (theName.length() == 0) {
                return ("");
            }
            else {
                return (reverseNameRecursive (theName.substring(1) + theName.charAt(0)));
            }
        }
    }
}
