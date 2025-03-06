// String Formatter using the OOPS

class StringFormatter{
    String format(String str){
        return str.toUpperCase();
    }
    String format(String str,boolean reverse){
        return reverse ? new StringBuilder(str).reverse().toString(): str ;
    }
    String format(String str,int repeat){
        return str.repeat(repeat);
    }
}
public class seventhExample {
    public static void main(String[] args) {
        StringFormatter sf = new StringFormatter();
        System.out.println(sf.format("Hello"));
        System.out.println(sf.format("Hello",true));
        System.out.println(sf.format("Hello",false));
        System.out.println(sf.format("Hello",5));
    }
}
