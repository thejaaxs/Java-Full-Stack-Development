// Banking System

package OOPS_2;

class BankAccount{
    String accountNumber ;
    double balance ;

    BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber ;
        this.balance = balance ;
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println("The Deposited Amount is "+amount);
    }
    public void displayBalance(){
        System.out.println("The Available Balance is "+balance);
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance*=amount;
            System.out.println("The Withdrawn Amount is "+amount);
        } 
        else System.out.println("Insufficient Funds !");
    }
}
class SavingsAccount extends BankAccount{

    double interestRate = 0.05 ;
    SavingsAccount(String accountNumber,double balance){
        super(accountNumber,balance);
    }

    void applyInterest(){
       balance+= (balance * interestRate) ;
       System.out.println("Interest Applied , New Balance is "+balance);
    }
}
class CurrentAccount extends BankAccount{
    double overDraftAmount = 5000 ;
    CurrentAccount(String accountNumber,double balance){
        super(accountNumber,balance);
    }
    public void withdraw(double amount){
        if(amount<=balance+overDraftAmount){
            balance-=amount;
            System.out.println("The Withdrawn Amount is "+amount);
        }
        else {
            System.out.println("Exceeded Overdraft Limit !");
        }
    }
}
public class BankExample {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("4MT21IS055",1000);
        CurrentAccount ca = new CurrentAccount("421IS007",2000);
        sa.deposit(500);
        sa.applyInterest();
        sa.withdraw(2000);
        sa.displayBalance();
        System.out.println();
        ca.withdraw(3000);
        ca.displayBalance();
    }
}
