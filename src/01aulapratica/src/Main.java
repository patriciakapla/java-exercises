import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        // EXERCISE 1
        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Enter your weight: ");
//        float weight = keyboard.nextFloat();
//        System.out.println("Enter your height: ");
//        float height = keyboard.nextFloat();
//
//        float bmi = (float) (weight/ Math.pow(height, 2));
//        System.out.printf("Your BMI is: %.2f\n", bmi);

        // EXERCISE 2

//        int soldiers = 10000;
//        int guess = 0;
//        System.out.println("Help Leonidas!");
//        System.out.println("Guess how many soldiers his army will have to fight");
//        while (guess != soldiers){
//        System.out.println("Enter your guess: ");
//        guess = keyboard.nextInt();
//        if (guess == soldiers) {
//            System.out.println("Yes, 10.000 soldiers!");
//        }
//        else if (guess < soldiers){
//                System.out.println("More! Try again.");
//            }
//        else {
//            System.out.println("Not THAT much, try again.");
//        }
//        }

        // EXERCISE 3
//        String[] words = new String[10];
//        for (int i = 0; i < words.length; i++) {
//            System.out.println("Enter a word: ");
//            words[words.length-1-i] = keyboard.next();
//        }
//        System.out.println(Arrays.toString(words));

        ArrayList <String> nameList = new ArrayList<String>();
        System.out.println("Enter how many names you wish to insert: ");
        int qty = keyboard.nextInt();
        for (int i =0; i<qty; i++) {
            System.out.println("Enter a name: ");
            String name = keyboard.next();
            nameList.add(name);
        }
//        for (int j = 0; )
        
        System.out.println(nameList.reversed());
    }
}