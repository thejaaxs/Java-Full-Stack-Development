// Person Example using OOPS !

package OOPS_4;

class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge(){
        return age ;
    }
    public String getName(){
        return name ;
    }
    public void setAge(int age){
        this.age = age ;
    }
    public void setName(String name){
        this.name = name ;
    }
}

public class firstExample {
    public static void main(String[] args) {
        Person boy = new Person(20,"Roshan");
        System.out.println("Name : "+boy.getName());
        System.out.println("Age : "+boy.getAge());
        boy.setName("Rahul");
        boy.setAge(22);
        System.out.println("---------------------------");
        System.out.println("New Name : "+boy.getName());
        System.out.println("New Age : "+boy.getAge());
    }
}