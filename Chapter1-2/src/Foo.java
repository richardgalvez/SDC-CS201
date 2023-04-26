// Chapter 2, Lesson 8 Question

public class Foo {
    int number = 3;
    int add(int number) {
        return this.number + 6;
    }
    static class Bar {
        int add(int number) {
            return number + 1;
        }
    }
   public static void main(String[] args) {
    Foo.Bar bar = new Foo.Bar();
    System.out.println ("The number is " + bar.add(4));
   } 
}