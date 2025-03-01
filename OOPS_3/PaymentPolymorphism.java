// Payment Using Credit Card And Pay Pal using Polymorphism !

// package OOPS_3 ;

interface Payment{
    void pay(int amount);
}
class CreditCardPayment implements Payment{
    public void pay(int amount){
        System.out.println("Paid "+amount+" using Credit Card !");
    }
}
class PayPalPayment implements Payment{
    public void pay(int amount){
        System.out.println("Paid "+amount+" using PayPal !");
    }
}
public class PaymentPolymorphism {
    public static void main(String[] args) {
        Payment payment ;
        payment = new CreditCardPayment();
        payment.pay(100);
        payment = new PayPalPayment();
        payment.pay(500);
    }
}
