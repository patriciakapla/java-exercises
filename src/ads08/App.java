package ads08;

public class App {
    public static void main(String[] args) {
        // Author
        Author a1 = new Author();

        a1.setName("Edgar Allan Poe");
        a1.setEmail("poe@poe.com");
        a1.setNationality("USA");

        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getNationality());
        System.out.println();

        Author a2 = new Author("William Gibson", "gibson@gibson.com", "USA");
        Author a3 = new Author("Ursula K. Le Guin", "ursula@leguin.com", "USA");

        // Books

        PhysicalBook b1 = new PhysicalBook();
        b1.setTitle("Rocannon's World");
        b1.setAuthor(a3);
        b1.setGenre("SciFi");
        b1.setEdition(10);
        b1.setCirculation(15000);
        b1.setWeight(200);

        DigitalBook b2 = new DigitalBook();
        b2.setTitle("Neuromancer");
        b2.setAuthor(a2);
        b2.setGenre("SciFi");
        b2.setEdition(6);
        b2.setDownload(12000);
        b2.setSize(800);

        b1.info();
        System.out.println();
        b2.info();
    }

}
