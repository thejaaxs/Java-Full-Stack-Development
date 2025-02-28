// Shape Drawing Using Method Overriding 

package OOPS_2;

class Shape2 {
    void draw(){
        System.out.println("Drawing a Shape !");
    }
}
class Circle2 extends Shape2{
    void draw(){
        System.out.println("Drawing a Circle !");
    }
}
class Rectangle2 extends Shape2{
    public void draw(){
        System.out.println("Drawing a Rectangle !");
    }
}
public class ShapeExample {
    public static void main(String[] args) {
        Shape2 rectangle = new Rectangle2();
        rectangle.draw();
        Shape2 circle = new Circle2();
        circle.draw();
    }
}
