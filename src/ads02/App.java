package ads02;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Student a = new Student();
        // a.registration = 11011;
        // a.name = "some name";
        // a.id = 98979875;
        // /*
        // * System.out.println(a.registration);
        // * System.out.println(a.name);
        // * System.out.println(a.id);
        // *
        // * a.name = "Other name";
        // * System.out.println(a.name);
        // * System.out.println();
        // * a.info();
        // */
        // Student b = new Student();
        // b.registration = 9432934;
        // b.name = "Janine";
        // b.id = 293239;
        // b.info();

        // calling a static method
        System.out.println(Car.mileToMeter(10));

        // calling a static attr
        System.out.println(Car.pi);

        SchoolClass d = new SchoolClass();
        d.teacher = new Teacher();
        d.teacher.name = "Prof. Oak"; // d (schoolclass) has teacher attr, that has the name attr
        d.students = new ArrayList<Student>();
        // d.students.add(new Student()); // adds one student to the array. since it is
        // empty, added student will be index
        // 0
        // d.students.get(0).name = "Ash"; // setting the name of the index 0 of the
        // array to "Ash"

        // CONSTRUCTOR
        // declaring a constructor makes that instantiating a new object with new
        // Class() impossible. the constructor replaces this format, so you always have
        // to send the arguments required (that's why i commented all the Student
        // instances in this code made with the default constructor, they werent valid
        // anymore, since i declared a new constructor):
        Student e = new Student(1002, "Misty", 328728);
        e.info();

        ArrayList<Student> students = new ArrayList<>();

        students.add(e);
        students.add(new Student(8232, "Brock", 9320293));
        System.out.println(students.toString()); // prints memory address. to print actual objects, must OVERRIDE
                                                 // toString() (see Student.java)

    }

}