// Chapter 9, Lesson 4 - Priority Queue Example

public class Ticket implements Comparable<Ticket> {
    private String city;
    private String ticketHolder;
    public Ticket(String holderCity, String holderName) {
        city = holderCity;
        ticketHolder = holderName;
    }
    public String getCity() {
        return city;
    }
    public String getTicketHolder() {
        return ticketHolder;
    }
    public String toString() {
        return "Next on our list is " + getTicketHolder() + " from " + getCity() + "!";
    }
    @Override
    public int compareTo(Ticket theOtherTicket) {
        int theResult = this.city.compareTo(theOtherTicket.city);
        if(theResult == 0) {
            theResult = this.ticketHolder.compareTo(theOtherTicket.ticketHolder);
        }
        return theResult;
    }
}
