import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int userGuess;

        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();

            if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } 
            else if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            } 
            else {
                System.out.println("Congratulations! You guessed the number.");
            }

        } while (userGuess != secretNumber);

        sc.close();
    }
}