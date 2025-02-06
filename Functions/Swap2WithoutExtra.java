// Swapping of two numbers without the third variable !

package Functions;

import java.util.Scanner ;
public class Swap2WithoutExtra {
    static void swap(int a ,int b){
        a = a ^ b ;
        b = a ^ b ;
        a = a ^ b ;
        System.out.println("After Swapping : a = "+a+" , b = "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second Number : ");
        int b = sc.nextInt();
        System.out.println("Before Swapping : a = "+a+" , b = "+b);
        swap(a,b);
        sc.close();
    }
}
