// Finding the largest & Smallest Number using the Loops !

package Variables_DataTypes;

import java.util.Scanner ;
public class MinMaxArray2 {
    static int max(int arr[],int n){
        int large = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>large) large = arr[i];
        }
        return large ;
    }
    static int min(int arr[],int n){
        int small = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<small) small = arr[i];
        }
        return small ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array Elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Smallest Number is : "+min(arr,n));
        System.out.println("The Largest Number is : "+max(arr,n));
        sc.close();
    }
}
