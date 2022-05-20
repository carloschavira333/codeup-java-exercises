import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {
        System.out.println(highLow(9));
    }

    public static int highLow(int input) {
//    println "Guess my number"
        System.out.println("Guess my number");
//    dec / init Scanner
        Scanner scanner = new Scanner(System.in);
//    print Enter a number between 1 - 100
        System.out.print("To Play: Enter a number between 1 - 100: ");
//    capture input dec/init with scanner.nextInt
        int userGuess = scanner.nextInt();
        // create a new Random
        Random rand = new Random();
        // Create a random number generator between 1 - 100
        int gameGuess = rand.nextInt(100);
        System.out.println(gameGuess);

        if (userGuess > gameGuess) {
//    If userGuess is less than gameGuess sout "HIGHER"
            System.out.println("HIGHER");
            System.exit(0);
        }
        if (userGuess < gameGuess) {
//    If userGuess is more than gameGuess sout "LOWER"
            System.out.println("LOWER");
            System.exit(0);
        } else {
//    else sout "GOOD GUESS"
            System.out.println("GOOD GUESS");
            System.exit(0);
        }
        return highLow(input);
    }

    // QUESTION 5
//Welcome to the world of game development!
//You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//The specs for the game are:
//
//Game picks a random number between 1 and 100.
//Prompts user to guess the number.
//All user inputs are validated.
//If user's guess is less than the number, it outputs "HIGHER".
//If user's guess is more than the number, it outputs "LOWER".
//If a user guesses the number, the game should declare "GOOD GUESS!"



}
