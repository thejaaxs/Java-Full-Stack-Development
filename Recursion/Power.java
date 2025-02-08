// Program to calculate the power using the recursion !

package Recursion;

import java.util.Scanner ;
public class Power {
    static int power(int base , int pow){
        if(pow==0) return 1 ;
        return base * power(base,pow-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int base = sc.nextInt();
        System.out.println("Enter the Power : ");
        int pow = sc.nextInt();
        System.out.println("The Answer is : "+power(base,pow));
        sc.close();
    }
}
