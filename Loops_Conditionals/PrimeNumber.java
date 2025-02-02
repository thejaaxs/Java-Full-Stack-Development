// Program to check the number is Prime or Not ! 

package Loops_Conditionals ;

import java.util.Scanner ;
public class PrimeNumber {
    public static boolean isPrime(int n){
        if(n<=1) return false ;
        for(int i=2;i<n;i++){
            if(n%i==00) return false ;
        }
        return true ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        if(isPrime(num)) System.out.println("Prime Number !");
        else System.out.println("Not a Prime Number !");
        sc.close();
    }
}