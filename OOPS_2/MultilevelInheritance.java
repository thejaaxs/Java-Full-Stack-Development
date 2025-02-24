package OOPS_2;

class Vehicle{
    void start(){
        System.out.println("Vehicle is Starting !");
    }
}
class Car extends Vehicle{
    void accelerate(){
        System.out.println("Car is Accelerating !");
    }
}
class ElectricCar extends Car{
    void charging(){
        System.out.println("Battery is Charging !");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.start();
        tesla.charging() ;
        tesla.accelerate();
    }
}
