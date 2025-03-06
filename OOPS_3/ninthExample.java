// Vehicle Simulation Using OOPS

abstract class Vehicle{
    abstract void move();
}
class Car extends Vehicle{
    @Override
    public void move(){
        System.out.println("Car is moving on road !");
    }
}
class Airplane extends Vehicle{
    @Override
    void move(){
        System.out.println("Airplane is flying in the sky !");
    }
}
public class ninthExample {
    public static void main(String[] args) {
        Vehicle vehicles[] = {new Car(),new Airplane()};
        for(Vehicle v : vehicles){
            v.move();
        }
    }
}
