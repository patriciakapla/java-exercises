package ads11;

public class App {
    public static void main(String[] args){

        Employee emp = new Employee("Joanna Strix", 1812938129);
        Product prdct = new Product("pen", 2.99);
        Geometric triangle = new Geometric(3, 5);

        Printable p = emp;
        p.print();
        p = prdct;
        p.print();
        p = triangle;
        p.print();
        

    }

}