// Method Overloading in Java !

// package OOPS_3; 

class MathOperations{
    int add(int a , int b){
        return a + b ;
    }
    double add(double a , double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class MethodOverloading{
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println("Addition of 2 Integers : "+obj.add(10,20));
        System.out.println("Addtion using Double : "+obj.add(2.5,2.5));
        System.out.println("Addition of 3 Integers : "+obj.add(10,20,30));
    }
}