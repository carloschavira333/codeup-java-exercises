package shapes;

//Change your existing Square class to extend Quadrilateral.
public class Square extends Quadrilateral{
    //Because the length of all sides of a square are the same, the methods for setting the length and the width should set both protected properties.
    protected double side;

    // Create constructor matching super
    public Square(double side) {
        super(side, side);
    }
    @Override
    public double getArea(){
        return length * width;
    }
    @Override
    public double getPerimeter(){
        return length + length + width + width;
    }
    @Override
    public void setLength(double side) {
        this.length = side;
    }
    @Override
    public void setWidth(double side) {
        this.width = side;
    }
}
