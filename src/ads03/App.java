package ads03;

public class App {

    public static void main(String[] args) {
        Exam jana = new Exam(7, 8, 5);
        Exam ginger = new Exam(5, 7, 8);
        Exam joel = new Exam(8, 5, 7);

        Exam luna = new Exam();
        luna.grade1 = 10;
        luna.grade2 = 5;
        luna.grade3 = 6;

        System.out.println(jana.arithmeticAverage());
        System.out.println(ginger.arithmeticAverage());
        System.out.println(joel.arithmeticAverage());
        System.out.println(luna.arithmeticAverage());
        System.out.println();
        System.out.println(jana.weightedAverage());
        System.out.println(ginger.weightedAverage());
        System.out.println(joel.weightedAverage());
        System.out.println(luna.weightedAverage());

        Student katia = new Student("katia", "history", new Exam(7, 9, 10));

        katia.displayInfo();
    }
}
