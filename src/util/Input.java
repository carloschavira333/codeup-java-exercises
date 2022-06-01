package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    // constructor
    public Input() {
        scanner = new Scanner(System.in);
    }

    // method 1
    public String getString() {
        System.out.println("Enter a string: ");
        String userInput = scanner.next();
        return userInput;
    }

    // method 2
    // The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public boolean yesNo() {
        System.out.println("Please enter Yes: ");
        String userInput = scanner.next();
        if (userInput.equals("yes") || userInput.equals("y") || userInput.equals("Y")) {
            return true;
        } else {
            return false;
        }
    }

    //    The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.
    public int getInt(int min, int max) {
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("success");
            return userInput;
        } else {
            return getInt(min, max);
        }
    }

//    public int getInt(){
//        System.out.print("Enter a number: ");
//        int userInput = scanner.nextInt();
//        return userInput;
//    }

    //
    public int getInt() {
        System.out.print("Enter a number: ");
        String userInput = getString();
        // Check to see if the value returned from the method is actually an int
        try {Integer.valueOf(userInput);}
        // throw a NumberFormatException if the given input cannot be parsed as an int
        catch (NumberFormatException e) {System.out.println("Given input cannot be parsed as an int");}
        // convert the returned String into the desired datatype:
        return Integer.parseInt(userInput);
    }



    public double getDouble(double min, double max){
        System.out.print("Enter a decimal number between 1 and 10: ");
        double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            System.out.println("success");
            return userInput;
        } else {
            return getDouble(min, max);
        }
    }

//    public double getDouble(){
//        System.out.print("Enter a decimal number: ");
//        double userInput = scanner.nextDouble();
//        return userInput;
//    }

    public Double getDouble() {
        System.out.print("Enter a number: ");
        String userInput = getString();
        // Check to see if the value returned from the method is actually a double
        try {Double.valueOf(userInput);}
        // throw a NumberFormatException if the given input cannot be parsed as a double
        catch (NumberFormatException e) {System.out.println("Given input cannot be parsed as a double");}
        // convert the returned String into the desired datatype:
        return Double.valueOf(userInput);
    }

}