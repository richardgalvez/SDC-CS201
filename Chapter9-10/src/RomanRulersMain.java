// Chapter 9, Lesson 2 - Priority Queue Sorted List Example (Main)

import java.util.PriorityQueue;

public class RomanRulersMain {
    public static void main(String[] args) {
        RomanRulers Augustus = new RomanRulers(1, "Augustus");
        RomanRulers Tiberius = new RomanRulers(2, "Tiberius");
        RomanRulers Caligula = new RomanRulers(3, "Caligula");
        RomanRulers Claudius = new RomanRulers(4, "Claudius");
        RomanRulers Nero = new RomanRulers(5, "Nero");
        RomanRulers Galba = new RomanRulers(6, "Galba");
        RomanRulers Otho = new RomanRulers(7, "Otho");
        RomanRulers AulusVitellius = new RomanRulers(8, "Aulus Vitellius");
        RomanRulers Vespasian = new RomanRulers(9, "Vespasian");
        RomanRulers Titus = new RomanRulers(10, "Titus");
        RomanRulers Domitian = new RomanRulers(11, "Domitian");
        RomanRulers Nerva = new RomanRulers(12, "Nerva");

        PriorityQueue<RomanRulers> theRulers = new PriorityQueue<>();
        theRulers.add(Augustus);
        theRulers.add(AulusVitellius);
        theRulers.add(Caligula);
        theRulers.add(Claudius);
        theRulers.add(Domitian);
        theRulers.add(Galba);
        theRulers.add(Nero);
        theRulers.add(Nerva);
        theRulers.add(Otho);
        theRulers.add(Tiberius);
        theRulers.add(Titus);
        theRulers.add(Vespasian);

        while(!theRulers.isEmpty()) {
            System.out.println("Rulers Deceased: " + theRulers.remove());
        }
    }
}
