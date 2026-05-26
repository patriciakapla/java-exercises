package ads09;

public class VIPTicket extends Ticket {
    public double aditional;

    public VIPTicket() {
    }

    public VIPTicket(String eventName, double price, double aditional) {
        super(eventName, price);
        this.aditional = aditional;
    }

    public double total() {
        return price + aditional;
    }

    @Override
    public void printTicket() {
        super.printTicket();
        System.out.println("VIP aditional: $" + aditional);
        System.out.println("Total: $" + total());
    }
}
