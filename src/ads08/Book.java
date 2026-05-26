package ads08;

public class Book {
    protected String title, genre;
    protected Author author;
    protected int edition;

    // Constructors

    public Book() {

    }

    public Book(String title, Author author, String genre, int edition) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.edition = edition;
    }

    // Getters

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Author getAuthor() {
        return author;
    }

    public int getEdition() {
        return edition;
    }

    // Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    // Other methods
    public void info() {
        System.out.println("Book's title: " + title);
        System.out.println("Book's author: " + author.getName());
        System.out.println("Book's genre: " + genre);
        System.out.println("Book's edition: " + edition);
    }

}
