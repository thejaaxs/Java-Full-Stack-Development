// Program of Encapsulation Using OOPS 

package OOPS;

class Cars {
    private String brand , model ;
    private double price ;
    
    public Cars(String brand , String model , double price){
        this.brand = brand ;
        this.model = model ; 
        this.price = price ;
    }
    public void displayDetails(){
        System.out.println("The Name : "+brand+"\nThe Model : "+model+"\nThe Price : "+price);
    }
}
public class Car {
    public static void main(String[] args) {
        Cars c1 = new Cars("X7","B M W",9700000.123);
        c1.displayDetails();
    }
}
