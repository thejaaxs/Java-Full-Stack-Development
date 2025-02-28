// Super Keyword in the Inheritance

package OOPS_2;

class Animal3 {
    Animal3(){
        System.out.println("Animal Constructor Called !");
    }
}
class Dog3 extends Animal3 {
    Dog3(){
        super();
        System.out.println("Dog Constructor Called !");
    }
    void bark(){
        System.out.println("The Dog barks !");
    }
}
public class SuperInheritance {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.bark();
    }
}
