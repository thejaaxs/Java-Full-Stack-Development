// Employee Example Using OOPS 

abstract class Employees{
    abstract void calculateSalary();
}
class FullTimeEmployees extends Employees{
    void calculateSalary(){
        System.out.println("Full Time Employee Salary Calculated !");
    }
}
class PartTimeEmployees extends Employees{
    public void calculateSalary(){
        System.out.println("Part Time Employee Salary Calculated !");
    }
}
public class sixthExample {
    public static void main(String[] args) {
        Employees emps[] = {new FullTimeEmployees() , new PartTimeEmployees()};
        for(Employees e : emps){
            e.calculateSalary();
        }
    }
}
