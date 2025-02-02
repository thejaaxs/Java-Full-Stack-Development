// The Arsmtrong Number Code ( for 153 )

package Loops_Conditionals;

import java.util.Scanner ;
public class Armstrong {
    public static void checkArmstrong(int n){
        int arm = 0 , temp = n ;
        while(n!=0){
            int lastDig = n % 10 ;
            arm += Math.pow(lastDig,3) ;
            n /= 10 ;
        }
        if (arm==temp) System.out.println("Armstrong Number !");
        else System.out.println("Not Armstrong !");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        checkArmstrong(n);
        sc.close();
    }
}
