package OOPS_2;
// Parent Class
class Animal {
    String name ;

    void eat(){
        System.out.println(name+" is eating !");
    }
}
// Child Class
class Dog extends Animal {
    void bark(){
        System.out.println(name +" is barking !");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Jimmy";
        d.eat();
        d.bark();
    }
}
