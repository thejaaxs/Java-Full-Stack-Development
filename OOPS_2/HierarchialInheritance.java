// Hierarchial Inheritance Using OOPS 

package OOPS_2 ;

class Employee{
    String name ;

    void work(){
        System.out.println(name+" is Working");
    }
}
class Developer extends Employee {
    void writeCode(){
        System.out.println(name+" writes the Code");
    }
}
class Manager extends Employee{
    void manageTeam(){
        System.out.println(name+" manages the Team");
    }
}
public class HierarchialInheritance {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.name = "Thejas";
        dev.work();
        dev.writeCode();

        Manager man = new Manager();
        man.name = "Thejas";
        man.work();
        man.manageTeam();
}
}