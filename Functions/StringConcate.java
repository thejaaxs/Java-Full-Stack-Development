// Program of the String Concatenation !

package Functions;

import java.util.Scanner ;
public class StringConcate {
    static String concate(String s1 , String s2){
        return s1+" "+s2 ;
    }
    static String concate(String s1,String s2,String s3){
        return s1+" "+s2+" "+s3;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String Concatenation : "+concate("Thejas","Shetty"));
        System.out.println("The String Concatenation of 3 Words : "+concate("Thejas","Vasantha","Shetty"));
        sc.close();
    }
}
