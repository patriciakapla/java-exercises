package ads11;

public class Product implements Printable {
    String description;
    double price;

    public Product(String description, double price){
        super();
        this.description = description;
        this.price = price;
    }

    @Override
    public void print(){
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
    }
}
