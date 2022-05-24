package shapes;

//Shapes
//Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//
//Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
//
//Copied to clipboard
//perimeter = 2 x length + 2 x width
//area = length x width


public class Rectangle {
    // It should have protected properties(fields) for L and W
    protected double length;
    protected double width;
    // Define a constructor that accepts two number for L and W
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    // Create two methods: getArea and getPerimeter that return values as follows:
    // perimeter = 2 x length + 2 x width
    // area = length x width

    // method 1: getArea
    public double getArea(){
        return length * length;
    }
    // method 2: getPerimeter
    public double getPerimeter(){
        return 2 * (length + width);
    }

}
