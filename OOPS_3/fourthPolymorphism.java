// Bank Account Example Using OOPS

class BankAccounts1{
    public void calculateInterest(){
        System.out.println("Interest for the General Account !");
    }
}
class SavingsAccounts1 extends BankAccounts1{
    public void calculateInterest(){
        System.out.println("Calculate Interest for the Savings Account !");
    }
}
class CurrentAccounts1 extends BankAccounts1{
    public void calculateInterest(){
        System.out.println("Current Account has no Interest !");
    }
}
public class fourthPolymorphism {
    public static void main(String[] args) {
        BankAccounts1 accs[] = {new SavingsAccounts1() , new CurrentAccounts1()};
        for(BankAccounts1 ac : accs){
            ac.calculateInterest();
        }
    }
}
