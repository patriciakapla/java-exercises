package ads06;

public class Grade {
    private double grade1, grade2;
    private int skippedClasses;

    Grade(double grade1, double grade2, int skippedClasses) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.skippedClasses = skippedClasses;
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public int getSkippedClasses() {
        return skippedClasses;
    }

    public void setGrade1(double grade) {
        if (grade >= 0 && grade <= 10) {
            this.grade1 = grade;
        } else {
            System.out.printf("%.2f is not a valid grade.\n", grade);
        }
    }

    public void setGrade2(double grade) {
        if (grade >= 0 || grade <= 10) {
            this.grade2 = grade;
        } else {
            System.out.printf("%.2f is not a valid grade.\n", grade);
        }
    }

    public void setSkippedClasses(int skippedClasses) {
        if (skippedClasses >= 0 || skippedClasses <= 200) {
            this.skippedClasses = skippedClasses;
        } else {
            System.out.println("Not a valid value");
        }
    }

    public void result(double grade1, double grade2, int skippedClasses) {
        double result = (grade1 + grade2) / 2;
        System.out.println("Ana's avarage is: " + result);
        if (skippedClasses > 7) {
            System.out.println("Ana skipped too many classes! She won't pass to the next grade :(");
        } else if (result >= 7) {
            System.out.println("Ana passed without finals!");
        } else {

            System.out.println("Not enough! Ana'll have to take finals");
        }
    }

}
