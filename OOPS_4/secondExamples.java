
class BankAccounts{
    private String accountNumber ;
    private double balance;

    public BankAccounts(String accountNumber,double balance){
        this.accountNumber = accountNumber ;
        this.balance = balance ;
    }

    public double getBalance(){
        return balance ;
    }
    public String getAccountNumber(){
        return accountNumber ;
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount ;
            System.out.println("Amount Deposited : "+amount);
        }
        else System.out.println("Amount cannot be in Negative !");
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount ;
            System.out.println("Amount Withdrawn : "+amount);
        }
        else System.out.println("Insufficent Fund !");
    }
}
public class secondExamples {
    public static void main(String[] args) {
        BankAccounts acc = new BankAccounts("4MT21CS044",1000.00);
        System.out.println(acc.getAccountNumber());
        System.out.println(acc.getBalance());
        acc.deposit(.10);
        System.out.println(acc.getBalance());
        acc.withdraw(0.10);
        System.out.println(acc.getBalance());
    }
}
