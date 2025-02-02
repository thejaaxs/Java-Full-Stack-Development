// The Given input has to be converted to Celcius or to Fahrenheit !

package Variables_DataTypes;

import java.util.Scanner ;
public class TempConverter {
    static void convertTemp(double temp , char ch){
        if(ch=='C' || ch =='c') 
            System.out.printf("In Celsius : %.2f C\n",(temp - 32.0)*5.0/9.0);
        else if(ch=='F'||ch=='f') 
        System.out.printf("In Fahrenheit : %.2f F\n",(temp * 9.0/5.0)+32.0);
        else System.out.println("Invalid choice !");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature : ");
        double temp = sc.nextDouble();
        System.out.print("Convert to ('C' or 'F') : ");
        char c = sc.next().charAt(0);
        convertTemp(temp , c);
        sc.close();
    }
}
