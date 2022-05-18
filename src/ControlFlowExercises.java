import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        Loop Basics
//        While
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//        5 6 7 8 9 10 11 12 13 14 15
//        int i = 5;
//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//      ****************************************************************
//Do While
//Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        // Count by 2: 2, 4, 6, 8, 10 ...
//    int i = 0;
//    do {
//        System.out.println(i);
////        i = i + 2; // or use short hand
//        i += 2;
//    } while (i <= 100);
//Alter your loop to count backwards by 5's from 100 to -10.
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//2
//4
//16
//256
//65536
//        int i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i >=2 && i <= 1000000);
//      ****************************************************************
//        For loop
//        Refactor the previous two exercises to use a for loop instead.

// Refactor 1
//    int i;
//    for (i = 0; i <= 100; i++) {
//        System.out.println(i);
//    }

// Refactor 2
//    int j;
//    for (j = 100; j >= -10; j -=5) {
//        System.out.println(j);
//    }

// Refactor 3
//    int i;
//    for (i = 2; i >= 2 && i <= 1000000; i *= i) {
//        System.out.println(i);
//    }
//      ****************************************************************

//Fizzbuzz
//One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
// Write a program that prints the numbers from 1 to 100.
//    For multiples of three: print “Fizz” instead of the number.
//    For the multiples of five: print “Buzz”.
//    For numbers which are multiples of both three and five: print “FizzBuzz”.

//    int n = 100;
//    int i;
//
//    for (i = 1; i <= n; i++) {
//        if ((i % 3 == 0) && (i % 5 == 0)) {System.out.println("FizzBuzz");}
//        else if (i % 3 == 0) {System.out.println("Fizz");}
//        else if (i % 5 == 0) {System.out.println("Buzz");}
//        else {System.out.println(i);}
//    }

//      ****************************************************************

//Display a table of powers.
//
// Prompt the user to enter an integer.
// Display a table of squares and cubes from 1 to the value entered.
// Ask if the user wants to continue.
// Assume that the user will enter valid data.
// Only continue if the user agrees to.
//
// Example Output
//What number would you like to go up to? 5
//
//Here is your table!

//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to Lets Make a table!");
//        System.out.println("Would you like to play? (Type: yes or no): ");
//        String userResponse = scanner.next();
//        boolean confirmation = userResponse.equals("yes");
//        boolean confirmation2 = userResponse.equals("y");
//        boolean confirmation3 = userResponse.equals("Yes");
//
//        if(confirmation || confirmation2 || confirmation3) {
//            System.out.println("Please enter your number: ");
//            int userResponseNumber = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("number  |  squared | cubed");
//            System.out.println("------  |  ------- | -----");
//            int j;
//            for (j = 0; j <= userResponseNumber; j++) {
//                System.out.println(j + "       |" + j * j + "         |" + j * j * j);
//            }
//        } else {System.out.println("Cya next time!");}
//      ****************************************************************
//Convert given number grades into letter grades.
//   Prompt the user for a numerical grade from 0 to 100.
//   Display the corresponding letter grade.
//   Prompt the user to continue.
//   Assume that the user will enter valid integers for the grades.
//   The application should only continue if the user agrees to.
//Grade Ranges:
//
//A : 100 - 88
//B : 87 - 80
//C : 79 - 67
//D : 66 - 60
//F : 59 - 0

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Welcome to Lets Make a table!");
//        System.out.println("Would you like to know a grade? (Type: yes or no): ");
//        String userResponse = scanner.next();
//        boolean confirmation = userResponse.equals("yes");
//        boolean confirmation2 = userResponse.equals("y");
//        boolean confirmation3 = userResponse.equals("Yes");
//
//        if(confirmation || confirmation2 || confirmation3) {
//            System.out.println("Please enter numeric grade value: ");
//            int userResponseNumber = scanner.nextInt();
//            if (userResponseNumber <= 59) {
//                System.out.println("The letter grade is F");
//            }
//            if (userResponseNumber >= 60 && userResponseNumber <= 66) {
//                System.out.println("The letter grade is D");
//            }
//            if (userResponseNumber >= 67 && userResponseNumber <= 79) {
//                System.out.println("The letter grade is C");
//            }
//            if (userResponseNumber >= 80 && userResponseNumber <= 87) {
//                System.out.println("The letter grade is B");
//            }
//            if (userResponseNumber >= 88) {
//                System.out.println("The letter grade is A");
//            }
//        }else {
//            System.out.println("Cya next time!");
//        }
        //      ****************************************************************

    }
}
