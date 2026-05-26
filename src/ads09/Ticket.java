package ads09;

public class Ticket {
    public String eventName;
    public double price;

    public Ticket() {

    }

    public Ticket(String eventName, double price) {
        this.eventName = eventName;
        this.price = price;
    }

    public void printTicket() {
        System.out.println("Event: " + eventName);
        System.out.println("Ticket price: $" + price);
    }
}
