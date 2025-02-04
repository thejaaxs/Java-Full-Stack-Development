// The Strong Number checking using the for loop instead of recursion !

package Loops_Conditionals;

import java.util.Scanner ;
public class StrongNumber2 {

    static int fact(int n){
        int fact = 1 ;
        for(int i=1;i<=n;i++){
            fact *= i ;
        }
        return fact ;
    }
    static boolean strongNumCheck(int num){
        int factSum = 0 , original = num ;
        while(num!=0){
            int lastDig = num % 10 ;
            factSum += fact(lastDig);
            num /= 10 ;
        }
        return factSum == original ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        if(strongNumCheck(num)) System.out.println(num+" is a Strong Number !");
        else System.out.println(num+" is not a Strong Number !");
        sc.close();
    }
}
