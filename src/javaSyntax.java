import java.util.Scanner;

public class javaSyntax {
    public static void main(String[] args) {
        // 1
//        int myFavoriteNumber = 3;
//        System.out.println(myFavoriteNumber);
        // 2
//        String myString = "carlos";
//        System.out.println(myString);
        // 3
//        myString += " chavira";  // concats chavira to carlos
//        System.out.println(myString);
        // 4 Change your code to assin the value 3.1459 to myString
//        myString += 3.14159;
//        System.out.println(myString); // concats 3.14159 to carlos chavira
        // 5
//        long myNumber;
//        System.out.println(myNumber); // error: variable myNumber might not have been initialized.
        // 6
//        long myNumber = 3.14;
//        System.out.println(myNumber); // incompatible types: possible lossy conversion from double to long

//        System.out.println(myNumber);
        // 7 Change your code to assign the value 123L (Note the 'L' at the end) to myNumber
//        long myNumber = 123l;
//        System.out.println(myNumber);
        // 8 Change your code to assign the value 123 to myNumber.
//        long myNumber = 123;
//        System.out.println(myNumber);
        // 9 Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        float myNumber = 3.14; // incompatible types: possible lossy conversion from double to float
//        System.out.println(myNumber);
//        Copy and paste the following code blocks one at a time and execute them
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 7;
//        System.out.println(++x);
//        System.out.println(x);


//      11 Try to create a variable named class. What happens?
//        String class = "my class"; //not a statement
//        System.out.println(class);

//      12  Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        Copy and paste the code above and then run it. Does the result match with your expectation?
        // error: Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        //	at javaSyntax.main(javaSyntax.java:50)

//      How is the above example different from the code block below?
//        int three = (int) "three"; // error: java.lang.String cannot be converted to int
//        What are the two different types of errors we are observing?
        // a cast error and a conversion

//        Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
//        x = x + 5;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        y *= x;
//        System.out.println(y);
//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//        x /= y;
//        y -= x;
//        System.out.println(x);
//        System.out.println(y);

//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity? The number increased by one in the negative direction ( - 128)
        byte capicityTest = 127;
        capicityTest++;
        System.out.println(capicityTest);

//
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.





                }
}
