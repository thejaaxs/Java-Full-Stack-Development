// Program to demonstrate the Abstraction Using OOPS 

package OOPS ;

abstract class Shape {
    abstract void calculateArea();
}
class Circle extends Shape{
    double radius ;

    public Circle(double radius){
        this.radius = radius ;
    }

    public void calculateArea(){
        System.out.println("Area is : "+(Math.PI * radius * radius));
    }
}
public class Abstract {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        c1.calculateArea();
    }
}