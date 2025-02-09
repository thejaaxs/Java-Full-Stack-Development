// Program to print the Employee Details Using OOPS 

package OOPS;

class Employee{
    String name ;
    int id ;
    double salary ;

    public Employee(String name , int id , double salary){
        this.name = name ;
        this.id = id ;
        this.salary = salary ;
    }

    public double annualSalary(){
        return salary * 12 ;
    }
    public void displayDetails(){
        System.out.println("Name is : "+name+"\nID is : "+id+"\nSalary is : "+annualSalary());
    }
}
public class Employees {
    public static void main(String[] args) {
        Employee e1 = new Employee("Thejas",421055,997840.2578);
        e1.displayDetails();
    }
}
