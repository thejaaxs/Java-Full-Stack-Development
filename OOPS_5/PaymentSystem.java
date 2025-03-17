// Payment System Using OOPS !

abstract class Payments1 {
    abstract void processPayment(double payment); // defines only what should be done !
}

class CreditCardPayment1 extends Payments1 {
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment : $" + amount);
    }
}

class PaypalPayment1 extends Payments1 {
    public void processPayment(double amount) {
        System.out.println("Processing Paypal Payment : $" + amount);
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
        Payments1 payment1 = new CreditCardPayment1();
        payment1.processPayment(1000);

        Payments1 payment2 = new PaypalPayment1();
        payment2.processPayment(2000);
    }
}