import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        // Write some Java code that uses the variable pi to output the following:
        //The value of pi is approximately 3.14.
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately ", pi);
//        System.out.format("The value of pi is approximately %f%n", pi); // 3.141590
//        System.out.format("The value of pi is approximately %.3f%n", pi); // 3.142

        // Explore the Scanner Class
        // Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        Scanner scanner = new Scanner(System.in);

        // Prompt user
//        System.out.print("Enter a number: ");
        // Store value in int variable use nextInt method
//        int userNumber = scanner.nextInt();

//        System.out.println("User input = " + userNumber);
        //What happens if you input something that is not an integer?
        // We get an error: Exception in thread "main" java.util.InputMismatchException
        //	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        //	at java.base/java.util.Scanner.next(Scanner.java:1594)
        //	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        //	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        //	at ConsoleExercises.main(ConsoleExercises.java:21)

        // Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

//        System.out.println("You will be prompted three times, each time you are to enter a word");
//        System.out.print("Enter word 1: ");
//        System.out.print("Enter word 2: ");
//        System.out.print("Enter word 3: ");
//        // Store value in int variable use nextInt method
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        // Print
//        System.out.println("Your first word is: " + word1);
//        System.out.println("Your second word is: " + word2);
//        System.out.println("Your third word is: " + word3);

        //
        //What happens if you enter less than 3 words? The program runs until third word is entered
        //What happens if you enter more than 3 words? The program ends at three words entered

        // Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//        System.out.print("Please enter a sentence: ");
//        String userWords = scanner.next();
//        System.out.println("Your input is: " + userWords);
        //do you capture all the words? No it only captured the first word

//        Rewrite the above example using the nextLine method.
//        System.out.print("Please enter a sentence: ");
//        String userWords = scanner.nextLine();
//        System.out.println("Your input is: " + userWords);

//        Calculate the perimeter and area of Codeup's classrooms.
////        Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//        System.out.print("Enter the width of your room: ");
//        System.out.print("Enter the length of your room: ");
//
////        Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
//        String length = scanner.nextLine();
//        String width = scanner.nextLine();
//
////        Use the Integer class to parse the string of characters into an integer.
//        int numberLength = Integer.parseInt( length );  // converts a String into an int value
//        int numberWidth = Integer.parseInt( width );  // converts a String into an int value
//        System.out.println("The perimeter of your room is: " + numberLength * numberWidth);
//
//        Assume that the rooms are perfect rectangles.
//                Assume that the user will enter valid numeric data for length and width.

//        Display the area and perimeter of that classroom.
//       area of a rectangle is equal to the length times the width,
//       perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

        // Area: length times width.
        System.out.print("Enter the width of your room: ");
        String length = scanner.nextLine();
        int numberLength = Integer.parseInt( length );  // converts a String into an int value

        System.out.print("Enter the length of your room: ");
        String width = scanner.nextLine();
        int numberWidth = Integer.parseInt( width );  // converts a String into an int value

        // Perimeter: 2 * length + 2 * width
        System.out.print("Enter the width of your room: ");
        String widthPerim = scanner.nextLine();
        int numberWidthPerim = Integer.parseInt( widthPerim );  // converts a String into an int value

        System.out.print("Enter the length of your room: ");
        String lengthPerim = scanner.nextLine();
        int numberLengthPerim = Integer.parseInt( lengthPerim );  // converts a String into an int value

        System.out.println("The area of your room is: " + numberLength * numberWidth);
        System.out.println("The perimeter of your room is: " + numberWidthPerim * 2 + numberLengthPerim * 2);

    }
}
