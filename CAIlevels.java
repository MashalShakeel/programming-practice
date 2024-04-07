/*(Computer-Assisted Instruction: Difficulty Levels) Exercises 6.35–6.37 developed a computer-assisted instruction
program to help teach an elementary school student multiplication. Modify the program to allow the user to enter a
difficulty level. At a difficulty level of 1, the program should use only single-digit numbers in the problems;
at a difficulty level of 2, numbers as large as two digits, and so on.*/

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIlevels {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void quizLevelOne() {
        int correctAnswers = 0;
        int numQuestions = 0;

        while (numQuestions < 10) {
            int num1 = generateRandomNumberOneDigit();
            int num2 = generateRandomNumberOneDigit();
            int answer;
            int correctAnswer = num1 * num2;

            System.out.printf("How much is %d times %d?\n", num1, num2);
            answer = input.nextInt();

            while (answer != correctAnswer) {
                numQuestions++;
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

            int correctRandomCase = rand();
            correctAnswers++;
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
            numQuestions++;
        }

        System.out.println();
        double percentageCorrect = (double) correctAnswers / 10 * 100;
        System.out.println("Scored Percentage: " + percentageCorrect + "%");

        if (percentageCorrect < 75) {
            System.out.println("Please ask your teacher for extra help.");
        } else {
            System.out.println("Congratulations, you are ready to go to the next level!");
            System.out.println();
            System.out.println("Difficulty Level: 2");
            quizLevelTwo();
        }
    }

    public static void quizLevelTwo() {
        int correctAnswers = 0;
        int numQuestions = 0;

        while (numQuestions < 10) {
            int num1 = generateRandomNumberTwoDigit();
            int num2 = generateRandomNumberTwoDigit();
            int answer;
            int correctAnswer = num1 * num2;

            System.out.printf("How much is %d times %d?\n", num1, num2);
            answer = input.nextInt();

            while (answer != correctAnswer) {
                numQuestions++;
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

            int correctRandomCase = rand();
            correctAnswers++;
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
            numQuestions++;
        }

        System.out.println();
        double percentageCorrect = (double) correctAnswers / 10 * 100;
        System.out.println("Scored Percentage: " + percentageCorrect + "%");

        if (percentageCorrect < 75) {
            System.out.println("Please ask your teacher for extra help, or try level 1.");
        } else {
            System.out.println("Congratulations, you have cleared the highest level!");
        }
    }

    public static int rand() {
        return randomNumbers.nextInt(4) + 1;
    }

    public static int generateRandomNumberOneDigit() {
        // generate one-digit random numbers (1-9)
        return 1 + randomNumbers.nextInt(9);
    }

    public static int generateRandomNumberTwoDigit() {
        // generate two-digit random numbers (10-99)
        return randomNumbers.nextInt(90) + 10;
    }

    public static void main(String[] args) {
        boolean playAgain = true;
        while (playAgain) {
            System.out.println("Enter the product of two positive numbers.");
            System.out.println("Difficulty level 1: Product of one digit numbers");
            System.out.println("Difficulty level 2: Product of two digit numbers");
            int level;

            do {
                System.out.print("Select a difficulty level (1 or 2): ");
                while (!input.hasNextInt()) {
                    System.out.println("Invalid input. Please enter 1 or 2.");
                    input.next();
                }
                level = input.nextInt();

                if (level != 1 && level != 2) {
                    System.out.println("Invalid input. Please enter 1 or 2.");
                }
            } while (level != 1 && level != 2);

            switch (level) {
                case 1:
                    System.out.println("You have selected level 1.");
                    quizLevelOne();
                    break;
                case 2:
                    System.out.println("You have selected level 2.");
                    quizLevelTwo();
                    break;
            }

            System.out.print("Would you like to play again? (Y/N): ");
            String choice = input.next();
            // user can input "Y" in both upper and lower case
            playAgain = choice.equalsIgnoreCase("Y");
        }
    }
}
