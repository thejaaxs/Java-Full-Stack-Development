// Code to check whether a String is a Palindrome Or Not !

package Recursion;
import java.util.Scanner ;
public class PalindromeChecker {
    static boolean isPalindrome(String str , int left , int right){
        if(left>=right) return true ;
        return (str.charAt(left)==str.charAt(right) && isPalindrome(str,left+1,right-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        // System.out.println(s.length());
        System.out.println("Palindrome : "+isPalindrome(s,0, s.length()-1));
        sc.close();
    }
}
