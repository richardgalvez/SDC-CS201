public class OuterClass {
    
    static class Nested {
        void print_msg(){System.out.println("from the nested class");}
    }
    public static void main(String[] args) {
        OuterClass.Nested object=new OuterClass.Nested();
        object.print_msg();
    }
}
