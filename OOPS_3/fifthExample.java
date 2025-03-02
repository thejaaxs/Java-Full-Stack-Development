// Payment Class Using OOPS 

interface Payment{
    void pay(int amount);
}
class CreditCardPayments implements Payment{
    public void pay(int amount){
        System.out.println("Paid "+amount+" using Credit Card !");
    }
}
public class fifthExample {
    public static void main(String[] args) {
        
    }
}
