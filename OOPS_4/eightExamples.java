// Employee Class With Salary management using the OOPS !

class Employee3 {
    private int employeeID;
    private String name;
    private double salary;

    public Employee3(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        setSalary(salary);
    }
    public int getEmployeeID(){
        return employeeID;
    }
    public String getName(){
        return name;
    }
    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
        else
            System.out.println("Salary cannot be Negative !");
    }

    public double getSalary() {
        return salary;
    }

    public void applyBonus(double percentage) {
        if (percentage > 0) {
            this.salary += (this.salary * (percentage / 100));
        } else
            System.out.println("Not Enough Salary To Apply Bonus !");
    }
}

public class eightExamples {
    public static void main(String[] args) {
        Employee3 male = new Employee3(321055,"Akash",150000.100);
        System.out.println("Name : "+male.getName());
        System.out.println("Employee ID : "+male.getEmployeeID());
        male.setSalary(200000);
        System.out.println("Salary : "+male.getSalary());
        male.applyBonus(10);
        System.out.println("After Bonus Salary : "+male.getSalary());
    }
}
