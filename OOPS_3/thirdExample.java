// Shape Example Using OOPS

abstract class Shape1{
   abstract void draw();
}
class Circles1 extends Shape1{
    @Override
    void draw(){
        System.out.println("Circle is being Drawn !");
    }
}
class Rectangles extends Shape1{
    @Override
    void draw(){
        System.out.println("Rectangle is being Drawn !");
    }
}
public class thirdExample {
    public static void main(String[] args) {
        Shape1 shape[] = {new Circles1(),new Rectangles1()};
        for(Shape1 s : shape){
            s.draw();
        }
    }
}
