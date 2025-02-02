// To check the even or odd using the BITWISE operators !

package Variables_DataTypes;

import java.util.Scanner ;
public class EvenOddBitwise {
    static boolean checkEvenOrOdd(int num){
        if ((num^1)==num+1) return true ;
        else return false ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        if(checkEvenOrOdd(n)) System.out.println("Even Number !");
        else System.out.println("Odd Number !");
        sc.close();
    }
}


// The condition is that : 
// num ^ 1 == num + 1 , for even 
// num ^ 1 == num - 1 , for odd !