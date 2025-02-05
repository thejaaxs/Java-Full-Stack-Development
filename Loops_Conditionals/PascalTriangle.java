// Program to print the Pascal Triangle !

package Loops_Conditionals;

import java.util.Scanner ;
public class PascalTriangle {
    static int fact(int n){
        if(n==0) return 1 ;
        return n * fact(n-1);
    }
    static int combination(int n , int r){
        return fact(n) / (fact(r) * fact(n-r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");  
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(combination(i,j)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
