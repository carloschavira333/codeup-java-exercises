package shapes;

import java.util.Scanner;

public class Circle {
    private double radius;

    // constructor
    public Circle(double radius) {
    this.radius = radius;
    }

    public double getArea(){
       return radius * radius * Math.PI;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    // TEST BELOW
    public static void main(String[] args) {
        Circle c1 = new Circle(4.5);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
    }
}
