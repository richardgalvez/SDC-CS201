// Chapter 9, Lesson 4 - Priority Queue Example (Main Driver)

import java.util.PriorityQueue;

public class TicketExample {
    public static void main(String[] args) {
        PriorityQueue<Ticket> ticketList = new PriorityQueue<>();
        Ticket ticket1 = new Ticket("Winsted", "Orrzo, Bobby");
        Ticket ticket2 = new Ticket("Manchester", "Windmill, Sandy");
        Ticket ticket3 = new Ticket("Honolulu", "Pine, Rhona");
        Ticket ticket4 = new Ticket("Nashville", "Orbitz, Nate");
        Ticket ticket5 = new Ticket("Ashville", "Prink, Katelin");
        ticketList.add(ticket1);
        ticketList.add(ticket2);
        ticketList.add(ticket3);
        ticketList.add(ticket4);
        ticketList.add(ticket5);

        // Insert name that has the same city
        Ticket ticket6 = new Ticket("Honolulu", "Clearly, Betty");
        ticketList.add(ticket6);

        while(!ticketList.isEmpty()) {
            Ticket i = ticketList.poll();
            System.out.println(i);
        }
    }
}
