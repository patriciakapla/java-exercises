package ads02;

public class Student {
    int registration;
    String name;
    int id;

    // CONSTRUCTOR DECLARATION
    Student(int paramRegistration, String paramName, int paramID) {
        registration = paramRegistration;
        name = paramName;
        id = paramID;
    } // if parameters had the same name as the attribute, the declaration should be:

    // Student(int registration, String name, int id)
    // {
    // this.registration = registration;
    // this.name = name;
    // this.id = id;
    // }

    // you can also declare default values for attributes:
    // Student(int registrationv) {
    // {
    // this.registration = registration;
    // this.name = "";
    // this.id = 0000000;
    // }

    // delcaring constructor without parameters is also possible:
    // Student() {
    // System.out.println("Student object created");
    // } displays a message every time you instantiate a new object of that class

    // void: basic return type indicating no result.
    void info() {
        System.out.println("Registration: " + registration);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println();
    }

    // OVERRIDING .toString()
    @Override
    public String toString() {
        return "Student Name: " + name + "\n Registration: " + registration + "\n ID: " + id + "\n";
    }

}