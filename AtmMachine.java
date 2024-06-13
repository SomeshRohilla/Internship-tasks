import java.util.Scanner;

class BankAccount{
    private double Balance;
    public double getBalance(){
        return Balance;
    }
    public BankAccount(double initialBalance){
        this.Balance = initialBalance;
    }
    public void Deposite(double amount){
        if(amount > 0 ){
            Balance = Balance + amount;
            System.out.println("Deposite Successful.");
            System.out.println("Balance : "+Balance);
        }else{
            System.out.println("Invalid deposite amount.");
        }
    }
    public void Withdraw(double amount){
        if (amount > 0 && amount <= Balance){
            Balance = Balance - amount;
            System.out.println("Withdrawl Successful.");
            System.out.println("Balance : "+Balance);
        }else if (amount > Balance){
            System.out.println("Insufficient balance \n Withdrawl Failed");
        }else{
            System.out.println("Invalid withdrawl amount");
        }
    }
    public void CheckBalance(){
        System.out.println("Current Balance : "+Balance);
    }

}
class Atm{
    private BankAccount account;
    Scanner sc = new Scanner(System.in);
    public Atm (BankAccount b){
        account = b;
    }
    public void UserInterface(){
      while(true){
        System.out.println("-----ATM MACHINE-----");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
        int c = sc.nextInt();
        if (c == 1){
                account.CheckBalance();
        }
        else if (c == 2){
            System.out.print("Enter the amount for Withdrawl :");
            double amount_w = sc.nextDouble();
            account.Withdraw(amount_w);
        }
        else if (c == 3){   
            System.out.println("Enter the amount for Deposit :");
            double amount_d = sc.nextDouble();
            account.Deposite(amount_d);
        }else if (c == 4){
            System.out.println("Thank you for Using Atm Machine");
            return; 
        }else{
                System.out.println("Invalid Option. Try Again!");
        }
      }
    }
}


public class AtmMachine {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(1000);
        Atm a = new Atm(b);
        a.UserInterface();
    }   
}
