package OOPS_2;
// Parent Class
class Animal2 {
    String name ;

    void eat(){
        System.out.println(name+" is eating !");
    }
}
// Child Class
class Dog2 extends Animal2 {
    void bark(){
        System.out.println(name +" is barking !");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.name = "Jimmy";
        d.eat();
        d.bark();
    }
}
