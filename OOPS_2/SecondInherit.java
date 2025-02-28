package OOPS_2;

class Account1{
    protected double balance ;

    public Account1(double balance){
        this.balance = balance ;
    }

    public void deposit(double amount ){
        balance += amount ;
    }
    public void displayBalance(){
        System.out.println("The Balance is : "+balance);
    }
}
class SavingsAccount1 extends Account1{

    public SavingsAccount1(double balance){
        super(balance);
    }
        void withdraw(double amount){
            if(amount>balance){
                System.out.println("Insufficient Fund !");
            }
            else balance -= amount ;
        }
}
class CurrentAccount1 extends Account1{
    public CurrentAccount1(double balance){
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
        SavingsAccount1 acc1 = new SavingsAccount1(1000);
        acc1.displayBalance();
        acc1.deposit(1000);
        acc1.displayBalance();
        acc1.withdraw(1000);
        acc1.displayBalance();
        System.out.println();
        CurrentAccount1 acc2 = new CurrentAccount1(5000);
        acc2.displayBalance();
        acc2.deposit(1000);
        acc2.displayBalance();
        acc2.withdraw(1000);
        acc2.displayBalance();
    }
}
