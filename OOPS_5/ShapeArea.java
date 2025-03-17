// Shape Area Calculation Using Abstraction !

abstract class Shapes2 {
    abstract double calculateArea();
}

class Circle2 extends Shapes2 {
    double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle2 extends Shapes2 {
    double length, breadth;

    public Rectangle2(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Shapes2 rect = new Rectangle2(10, 20);
        System.out.println("Area of Rectangle : " + rect.calculateArea());
        Shapes2 circle = new Circle2(5);
        System.out.println("Area of Circle : " + circle.calculateArea());
    }
}
