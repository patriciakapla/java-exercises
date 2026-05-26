package ads06;

public class Student {
    String name;
    int registration;
    double discount;
    Course course;

    Student() {
    }

    Student(String name, int registration, double discount, Course course) {
        this.name = name;
        this.registration = registration;
        this.discount = discount;
        this.course = course;
    }

    public void describe() {
        System.out.println("Name: " + this.name);
        System.out.println("Registration: " + this.registration);
        System.out.println("Discount: " + this.discount);
        System.out.println("Course: " + this.course);
    }

    public double payment() {
        double total = this.course.fee * (0.01 * this.discount);
        System.out.println(this.name + "monthly fee: " + total);
        return total;
    }
}
