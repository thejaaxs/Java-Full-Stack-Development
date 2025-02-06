// Functions to reverse the String !

package Functions;

import java.util.Scanner ;
public class StringReverse {
    static String rev(String word){
        char chars[] = word.toCharArray();
        int left = 0 , right = word.length()-1 ;
        while(left<right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp ;

            left++ ;
            right-- ;
        }
        return new String(chars) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String word = sc.nextLine();
        System.out.println("The Reversed String is : "+rev(word));
        sc.close();
    }
}
