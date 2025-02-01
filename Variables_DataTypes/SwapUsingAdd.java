// The Swapping of two Numbers without using the third variable !

package Variables_DataTypes ;

import java.util.Scanner ;
public class SwapUsingAdd{
    static void swap(int a , int b){
        a = a + b ;
        b = a - b ;
        a = a - b ;
        System.out.println("After Swapping : a : "+a+" & b : "+b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int b = sc.nextInt();
        System.out.println("Before Swapping : a : "+a+" & b : "+b);
        swap(a,b);
        sc.close();
    }
}