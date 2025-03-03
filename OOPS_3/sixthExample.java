// Employee Example Using OOPS 

abstract class Employee{
    abstract void calculateSalary();
}
class FullTimeEmployee extends Employee{
    void calculateSalary(){
        System.out.println("Full Time Employee Salary Calculated !");
    }
}
class PartTimeEmployee extends Employee{
    public void calculateSalary(){
        System.out.println("Part Time Employee Salary Calculated !");
    }
}
public class sixthExample {
    public static void main(String[] args) {
        Employee emp[] = {new FullTimeEmployee() , new PartTimeEmployee()};
        for(Employee e : emp){
            e.calculateSalary();
        }
    }
}
