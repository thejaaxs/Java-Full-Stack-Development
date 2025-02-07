// The Function Overloading to the Mathematical Operations 

package Functions;

import java.util.Scanner ;
public class MathOp {
    static int calculate(int n){
        return n * n ;
    }
    static double calculate(int n, boolean isCube){
       if(isCube) return n*n*n ;
       else return n*n; 
    }
    static double calculate(double num){
        return Math.sqrt(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("The Square of the Number : "+calculate(num));
        System.out.println("The Cube of the Number : "+calculate(num,true));
        System.out.println("The Square Root is : "+calculate((double) num));
        sc.close();
    }
}
