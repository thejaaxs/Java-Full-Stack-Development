// Employee Example Using OOPS

package OOPS_4;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if(salary>0){
            this.salary = salary;
        }
        else System.out.println("Salary cannot be negative !");  
    }
}

public class EmployeeExample {
    public static void main(String[] args) {
        Employee emp = new Employee("Thejas",999999998.88888888888888888888888888888);
        System.out.println("Employee Name : "+emp.getName());
        System.out.println("Employee Salary : "+emp.getSalary());

        emp.setSalary(999999999.999999999999999999999999999999999999);
        System.out.println("Updated Salary : "+emp.getSalary());
    }
}
