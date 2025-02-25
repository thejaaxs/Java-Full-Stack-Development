// Super Keyword in the Inheritance

package OOPS_2;

class Animal {
    Animal(){
        System.out.println("Animal Constructor Called !");
    }
}
class Dog extends Animal {
    Dog(){
        super();
        System.out.println("Dog Constructor Called !");
    }
    void bark(){
        System.out.println("The Dog barks !");
    }
}
public class SuperInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}
