// Animal Sound System

package OOPS_2;

class Animal{
    public void makeSound(){
        System.out.println("Some generic animal sound !");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog Barks !");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat Meows !");
    }
}
public class AnimalExample {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.makeSound();
        System.out.println();
        Animal c = new Cat();
        c.makeSound();
    }
}
