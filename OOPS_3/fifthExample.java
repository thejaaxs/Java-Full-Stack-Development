// Payment Class Using OOPS 

interface Payments{
    void pay(int amount);
}
class CreditCardPayments implements Payments{
    public void pay(int amount){
        System.out.println("Paid "+amount+" using Credit Card !");
    }
}
class UPIPayment implements Payments{
    public void pay(int amount){
        System.out.println("Paid "+amount+" using UPI Payment !");
    }
}
public class fifthExample {
    public static void main(String[] args) {
        Payments payment = new CreditCardPayments();
        payment.pay(100);
        payment = new UPIPayment();
        payment.pay(500);
    }
}
