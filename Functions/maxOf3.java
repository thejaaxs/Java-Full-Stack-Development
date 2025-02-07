package Functions;

import java.util.Scanner ;
public class maxOf3 {
    public static int maxOfThree(int a , int b, int c){
        if(a>b&&a>c) return a ;
        else if(b>a&&b>c) return b ;
        else return c ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number 1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the Number 2 : ");
        int n2 = sc.nextInt();
        System.out.println("Enter the Number 3 : ");
        int n3 = sc.nextInt();
        System.out.println("The greatest Of 3 inputs is : "+maxOfThree(n1,n2,n3));
        sc.close();
    }
}
