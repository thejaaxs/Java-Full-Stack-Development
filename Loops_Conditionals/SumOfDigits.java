// To find the sum of the digits in a number !

package Loops_Conditionals;

import java.util.Scanner ;
public class SumOfDigits {
    static int sumOfDig(int num){
        int sum = 0 ;
        while(num!=0){
            int lastDig = num % 10 ;
            sum+=lastDig ;
            num /= 10 ;
        }
        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The Sum of the digits are : "+sumOfDig(n));
        sc.close();
    }
}
