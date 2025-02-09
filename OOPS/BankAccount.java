// Program to Manage the Bank Account System 

package OOPS;
class BankAcc{
    private String AccountNumber ;
    private double Balance ;

    public BankAcc(String AccountNumber , double Balance){
        this.AccountNumber = AccountNumber ;
        this.Balance = Balance ;
    }

    public void Deposit(double Amount){
        Balance += Amount ;
        System.out.println("Deposited Amount is "+Amount+" , New Balance is "+Balance);
    }
    public void Withdraw(double Amount){
        if(Amount>Balance){
            System.out.println("Insufficient Funds !");
        }
        else {
            Balance -= Amount ;
            System.out.println("Withdraw Amount is "+Amount+" , New Balance is "+Balance);
        }
    }
    // public double Balance(){
    //     return Balance ;
    // }
    public void Balance(){
        System.out.println("The Balance is "+Balance);
    }
}
public class BankAccount {
    public static void main(String[] args) {
        BankAcc b1 = new BankAcc("MITE21055",1000000.000);
        b1.Deposit(1000);
        // System.out.println("The Balance is "+b1.Balance());
        b1.Withdraw(1000);
        b1.Balance();
    }
}
