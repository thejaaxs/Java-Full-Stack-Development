// Shape Example Using OOPS

abstract class Shape{
   abstract void draw();
}
class Circles extends Shape{
    @Override
    void draw(){
        System.out.println("Circle is being Drawn !");
    }
}
class Rectangles extends Shape{
    @Override
    void draw(){
        System.out.println("Rectangle is being Drawn !");
    }
}
public class thirdExample {
    public static void main(String[] args) {
        Shape shape[] = {new Circles(),new Rectangles()};
        for(Shape s : shape){
            s.draw();
        }
    }
}
