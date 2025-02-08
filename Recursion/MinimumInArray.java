// Program to Implement the Minimum element in the Array Using Recursion 


package Recursion;

public class MinimumInArray {
    static int findMin(int arr[],int n){
        if(n==1) return arr[0];
        return Math.min(arr[n-1],findMin(arr,n-1));
    }
    public static void main(String[] args) {
        int arr[] = {5,2,9,1,6};
        System.out.println("Minimum Element : "+findMin(arr,arr.length));
    }
}
