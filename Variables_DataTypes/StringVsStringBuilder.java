// Compare performance when concatenating a large number of strings using String and StringBuilder
// The String each time creates a new String 
// The String Builder , modifies its own String !

package Variables_DataTypes;

import java.util.Scanner ;
public class StringVsStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long startTime , endTime ;

        // Using the String 
        startTime = System.currentTimeMillis();
        String str = "";
        for(int i=0;i<10000;i++){
            str+=i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken using the Strings : "+(startTime-endTime)+" ms");

        // Using the String Builder 
        startTime = System.currentTimeMillis();
        StringBuilder stri = new StringBuilder();
        for(int i=0;i<10000;i++){
            stri.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("The Time using the String Builder is : "+(startTime-endTime)+" ms");
        sc.close();
    }
}
