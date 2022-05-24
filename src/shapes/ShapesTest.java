package shapes;

public class ShapesTest {
//    Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method,
    public static void main(String[] args) {
        //create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
        Rectangle box1 = new Rectangle(5, 4);
        //verify that the getPerimeter and getArea methods return 18 and 20, respectively.
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        //create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
        Rectangle box2 = new Square(5);
        //verify that the getPerimeter and getArea methods return 20 and 25, respectively.
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

        //In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
        //perimeter = 4 x side
        //area = side ^ 2

        //Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?

    }

}