// Vehicle System Management

package OOPS_2;

class Vehicle{
    void start(){
        System.out.println("Vehicle is Starting !");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Car is Driving !");
    }
}
class ElectricCar extends Car{
    void chargeBattery(){
        System.out.println("Battery is Charging !");
    }
}
public class VehicleExample {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.start();
        tesla.drive();
        tesla.chargeBattery();
    }
}
