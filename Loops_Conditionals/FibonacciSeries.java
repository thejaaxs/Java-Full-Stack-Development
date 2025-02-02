// The Fibonacci series using the For Loops !

package Loops_Conditionals;

import java.util.Scanner ;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number upto which you want the Series : ");
        int n = sc.nextInt();
        int a = 0 , b = 1 ;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++){
            int fib = a + b ;
            System.out.print(fib+" ");
            a = b ; 
            b = fib ;
        }
        sc.close();
    }
}
