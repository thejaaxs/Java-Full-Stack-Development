// Shapes Polymorphism !

class Shapes {
    void draw(){
        System.out.println("Drawing a Shape !");
    }
}
class Rectangle extends Shapes{
    @Override
    void draw(){
        System.out.println("Rectangle is being drawn !");
    }
}
class Circle extends Shapes{
    @Override
    void draw(){
        System.out.println("Circle is being drawn !");
    }
}
public class ShapesPolymorphism {
    public static void main(String[] args) {
        // Polymorphism 
        Shapes shape ; 
        shape = new Rectangle();
        shape.draw(); // for rectangle !
        shape = new Circle();
        shape.draw(); // for circle !
    }
}
