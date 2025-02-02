// Reversing an Integer without using the String !

package Variables_DataTypes;

import java.util.Scanner ;
public class ReverseInteger {
    static int revNum(int n){
        int rev = 0 ;
        while(n!=0){
            int lastDig = n % 10 ;
            rev = rev* 10 + lastDig ;
            n /= 10 ;
        }
        return rev ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("The Reversed Number is "+revNum(num));
        sc.close();
    }
}
