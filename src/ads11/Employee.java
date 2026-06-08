package ads11;

public class Employee implements Printable {
    String name;
    int id;

    public Employee(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }

    @Override
    public void print(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
