// Shape Drawing Using Method Overriding 

package OOPS_2;

class Shape {
    void draw(){
        System.out.println("Drawing a Shape !");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a Circle !");
    }
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("Drawing a Rectangle !");
    }
}
public class ShapeExample {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.draw();
        Shape circle = new Circle();
        circle.draw();
    }
}
