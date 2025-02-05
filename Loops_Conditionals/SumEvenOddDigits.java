// The Program to Print the Sum of Even and odd digits in a Number !

package Loops_Conditionals;

import java.util.Scanner ;
public class SumEvenOddDigits {
    static int oddSum(int num){
        int oddS = 0 ;
        while(num!=0){
            int lastDig = num%10;
            if(lastDig%2!=0) oddS+=lastDig ;
            num /= 10 ;
        }
        return oddS ;
    }
    static int evenSum(int num){
        int evenS = 0 ;
        while(num!=0){
            int lastDig = num%10;
            if(lastDig%2==0) evenS+=lastDig ;
            num/=10;
        }
        return evenS ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("The Even Sum is : "+evenSum(num));
        System.out.println("The Odd Sum is : "+oddSum(num));
        sc.close();
    }
}
