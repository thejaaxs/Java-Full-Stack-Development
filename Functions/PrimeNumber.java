// Program to check whether the Number is a Prime or Not !

package Functions;

import java.util.Scanner;
public class PrimeNumber {
    static boolean isPrime(int num){
        if(num<=1) return false ;
        if(num==2 || num==3) return true ;
        if(num%2==0 || num%3==0) return false ;
        for(int i=4;i<=Math.sqrt(num);i+=2){
            if(num%i==0) return false ;
        }
        return true ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        if(isPrime(num)) System.out.println("Prime Number !");
        else System.out.println("Not Prime Number !");
        sc.close();
    }
}
