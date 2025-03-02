// Calculator Example !

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class firstPolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition of 2 Integer : "+calc.add(10,20));
        System.out.println("Addition of 3 Integers : "+calc.add(10,20,30));
        System.out.println("Addition of 3 Doubles : "+calc.add(2.5,2.5));
    }
}
