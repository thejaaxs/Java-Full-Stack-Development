// The Palindrome Checker !

package Loops_Conditionals;

import java.util.Scanner ;
public class PalindromeCheck {
    static boolean isPalindrome(int num){
        int temp = num ;
        int rev = 0 ;
        while(num!=0){
            int lastDig = num % 10 ;
            rev = (rev * 10) + lastDig ;
            num /= 10 ;
        }
        return temp==rev ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        if(isPalindrome(num)) System.out.println(num+" is a Palindrome");
        else System.out.println(num+" is not a Palindrome");
        sc.close();
    }
}
