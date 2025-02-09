// Student Class Example !

package OOPS;

class Student{
    String name ;   
    int rollNo ;
    double marks ;

    public Student(String name ,int rollNo , double marks){
        this.name = name ;
        this.rollNo = rollNo ;
        this.marks = marks ;
    }
    public void displayDetails(){
        System.out.println("Name : "+name+"\nRoll Number : "+rollNo+"\nMarks : "+marks);
    }
    public char calculateGrade(){
        if(marks>=90) return 'A';
        else if(marks>=80) return 'B';
        else if(marks>=70) return 'C';
        else return 'F';
    }
}
public class students {
    public static void main(String[] args) {
        Student s1 = new Student("Thejas",421055,100.00);
        Student s2 = new Student("Akash",420009,95.46);
        s1.displayDetails();
        System.out.println("The Grade of "+s1.name+" is "+s1.calculateGrade());
        System.out.println();
        s2.displayDetails();
        System.out.println("The Grade of "+s2.name+" is "+s2.calculateGrade());
    }
}
