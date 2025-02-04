// Counting the digits in a number !

package Loops_Conditionals ;

import java.util.Scanner ;
public class CountDigits {
    public static int countDig(int num){
        int count = 0 ;
        while(num!=0){
            num /= 10 ;
            count++ ;
        }
        return count ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("The Total number of Digits : "+countDig(num));
        sc.close();
    }
}