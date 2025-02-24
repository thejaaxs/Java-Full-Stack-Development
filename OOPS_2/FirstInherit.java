package OOPS_2;

class Shape{
    void draw(){
        System.out.println("The Shape is Drawn !");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Circle Shape is Drawn !");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Rectangle Shape is Drawn !");
    }
}
public class FirstInherit {
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.draw();

        Rectangle rect = new Rectangle();
        rect.draw();
    }
}
