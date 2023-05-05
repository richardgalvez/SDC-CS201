// Chapter 15, Lesson 1 - Memory Management Example (Line by line showcase)

public class Expression {
    // JRE creates stack memory for main() method.
    public static void main(String[] args) {    
         // A primitive local variable i is created and stored in the stack memory of main() method.
        int i = 1;         
        // A new Object is created in heap memory whose reference is created in the stack memory.       
        Object obj = new Object();
        // Same operation repeats for Expression object.
        Expression expr = new Expression();
        // add() method is called and a block of memory is allocated at the top of the stack.
        expr.add(obj);
        // (Final step) main() method terminates and its stack memory is also set free. The program ends and all 
        // stack memory is freed. At this point, the garbage collector automatically runs and checks for unreferenced 
        // objects and reclaims memory from the heap.
    }
    // A reference to new object var is created in the add() block.
    private void add(Object var) {
        // A string is created and assigned to String Pool in heap memory. Its reference is created in add() block of stack memory.
        String str = var.toString();
        System.out.println(str);
        // add() method is terminated and stack memory allocated for add() block becomes free.
    }
}
