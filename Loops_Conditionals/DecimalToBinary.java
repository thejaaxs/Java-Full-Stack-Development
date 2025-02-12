//  To convert the Decimal to Binary 

package Loops_Conditionals ;

import java.util.Scanner ;
public class DecimalToBinary {
    static String decimalToBinary(int num){
        StringBuffer binary = new StringBuffer();
        while(num!=0){
                binary.append(num%2) ;
                num/=2 ;
        }
        return binary.reverse().toString() ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("The Binary : "+decimalToBinary(n));
        sc.close();
    }
}