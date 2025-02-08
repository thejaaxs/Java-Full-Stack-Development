// Program to Count the Digits in a Number !

package Recursion;

import java.util.Scanner ;
public class CountDigits {
    static int count(int num){
        if(num==0) return 0 ;
        return 1 + count(num/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("The Count of the Number is : "+count(num));
        sc.close();
    }
}
