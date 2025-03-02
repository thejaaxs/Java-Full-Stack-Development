// Animal Example Using OOPS

class Animals{
    public void makeSound(){
        System.out.println("Some generic Animal sound !");
    }
}
class Dog extends Animals{
    @Override
    public void makeSound(){
        System.out.println("Woof Woof !");
    }
}
class Cat extends Animals{
    @Override
    public void makeSound(){
        System.out.println("Meow Meow !");
    }
}
public class secondExample {
    public static void main(String[] args) {
        Animals anim = new Animals();
        anim.makeSound();

        anim = new Dog();
        anim.makeSound();  
        
        anim = new Cat();
        anim.makeSound();
    }
}
