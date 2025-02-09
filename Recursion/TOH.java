// Program to Tower Of Hanoi Problem !

package Recursion;

import java.util.Scanner ;
public class TOH {
    static void towerOfHanoi(int num,char from , char to , char aux){
        if(num==1){
            System.out.println("Move disk 1 from "+from+" to "+to);
            return ;
        }
        towerOfHanoi(num-1,from,aux,to);
        System.out.println("Move disk "+num+" from "+from+" to "+to);
        towerOfHanoi(num-1,aux, to,from);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Disks : ");
        int n = sc.nextInt();
        towerOfHanoi(n,'A','C','B');
        sc.close();
    }
}
