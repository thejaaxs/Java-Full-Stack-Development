package Variables_DataTypes;
import java.util.Scanner ;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        double num = sc.nextDouble();
        int intNum = (int)num ; // here the precision is lost !
        double number = intNum ; // the lost precesion cannot be retrived once lost 
        System.out.println("Original Double : "+num);
        System.out.println("Integer Type : "+intNum);
        System.out.println("After Double : "+number);
        sc.close();
    }
}
