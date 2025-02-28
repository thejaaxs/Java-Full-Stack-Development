// Method Overriding Using Inheritance

package OOPS_2;

class Animal1{
    public void makeSound(){
        System.out.println("Animal makes a sound !");
    }
}
class Dog1 extends Animal1{
    @Override
    public void makeSound(){
        System.out.println("Dog barks !");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal1 anim = new Animal1();
        anim.makeSound();
        Dog1 d = new Dog1();
        d.makeSound();
    }   
}
