// Program of Inheritance Using OOPS 

package OOPS;

class Vehicle {
    String type;
    int speed;

    public Vehicle(String type, int speed) {
        this.type = type;
        this.speed = speed;
    }
    public void show() {
        System.out.println("Type: " + type + "\nSpeed: " + speed);
    }
}

class Car1 extends Vehicle {
    String brand;

    public Car1(String type, int speed, String brand) {
        super(type, speed);
        this.brand = brand;
    }

    public void carShow() {
        show();
        System.out.println("Brand: " + brand);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car1 c1 = new Car1("Four Wheeler", 300, "BMW");
        c1.carShow();
    }
}
