// Bank Account Example Using OOPS

class BankAccounts{
    public void calculateInterest(){
        System.out.println("Interest for the General Account !");
    }
}
class SavingsAccounts extends BankAccounts{
    public void calculateInterest(){
        System.out.println("Calculate Interest for the Savings Account !");
    }
}
class CurrentAccounts extends BankAccounts{
    public void calculateInterest(){
        System.out.println("Current Account has no Interest !");
    }
}
public class fourthPolymorphism {
    public static void main(String[] args) {
        BankAccounts accs[] = {new SavingsAccounts() , new CurrentAccounts()};
        for(BankAccounts ac : accs){
            ac.calculateInterest();
        }
    }
}
