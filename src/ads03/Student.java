package ads03;

public class Student {
    String name, subject;
    Exam grade;

    Student() {

    }

    Student(String name, String subject, Exam grade) {
        this.name = name;
        this.subject = subject;
        this.grade = grade;
    }

    void displayInfo() {
        System.out.println();
        System.out.println("Student's information:");
        System.out.printf("Name: %s\n", name);
        System.out.println("Subject: " + subject);
        System.out.printf("Arithmethic average: %.2f\n", grade.arithmeticAverage());
        System.out.printf("Weighted average: %.2f\n", grade.weightedAverage());
    }

}