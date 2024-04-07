/* 6.37 (Computer-Assisted Instruction: Monitoring Student Performance) More sophisticated
computer-assisted instruction systems monitor the student’s performance over a period of time. The
decision to begin a new topic is often based on the student’s success with previous topics. Modify
the program of Exercise 6.36 to count the number of correct and incorrect responses typed by the
student. After the student types 10 answers, your program should calculate the percentage that are
correct. If the percentage is lower than 75%, display "Please ask your teacher for extra help.",
then reset the program so another student can try it. If the percentage is 75% or higher, display
"Congratulations, you are ready to go to the next level!", then reset the program so another
student can try it.*/

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIperformance {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void quiz() {
        int num1 = generateRandomNumber();
        int num2 = generateRandomNumber();
        int correctAnswers = 0;
        int numQuestions = 0;

        while (numQuestions < 10) {
            numQuestions++;
            askQuestion(num1, num2);
            int correctAnswer = num1 * num2;
            int answer = input.nextInt();

            if (answer == correctAnswer) {
                correctAnswers++;
            }
            num1 = generateRandomNumber();
            num2 = generateRandomNumber();
        }

        double percentageCorrect = (double) correctAnswers / numQuestions * 100;

        if (percentageCorrect < 75) {
            System.out.println("Please ask your teacher for extra help.");
        } else {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
    }

    public static void askQuestion(int num1, int num2) {
        int answer;
        int correctAnswer = num1 * num2;

        System.out.printf("How much is %d times %d?\n", num1, num2);
        answer = input.nextInt();

        // while loop terminates only if correct answer is input
        while (answer != correctAnswer) {
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
        System.out.println("Enter the product of two positive numbers.");
        quiz();
    }
}
