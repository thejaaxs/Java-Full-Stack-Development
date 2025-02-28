package OOPS_2;

class Employee2 {
    protected String name ; 
    protected int id ; 
    protected double salary ;

    public Employee2(String name, int id,double salary){
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
class Developer2 extends Employee2{
    public Developer2(String name, int id ,double salary){
        super(name,id,salary);
    }
    @Override
    public void work(){
        System.out.println(name+" is coding Software !");
    }
}
class Manager2 extends Employee2{
    public Manager2(String name,int id,double salary){
        super(name,id,salary);
    }
    @Override
    public void work(){
        System.out.println(name+" is managing the Team !");
    }
}
class HR2 extends Employee2{
    public HR2(String name,int id,double salary){
        super(name,id,salary);
    }
    @Override
    public void work(){
        System.out.println(name+" is handling the Employees Relation !");
    }
}
public class ThirdInherit {
    public static void main(String[] args) {
        Employee2 mgr = new Manager2("Thejas",421055,22500000);
        mgr.displayDetails();
        mgr.work();
        System.out.println();
        Employee2 dev = new Developer2("Thejas",421055,22500000);
        dev.displayDetails();
        dev.work();
        System.out.println();
        Employee2 hr = new HR2("Akshay",421004,150000000);
        hr.displayDetails();
        hr.work();
    }
}
