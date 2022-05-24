//Create a class named Square, also inside of shapes, that extends Rectangle.
// Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.

package shapes;
//Create a class named Square, also inside of shapes, that extends Rectangle.
public class Square extends Rectangle{
    protected double side;
    // Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
    public Square(double side) {
    // Since Square is the sub-class and Rectangle is the super-class we can call the super keyword here to refer to Rectangle's variables and methods.
        // The Rectangle constructor is:
            // public Rectangle(double length, double width) {
            //        this.length = length;
            //        this.width = width;
            //    }
        super(side, side);
    }

    // method 1: getArea override
    @Override
    public double getArea(){
        return side * side;
    }
    // method 2: getPerimeter override
    @Override
    public double getPerimeter(){
        return 4 * side;
    }
}
