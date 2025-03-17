// Vehicle Example Using OOPS

interface Vehicle2 {
    void start();

    void stop();
}

class Car2 implements Vehicle2 {
    public void start() {
        System.out.println("Car is Starting !");
    }

    public void stop() {
        System.out.println("Car is Stopping !");
    }
}

class Bike2 implements Vehicle2 {
    public void start() {
        System.out.println("Bike is Starting !");
    }

    public void stop() {
        System.out.println("Bike is Stopping !");
    }
}

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle2 myCar = new Car2();
        myCar.start();
        myCar.stop();
        System.out.println("------------");
        Vehicle2 myBike = new Bike2();
        myBike.start();
        myBike.stop();
    }
}
