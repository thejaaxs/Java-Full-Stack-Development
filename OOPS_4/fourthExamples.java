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
    }
    
}
public class fourthExamples{
    public static void main(String[] args){
        
    }
}