// Shapes Polymorphism !

class Shapes {
    void draw(){
        System.out.println("Drawing a Shape !");
    }
}
class Rectangles extends Shapes{
    @Override
    void draw(){
        System.out.println("Rectangle is being drawn !");
    }
}
class Circles extends Shapes{
    @Override
    void draw(){
        System.out.println("Circle is being drawn !");
    }
}
public class ShapesPolymorphism {
    public static void main(String[] args) {
        // Polymorphism 
        Shapes shape ; 
        shape = new Rectangles();
        shape.draw(); // for rectangle !
        shape = new Circles();
        shape.draw(); // for circle !
    }
}
