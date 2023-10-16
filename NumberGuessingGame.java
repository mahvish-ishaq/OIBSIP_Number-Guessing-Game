import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int min = 1;
        int max = 100;
        int secretNum = r.nextInt(max - min + 1) + min;

        int attempts = 0;
        boolean guessed = false;

        int maxAttempts = 5; 
        int score = 0; 

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I havve picked a number between " + min + " and " + max + ". You have to guess it!");

        while (!guessed && attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
            int userGuess = s.nextInt();
            attempts++;

            if (userGuess == secretNum) {
                guessed = true;
            } else if (userGuess < secretNum) {
                System.out.println("You guessed a lower number ! Try again.");
            } else {
                System.out.println("You guessed a higher number ! Try again.");
            }
        }

        if (guessed) {
            System.out.println("Congratulations! You've guessed the Correct number in " + attempts + " attempts.");
            score -= (attempts - 1) * 10; 
        } else {
            System.out.println("Sorry! You've reached the maximum number of attempts.Play Again to Guess the correct number");
        }

        System.out.println("Your score is: " +score);
    }
}