// Reversing an integer with the Loops !

package Loops_Conditionals;

import java.util.Scanner ;
public class ReverseInteger {
    public static int integerReverse(int num){
        int rev = 0 ;
        while(num!=0){
            int dig = num % 10 ;
            rev = (rev * 10) + dig ;
            num /= 10 ;
        }
        return rev ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The Reversed Number is : "+integerReverse(n));
        sc.close();
    }
}
