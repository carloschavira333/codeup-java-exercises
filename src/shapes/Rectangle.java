package shapes;

//Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
//Why does the code fail to compile if you leave off the getPerimeter method in Rectangle? ANS: Because we instantiated a new object from the Rectangle class. By removing the getPerimeter method java can not compile without it.

    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public void setLength(double length) {
    this.length = length;
    }
    @Override
    public void setWidth(double width) {
    this.width = width;
    }
}