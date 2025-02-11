// Polymorphism Using the OOPS 

package OOPS;

class MathOperations{
    int add(int a , int b){
        return a+b ;
    }
    double add(double a , double b){
        return a+b;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        System.out.println("The Answer for int is : "+m.add(10,20));
        System.out.println("The Answer for double is : "+m.add(10.50,20.50));
    }
}
