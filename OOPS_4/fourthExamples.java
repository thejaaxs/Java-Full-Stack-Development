// Car Example Using OOPS

class Cars2{
    private String brand;
    private int speed;
    private int fuelLevel;

    public Cars2(String brand,int speed,int fuelLevel){
        this.brand = brand;
        this.speed = 0;
        this.fuelLevel = fuelLevel;
    }   
    public void accelerate(){
        if(fuelLevel>0){
            speed+=10;
            fuelLevel-=5;
            System.out.println("Accelerated . Speed: "+speed+" Km/Hr, Fuel Level: "+fuelLevel);
        }
        else System.out.println("Not enough fuel to Accelerate !");
    }
    public void brake(){
        if(speed>=5){
            speed -=5;
        }
        else speed = 0 ;
        System.out.println("Braked ! . Speed: "+speed+" Km/Hr");
    }
    public void refuel(int fuel){
        if(fuel>0){
            fuelLevel += fuel;
            System.out.println("Refilled . Fuel Level : "+fuelLevel);
        }
        else System.out.println("Invalid Fuel Amount !");
    }
    public int getSpeed(){
        return speed;
    }
    public int getFuelLevel(){
        return fuelLevel;
    }
    public String getBrand(){
        return brand;
    }
}
public class fourthExamples{
    public static void main(String[] args){
        Cars2 car = new Cars2("Toyota",350,50);
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.brake();
        car.brake();
        System.out.println("Fuel Level : "+car.getFuelLevel());
        car.refuel(10);
    }
}