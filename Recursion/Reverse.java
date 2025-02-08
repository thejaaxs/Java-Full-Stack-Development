// Program to reverse a Number using Recursion !

package Recursion;

import java.util.Scanner ;
public class Reverse {
    static int reverse(int num , int rev){
        if(num==0) return rev ;
        return reverse(num/10,rev*10+num%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("The Reverse is : "+reverse(num,0));
        sc.close();
    }
}
