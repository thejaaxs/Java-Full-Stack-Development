// Program to find the GCD of the Numbers !

package Recursion;

import java.util.Scanner ;
public class GCD {
    static int gcd(int a , int b){
        if(b==0) return a ;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The GCD of 2 Numbers is : "+gcd(a,b));
        sc.close();
    }
}
