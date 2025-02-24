// Method Overriding Using Inheritance

package OOPS_2;

class Animal{
    public void makeSound(){
        System.out.println("Animal makes a sound !");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog barks !");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal anim = new Animal();
        anim.makeSound();
        Dog d = new Dog();
        d.makeSound();
    }   
}
