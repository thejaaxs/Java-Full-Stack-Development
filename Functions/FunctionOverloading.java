// Function Overloading for Area Calculation

package Functions ;

public class FunctionOverloading {
    static double area(double radius){
        return Math.PI * radius * radius ;
    }
    public static int area(int length,int breadth){
        return length * breadth ;
    }
    public static double area(double base , double height){
        return 0.5 * base * height ;
    }
    public static void main(String[] args) {
        System.out.println("The Area of the circle : "+area(5.0));
        System.out.println("The Area of the rectangle : "+area(10,20));
        System.out.println("The Area of the Triangle is : "+area(10.0,20.0));
    }
}