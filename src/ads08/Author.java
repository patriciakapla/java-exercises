package ads08;

public class Author {
    private String name, email, nationality;

    // Constructors

    public Author() {

    }

    public Author(String name, String email, String nationality) {
        this.name = name;
        this.email = email;
        this.nationality = nationality;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNationality() {
        return nationality;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // Other methods

    public void info() {
        System.out.println("Author's name: " + name);
        System.out.println("Author's email: " + email);
        System.out.println("Author's nationality: " + nationality);
    }

}
