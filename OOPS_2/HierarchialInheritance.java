// Hierarchial Inheritance Using OOPS 

package OOPS_2 ;

class Employee1{
    String name ;

    void work(){
        System.out.println(name+" is Working");
    }
}
class Developer1 extends Employee1 {
    void writeCode(){
        System.out.println(name+" writes the Code");
    }
}
class Manager1 extends Employee1{
    void manageTeam(){
        System.out.println(name+" manages the Team");
    }
}
public class HierarchialInheritance {
    public static void main(String[] args) {
        Developer1 dev = new Developer1();
        dev.name = "Thejas";
        dev.work();
        dev.writeCode();

        Manager1 man = new Manager1();
        man.name = "Thejas";
        man.work();
        man.manageTeam();
}
}