// Bank Account Example Using OOPS

class BankAccount{
    public void calculateInterest(){
        System.out.println("Interest for the General Account !");
    }
}
class SavingsAccount extends BankAccount{
    public void calculateInterest(){
        System.out.println("Calculate Interest for the Savings Account !");
    }
}
class CurrentAccount extends BankAccount{
    public void calculateInterest(){
        System.out.println("Current Account has no Interest !");
    }
}
public class fourthPolymorphism {
    public static void main(String[] args) {
        BankAccount acc[] = {new SavingsAccount() , new CurrentAccount()};
        for(BankAccount ac : acc){
            ac.calculateInterest();
        }
    }
}
