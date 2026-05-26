package ads06;

public class App {

    public static void main(String[] args) {

        Grade student = new Grade(9, 5, 5);
        System.out.println("Student's first grade: " + student.getGrade1());
        System.out.println("Student's second grade: " + student.getGrade2());
        student.result(student.getGrade1(), student.getGrade2(), student.getSkippedClasses());

        Course advancedVampireHunting = new Course("Advanced vampire hunting", 3000);

        Student buffy = new Student("Buffy Summers", 392849, 10, advancedVampireHunting);

        advancedVampireHunting.describe();
        buffy.describe();
        buffy.payment();
    }
}
