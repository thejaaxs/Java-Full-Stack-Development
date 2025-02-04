// To check whether the Number is a Strong Number or not ! 
// Eg : 145 = 1! + 4! + 5! , is the number itself !

package Loops_Conditionals;

import java.util.Scanner ;
public class StrongNumber {

    static int facto(int num){
        if(num==0 || num==1) return 1 ;
        return num * facto(num-1) ;
    }
    static boolean strongNumCheck(int num){
        int temp = num ;
        int fact = 0 ;
        while(num!=0){
            int lastDig = num % 10 ;
            fact += facto(lastDig) ;
            num /= 10 ;
        }
        return fact == temp ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if(strongNumCheck(num)) System.out.println(num+" is a Strong Number !");
        else System.out.println(num+" is not a Strong Number !");
        sc.close();
    }
}
