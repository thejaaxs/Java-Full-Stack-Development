// Method Overriding in Java !

// package OOPS_3 ;

class Animal{
    void sound(){
        System.out.println("Animal Makes Sound !");
    }
}
class dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks !");
    }
}
class cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat Meows !");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal myAnimal ; // Reference for the Parent Class !
        myAnimal = new dog();
        myAnimal.sound(); // Calls Dog Sound !
        myAnimal = new cat();
        myAnimal.sound(); // Calls Cat Sound !
    }
}
