// It describes a class which uses the SecureRandom object to generate 2 random one-digit numbers
// It then prompts the user (elementary school student) to tell the product of these numbers.

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void quiz() {
        int num1 = generateRandomNumber();
        int num2 = generateRandomNumber();

        askQuestion(num1, num2);
    }

    public static void askQuestion(int num1, int num2) {
        int answer;
        int correctAnswer = num1 * num2;

        System.out.printf("How much is %d times %d?\n", num1, num2);
        answer = input.nextInt();

        // while loop terminates only if correct answer is input
        while (answer != correctAnswer && answer != 0) {
            System.out.println("No. Please try again.");
            System.out.printf("How much is %d times %d?\n", num1, num2);
            answer = input.nextInt();
        }

        if (answer == num1 * num2 ) {
            System.out.println("Very good!");

            // ask the next question
            quiz();
        }
    }

    public static int generateRandomNumber() {
        // generate one-digit random numbers (1-9)
        return randomNumbers.nextInt(1, 10);
    }

    public static void main(String[] args) {
        System.out.println("Enter the product of two positive numbers. Enter 0 to exit.");
        quiz();
    }

}
