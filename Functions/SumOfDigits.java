// Sum of Digits of a Number 

package Functions;

import java.util.Scanner ;
public class SumOfDigits {
    static int sumOfDig(int num){
        int sum = 0 ;
        while(num!=0){
            sum += num%10 ;
            num /= 10 ;
        }
        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        System.out.print("The Sum of the Number : "+sumOfDig(num));
        sc.close();
    }
}
