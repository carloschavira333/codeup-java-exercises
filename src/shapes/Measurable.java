package shapes;

//An interface is a special case of an abstract class. An interface is an abstract class that follows these rules:
//        all methods are public and abstract.
//        all properties are public static and final.
//        no static methods.
public interface Measurable {
    double getPerimeter();
    double getArea();
}
