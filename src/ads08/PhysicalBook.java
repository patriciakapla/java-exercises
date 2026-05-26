package ads08;

public class PhysicalBook extends Book {
    private int circulation, weight;

    // Constructors

    public PhysicalBook() {

    }

    public PhysicalBook(String title, Author author, String genre, int edition, int circulation, int weight) {
        super(title, author, genre, edition);
        this.circulation = circulation;
        this.weight = weight;
    }

    // Getters

    public int getCirculation() {
        return circulation;
    }

    public int getWeight() {
        return weight;
    }

    // Setters

    public void setCirculation(int circulation) {
        this.circulation = circulation;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Other methods

    @Override
    public void info() {
        super.info();
        System.out.println("Book's circulation: " + circulation);
        System.out.println("Book's weight: " + weight);
    }

}
