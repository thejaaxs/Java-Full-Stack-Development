// Employee Management System !

package OOPS_2;

class Employee{
    String name ; 
    double salary ; 

    public Employee(String name,double salary){
        this.name = name ;
        this.salary = salary ;
    }
    public void work(){
        System.out.println(name+" is Working !");
    }
}
class Developer extends Employee{
    Developer(String name,double salary){
        super(name,salary);
    }
    public void work(){
        System.out.println(name+" is building the Software !");
    }
    void writeCode(){
        System.out.println(name+" writes the Code !");
    }
}
class Manager extends Employee{
    Manager(String name,double salary){
        super(name,salary);
    }
    public void work(){
        System.out.println(name+" is managing the Project");
    }
    public void manageTeam(){
        System.out.println(name+" is managing the Team !");
    }
}
public class EmployeeExample {
    public static void main(String args[]){
        Developer thej = new Developer("Thejas",2500000);
        Manager aksh = new Manager("Akshay",150000000);
        thej.work();
        thej.writeCode();
        aksh.work();
        aksh.manageTeam();
    }
}
