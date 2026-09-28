import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int targetNumber = rand.nextInt(10) + 1;
        int guess;
        do {
            System.out.print("Guess the whole number between 1 and 10: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a valid number between one to 10.");
                scanner.next();
            }
            guess = scanner.nextInt();
            if (guess < 1 || guess > 10) {
                System.out.print("Your guess is out of bounds. Try again with a whole number between 1 and 10.");
            }
        } while (guess < 1 || guess > 10);
        System.out.print("The computer's random number was: " + targetNumber);
        if (guess > targetNumber) {
            System.out.print(". Your guess was high!");
        } else if (guess < targetNumber) {
            System.out.print(". Your guess was low!");
        } else {
            System.out.print(". Your guess was spot-on!");
        }
    }
}
