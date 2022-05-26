package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        //  declare a variable of the type Measurable named myShape.
        Measurable myShape;

        //Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and perimeter.

        // Create a new instance of Rectangle
        myShape = new Rectangle(5,5);
        // Assign square to myShape to display the area and perimeter
        double newRectangleArea = myShape.getArea();
        System.out.println("newRectangleArea: " + newRectangleArea);
        double newRectanglePerimeter = myShape.getPerimeter();
        System.out.println("newRectanglePerimeter: " + newRectanglePerimeter);

        // Create a new instance of Square
        myShape = new Square(5);
        // Assign square to myShape to display the area and perimeter
        double newSquareArea = myShape.getArea();
        System.out.println("newSquareArea: " + newSquareArea);
        double newSquarePerimeter = myShape.getPerimeter();
        System.out.println("newSquarePerimeter: " + newSquarePerimeter);

        // What happens if you try to call
        // the getLength or getWidth methods
        // of the myShape variable? the methods do not show up as available methods. Why? Because the Rectangle class does not have those methods available.

        // double newRectanglePerimeterTest = myShape.getLength(); // getLength method is not available in the Rectangle class.
    }
}
