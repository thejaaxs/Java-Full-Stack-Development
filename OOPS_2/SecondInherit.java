package OOPS_2;

class Account{
    protected double balance ;

    public Account(double balance){
        this.balance = balance ;
    }

    public void deposit(double amount ){
        balance += amount ;
    }
    public void displayBalance(){
        System.out.println("The Balance is : "+balance);
    }
}
class SavingsAccount extends Account{

    public SavingsAccount(double balance){
        super(balance);
    }
        void withdraw(double amount){
            if(amount>balance){
                System.out.println("Insufficient Fund !");
            }
            else balance -= amount ;
        }
}
class CurrentAccount extends Account{
    public CurrentAccount(double balance){
        super(balance);
    }
    void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient Fund !");
        }
        else balance -= amount ;
    }
}
public class SecondInherit {
    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount(1000);
        acc1.displayBalance();
        acc1.deposit(1000);
        acc1.displayBalance();
        acc1.withdraw(1000);
        acc1.displayBalance();
        System.out.println();
        CurrentAccount acc2 = new CurrentAccount(5000);
        acc2.displayBalance();
        acc2.deposit(1000);
        acc2.displayBalance();
        acc2.withdraw(1000);
        acc2.displayBalance();
    }
}
