package ads03;

public class Exam {

    double grade1, grade2, grade3;

    // CONSTRUCTOR DECLARATION
    Exam(double grade1, double grade2, double grade3) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    // EMPTY CONSTRUCTOR: allows instantiating without arguments (default
    // constructor, was overwritten by the above construct)
    Exam() {

    }

    public double arithmeticAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }

    public double weightedAverage() {
        return ((grade1 * 2) + (grade2 * 3) + (grade3 * 4)) / (2 + 3 + 4);
    }
}