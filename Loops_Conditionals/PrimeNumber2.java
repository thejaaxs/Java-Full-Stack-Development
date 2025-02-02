// Optimised Code for the Prime Number 

package Loops_Conditionals;

import java.util.Scanner ;
public class PrimeNumber2 {
    static boolean isPrime(int n){
        if(n<=1) return false ;
        if(n==2 || n==3) return true ;
        if(n%2==0 || n%3==0) return false ;
        for(int i=5;i*i<n;i+=6){
            if(n%i==0 || n%(i+2)==0) return false ;
        }
        return true ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        if (isPrime(num)) System.out.println("Prime Number");
        else System.out.println("Not Prime Number !");
        sc.close();
    }
}
