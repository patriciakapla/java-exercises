package ads06;

public class Course {
    String name;
    double fee;

    Course() {
    }

    Course(String name, double fee) {
        this.name = name;
        this.fee = fee;
    }

    public void describe() {
        System.out.println("Course name: " + this.name);
        System.out.println("Monthly fee: " + this.fee);
    }
}
