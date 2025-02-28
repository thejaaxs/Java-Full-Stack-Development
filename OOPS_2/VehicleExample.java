// Vehicle System Management

package OOPS_2;

class Vehicle3{
    void start(){
        System.out.println("Vehicle is Starting !");
    }
}
class Car3 extends Vehicle3{
    void drive(){
        System.out.println("Car is Driving !");
    }
}
class ElectricCar3 extends Car3{
    void chargeBattery(){
        System.out.println("Battery is Charging !");
    }
}
public class VehicleExample {
    public static void main(String[] args) {
        ElectricCar3 tesla = new ElectricCar3();
        tesla.start();
        tesla.drive();
        tesla.chargeBattery();
    }
}
