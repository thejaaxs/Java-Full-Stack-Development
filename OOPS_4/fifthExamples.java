// Students Example Using OOPS

class Students2 {
    private String name;
    private int rollNo;
    private int marks;

    public Students2(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else
            System.out.println("Invalid Marks ! . Ranges from 0 to 100");
    }

    public int getMarks() {
        return marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String calculateGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 80)
            return "B";
        else if (marks >= 70)
            return "C";
        else if (marks >= 60)
            return "D";
        else
            return "F";
    }
}

public class fifthExamples {
    public static void main(String[] args) {
        Students2 arya = new Students2("Aryan", 42105, 95);
        System.out.println(arya.getName() + " grade is " + arya.calculateGrade());
        Students2 poorvi = new Students2("Poorviksha", 45251, 85);
        System.out.println(poorvi.getName() + " grade is " + poorvi.calculateGrade());
    }
}
