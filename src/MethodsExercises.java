import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(5, 5));
        System.out.println(subtraction(1, 1));
        System.out.println(multiplication(1, 1));
        System.out.println(division(1, 1));
        System.out.println(getInteger(1, 9));
        System.out.println(factorial(4));
        System.out.println(dice());
    }

    // Basic Arithmetic
    //Addition (a + b)
    public static int addition(int a, int b) {
        return a + b;
    }

    //Subtraction (a - b)
    public static int subtraction(int a, int b) {
        return a - b;
    }

    //Multiplication (a * b)
    public static int multiplication(int a, int b) {
        return a * b;
    }

    //Division (a / b)
    public static int division(int a, int b) {
        return a / b;
    }

    //    Create a method that validates that user input (name it: validateUserInput) is in a certain range (range indicates we need a min and a max)
    //    The method signature should look like this:
    //    public static int getInteger(int min, int max);
    //    and is used like this:
    //            System.out.print("Enter a number between 1 and 10: ");
    //    int userInput = getInteger(1, 10);
    //    If the input is invalid, prompt the user again.

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        int minNum = 1;
        int maxNum = 10;
        if (userInput >= minNum && userInput <= maxNum) {
            System.out.println("success");
            return userInput;
        } else {
            System.out.print("Please enter a number: ");
            return getInteger(min, max);
        }
    }

    // Calculate the factorial of a number.
    //
    //xPrompt the user to enter an integer from 1 to 10.
    //xDisplay the factorial of the number entered by the user.
    //xUse a for loop to calculate the factorial.
    //x Use the long type to store the factorial.
    //xA factorial is a number multiplied by each of the numbers before it.
    //xFactorials are denoted by the exclamation point (n!). Ex:
    //xAsk if the user wants to continue.
    //Assume that the user will enter an integer, but verify it’s between 1 and 10.
    //xContinue only if the user agrees to.

    public static long factorial(long input) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int oneToTen = scanner.nextInt();
        System.out.print("Would you like to continue? ");
        String yesOrNo = scanner.next();
        if (oneToTen >= 1 && oneToTen <= 10 && yesOrNo.equals("Y")){
            long factorial = 1;
            for (int i = 1; i <= input; i++) {
                    factorial = factorial * i;

            }
            return factorial;
        } else if (oneToTen >= 1 && oneToTen <= 10 && yesOrNo.equals("N")){
            System.out.println("Have a nice day.");
            System.exit(0);


        } else if (oneToTen < 1 || oneToTen > 10 && yesOrNo.equals("N")) {
            System.out.println("Please enter a valid number.");
            System.exit(0);
        }
        return factorial(input);
        }

//Create an application that simulates dice rolling.
//xAsk the user to enter the number of sides for a pair of dice.
//Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//Use static methods to implement the method(s) that generate the random numbers.
//Use the .random method of the java.lang.Math class to generate random numbers.

public static int dice(){

    //xAsk the user to enter the number of sides for a pair of dice.
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number of side for a pair of dice");
    int diceChoice = scanner.nextInt();

    //Prompt the user to roll the dice.
    System.out.println("Roll the dice.");

    System.out.println("rolling dice.");
    System.out.println("..........");
    System.out.println("......");
    System.out.println("..........");
    System.out.println("......");
    System.out.println("..........");
    System.out.println("......");
    System.out.println("..........");
    System.out.println("......");

    Random rand = new Random();
    // obtain random number between 0 - diceChoice
    int d1 = rand.nextInt(diceChoice);
    int d2 = rand.nextInt(diceChoice);

//    String diceRolls = System.out.println("The results for your " + diceChoice + " sided dice are: \n Dice one rolled a: " + d1 + "\n Dice two rolled a: " + d2);

    String diceRolls = "The results for your " + diceChoice + " sided dice are: \n Dice one rolled a: " + d1 + "\n Dice two rolled a: " + d2;
    System.out.println(diceRolls);

    System.out.print("Would you like to play again? (Y/N): ");
    String readyChoice = scanner.next();
    boolean confirmation = readyChoice.equals("Y");


    System.out.println("confirmation : " + confirmation);
    if (!confirmation)  {
        System.out.println("Have a nice day");
        System.exit(0);
    }
    return dice();

}






}




