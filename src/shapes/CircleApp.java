package shapes;

import util.Input;

public class CircleApp {
//Inside of shapes, create a class named CircleApp
// that prompts the user for the radius of the circle
// using your Input class,
// creates a Circle object,
// and displays the circumference and area.
// (Note that you will need to import your Input class.)

//The formulas for the circumference and area:
//circumference = 2 x pi x radius
//area = pi x (radius ^ 2)
//For the value of pi, use the PI constant of the Math class.

    public static void main(String[] args) {
        // that prompts the user for the radius of the circle
        System.out.print("To get the Area and Circumference \n of a circle, ");

        // using your Input class,
            // constructor (for reference)
                // public Input() {
                //        scanner = new Scanner(System.in);
                //    }
        Input storedUserInput = new Input();

        // interacting with user input, previous example:
                //System.out.println("Talk to Bob");
                //String input = scanner.nextLine();
            // For this example we need a type of double (use getDouble method)
                    //public double getDouble(){
                    //    System.out.print("Enter a decimal number: ");
                    //    double userInput = scanner.nextInt();
                    //    return userInput;
                    //}

        // creates a Circle object, (look at the Circle constructor for reference the constructor input will takes a radius.
        // Example from CircleApp: Circle c1 = new Circle(4.5); instead of a hard coded double give it a dynamic double input)
        double argumentForCircle = storedUserInput.getDouble();
        Circle newRadius1 = new Circle(argumentForCircle);

        // displays the circumference and area
        System.out.println("Circumference: " + newRadius1.getCircumference());
        System.out.println("Area: " + newRadius1.getArea());



    }

}
