// Chatper 13, Lesson 1 - Text as a Data Structure Example

public class TextSample{
    public static void main(String[] args) {
        String s1 = "STOP";
        String s2 = s1;
        s1 = "STAP";
        System.out.println(s2);
        System.out.println();
        
        // Convert String to Character array
        String sign = "STOP";
        char[] newSign = sign.toCharArray();
        // Cycle through chars
        for(char c : newSign) {
            System.out.println(c);
        }
        System.out.println(sign);

        newSign[2] = 'U';
        for(char c : newSign) {
            System.out.println(c);
        }
        System.out.println();

        // Convert Character array to String
        char[] charArray = {'S', 'T', 'O', 'P'};
        String newArray = new String(charArray);
        System.out.println(newArray);
        System.out.println();

        StringBuilder s3 = new StringBuilder("STO");
        System.out.println(s3);
        // Append 'P'
        s3.append("P");
        System.out.println(s3);
        // Insert an exclamation point
        s3.insert(0, "!");
        System.out.println(s3);
        // Reverse the string
        s3.reverse();
        System.out.println(s3);
    }
}