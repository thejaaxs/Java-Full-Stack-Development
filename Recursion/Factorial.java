// Find the Factorial of the Number !

package Recursion;

import java.util.Scanner ;
public class Factorial {
    static int fact(int num){
        if(num==0){
            return 1 ;
        }
        return num * fact(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("The factorial of the Number is : "+fact(num));
        sc.close();
    }
}
