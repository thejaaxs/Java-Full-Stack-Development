// Program to find the sum of the Digits using Recursion !

package Recursion;

import java.util.Scanner ;
public class SumOfDigits {
    static int sumOfDig(int num,int sum){
        if(num==0) return sum ;
        return sumOfDig(num/10,sum+num%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("The Sum of the Digits is : "+sumOfDig(num,0));
        sc.close();
    }
}
