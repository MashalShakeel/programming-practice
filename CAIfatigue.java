// It performs the same tasks as class CAI, but uses a variety of responses to encourage the student.
// It works to remove the element of student fatigue from the CAI environment.

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIfatigue {
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
            // possible responses to an incorrect answer
            int wrongRandomCase = rand();
            switch (wrongRandomCase) {
                case 1:
                    System.out.println("No. Please try again.");
                    break;
                case 2:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 3:
                    System.out.println("Don't give up!");
                    break;
                case 4:
                    System.out.println("No, keep trying!");
                    break;
            }
            System.out.printf("How much is %d times %d?\n", num1, num2);
            answer = input.nextInt();
        }

        if (answer == num1 * num2 ) {
            // possible responses to a correct answer
            int correctRandomCase = rand();
            switch (correctRandomCase) {
                case 1:
                    System.out.println("Very Good!");
                    break;
                case 2:
                    System.out.println("Excellent!");
                    break;
                case 3:
                    System.out.println("Nice work!");
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }
            // ask another question
            quiz();
        }
    }

    public static int rand() {
        return randomNumbers.nextInt(1, 5);
    }
    public static int generateRandomNumber() {
        // generate one-digit random numbers (1-9)
        return 1 + randomNumbers.nextInt(9);
    }

    public static void main(String[] args) {
        System.out.println("Enter the product of two positive numbers. Enter 0 to exit.");
        quiz();
    }
}


