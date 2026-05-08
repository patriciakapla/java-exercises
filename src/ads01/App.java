package ads01;

import java.util.Scanner;

// public class = can be accessed by other modules
public class App {
    // void is the function return type (in python, None)
    // [] -> array
    public static void main(String[] args) throws Exception {
        // System -> system class
        // out -> system's standard output
        // print -> print
        // ln -> line: ends the line after, goes to a new one.

        System.out.println("Hello, World!");

        System.out.println(100);

        // To declare variables, you must declare first its type:

        String name = "Buffy";
        int age = 33;
        age = age + 2;

        System.out.println("Age: " + age);
        System.out.println(name);

        // printf -> format string, inserting given variable in %d place. similar to
        // python's format string (both inspired by C)
        // \n for new line

        System.out.printf("Age: %d\n", age);

        double morePrecise = 5.5; // java standard

        float savesMemory = 10.4f; // f in the end, otherwise java will understand as double (since it's standard)

        // \n for new line
        System.out.printf("This is a double: %f\n", morePrecise);

        // for control in number of decimal digits: %.numberf
        System.out.printf("This is a double with 2 decimal digits: %.2f\n", savesMemory);

        // data reading:
        Scanner keyboard = new Scanner(System.in);
        // Scanner is a class. Keyboard is an object that is being initialized by new
        // Scanner.
        // System.in -> standard input stream

        // keyboard object now is used to prompt new values for the variables:

        // name = keyboard.next();
        // age = keyboard.nextInt();
        // morePrecise = keyboard.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(morePrecise);

        if (age < 18)
            // without curly brackets, only the first line after declaration will be on the
            // if's
            // scope
            System.out.println("Access denied");

        // wrap if's content in curly brackets to make it cover more than one line
        if (age < 18) {
            System.out.println("Access denied");
            System.out.println("Must be over 18 years old");
        }

        else if (age < 65) {
            System.out.println("Adult");
        }

        else {
            System.out.println("Elder");
        }

        int x = 0;

        while (x < 2) {
            System.out.println("while loop");
            x = x + 1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Value " + i);
        }

        // ARRAY
        // to declare an array, you declare the data type inside the array,
        // the brackets with the name of the array
        // and the elements of the array inside curly brackets

        int lottery[] = { 14, 63, 66, 34, 23, 89, 67, 58, 13 };
        System.out.println("Lottery:\n" + lottery + "\n"); // RETURNS THE ARRAY'S MEMORY SPACE!
        System.out.println(lottery[0]);

        lottery[0] = 99; // now the index 0 of the array will be 99
        System.out.println("Lottery:\n" + lottery + "\n"); // RETURNS THE ARRAY'S MEMORY SPACE!
        System.out.println(lottery[0]);

        // other way of declaring an array:
        int numbers[] = new int[200];
        System.out.println("Numbers:\n" + numbers + "\n"); // RETURNS THE ARRAY'S MEMORY SPACE!
        System.out.println(numbers[0]);

        numbers[0] = 88; // now the index 0 of the array will be 88
        System.out.println("Numbers:\n" + numbers + "\n"); // RETURNS THE ARRAY'S MEMORY SPACE!
        System.out.println(numbers[0]);

    }

}
