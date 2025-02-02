// The Finding of largest and Smallest Number in an Array !

package Variables_DataTypes;

import java.util.Scanner ;
import java.util.Arrays ;
public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array Elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The Smallest Number is : "+arr[0]);
        System.out.println("The largest Number is : "+arr[n-1]);
        sc.close();
    }
}
