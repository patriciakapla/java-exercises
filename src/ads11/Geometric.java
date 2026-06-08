package ads11;

public class Geometric implements Printable{
    int numberOfSides;
    double area;

    public Geometric(int numberOfSides, double area) {
        super();
        this.numberOfSides = numberOfSides;
        this.area = area;
    }

    @Override
    public void print(){
        System.out.println("Number of sides: " + numberOfSides);
        System.out.println("Area: " + area);
    }
}
