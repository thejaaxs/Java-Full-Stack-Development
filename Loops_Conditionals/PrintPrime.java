// Printing the Prime Numbers from 1 to N !

package Loops_Conditionals;

import java.util.Scanner ;
public class PrintPrime {
    static boolean isPrime(int num){
        if(num<=1) return false ;
        if(num==2 ||num==3) return true ;
        if(num%2==0 || num%3==0) return false ;
        for(int i=3;i<=Math.sqrt(num);i+=2){
            if(num%i==0) return false ;
        }
        return true ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.print("The Prime Numbers upto "+num+" : ");
        for(int i=2;i<=num;i++){
            if(isPrime(i)) System.out.print(i+" ");
        }
        sc.close();
    }
}
