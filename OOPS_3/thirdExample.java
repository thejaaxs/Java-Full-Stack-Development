// Shape Example Using OOPS

abstract class Shapes{
   abstract void draw();
}
class Circle extends Shapes{
    @Override
    void draw(){
        System.out.println("Circle is being Drawn !");
    }
}
class Rectangle extends Shapes{
    @Override
    void draw(){
        System.out.println("Rectangle is being Drawn !");
    }
}
public class thirdExample {
    public static void main(String[] args) {
        Shapes shape[] = {new Circle(),new Rectangle()};
        for(Shapes s : shape){
            s.draw();
        }
    }
}
