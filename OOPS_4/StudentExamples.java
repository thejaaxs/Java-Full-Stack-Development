// Student Management Information Using OOPS


class Student {
    private String name;
    private int rollNumber;
    private char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public char getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setGrade(char grade) {
        if(grade>='A' && grade<='F') this.grade = grade ;
        else System.out.println("Invalid Grade !");
    }
}

public class StudentExamples{
    public static void main(String[] args) {
        Student boy = new Student("Thejas",421055,'B');
        System.out.println("Name : "+boy.getName());
        System.out.println("Roll Number : "+boy.getRollNumber());
        System.out.println("Grade : "+boy.getGrade());

        boy.setGrade('A');
        System.out.println("Updated Grade : "+boy.getGrade());
    }
}
