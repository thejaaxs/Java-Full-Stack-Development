package OOPS_2;

class Employee {
    protected String name ; 
    protected int id ; 
    protected double salary ;

    public Employee(String name, int id,double salary){
        this.name = name ;
        this.id = id ;
        this.salary = salary ;
    }
    public void displayDetails(){
        System.out.println("Name : "+name+"\nID : "+id+"\nSalary : "+salary);
    }
    public void work(){
        System.out.println(name+" is Working !");
    }
}
class Developer extends Employee{
    public Developer(String name, int id ,double salary){
        super(name,id,salary);
    }
    @Override
    public void work(){
        System.out.println(name+" is coding Software !");
    }
}
class Manager extends Employee{
    public Manager(String name,int id,double salary){
        super(name,id,salary);
    }
    @Override
    public void work(){
        System.out.println(name+" is managing the Team !");
    }
}
class HR extends Employee{
    public HR(String name,int id,double salary){
        super(name,id,salary);
    }
    @Override
    public void work(){
        System.out.println(name+" is handling the Employees Relation !");
    }
}
public class ThirdInherit {
    public static void main(String[] args) {
        Employee mgr = new Manager("Thejas",421055,22500000);
        mgr.displayDetails();
        mgr.work();
        System.out.println();
        Employee dev = new Developer("Thejas",421055,22500000);
        dev.displayDetails();
        dev.work();
        System.out.println();
        Employee hr = new HR("Akshay",421004,150000000);
        hr.displayDetails();
        hr.work();
    }
}
