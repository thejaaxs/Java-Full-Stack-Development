// Program to find the LCM of 2 Numbers !

package Functions;

import java.util.Scanner ;
public class LCMOf2 {
    static int gcd(int a , int b){
        while(b!=0){
            int temp = b ;
            b = a % b ;
            a = temp ;
        }
        return a ;
    }
    static int lcm(int a ,int b){
        return (a * b) / gcd(a,b);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int num2 = sc.nextInt();
        System.out.println("The LCM of 2 Numbers is : "+lcm(num1,num2));
        sc.close();
    }
}
