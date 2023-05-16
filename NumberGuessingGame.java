import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minNumber = 1;
        int maxNumber = 100;
        int maxAttempts = 10;
        int totalRounds = 3;
        int round = 1;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (round <= totalRounds) {
            System.out.println("\n--- Round " + round + " ---");
            int targetNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
            int attempts = 0;

            System.out.println("Guess the number between " + minNumber + " and " + maxNumber + ".");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                scanner.nextLine(); // Consume the remaining newline character

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    int points = maxAttempts - attempts;
                    score += points;
                    System.out.println("Points earned: " + points);
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Wrong guess! The number is higher.");
                } else {
                    System.out.println("Wrong guess! The number is lower.");
                }

                attempts++;
                if (attempts == maxAttempts) {
                    System.out.println("Maximum attempts reached. The correct number was: " + targetNumber);
                }
            }

            round++;
        }

        System.out.println("\n--- Game Over ---");
        System.out.println("Total Score: " + score);
        scanner.close();
    }
}
