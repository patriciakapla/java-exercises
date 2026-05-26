package ads08;

public class DigitalBook extends Book {
    private int download;
    private double size;

    // Constructors

    public DigitalBook() {

    }

    public DigitalBook(String title, Author author, String genre, int edition, int download, double size) {
        super(title, author, genre, edition);
        this.download = download;
        this.size = size;
    }

    // Getters

    public int getDownload() {
        return download;
    }

    public double getSize() {
        return size;
    }

    // Setters

    public void setDownload(int download) {
        this.download = download;
    }

    public void setSize(double size) {
        this.size = size;
    }

    // Other methods

    @Override
    public void info() {
        super.info();
        System.out.println("Book's circulation: " + download);
        System.out.println("Book's size: " + size);
    }

}
