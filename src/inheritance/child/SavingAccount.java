package inheritance.child;

import inheritance.Parent.BankAccount;

public class SavingAccount extends BankAccount {


   public SavingAccount(String accountHolder, String accountNumber, double balance) {
        super(accountHolder , accountNumber , balance);
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 && balance - amount >= 100 ){
            balance -= amount;
            System.out.println("withdrawn " + amount);
        }
        else{
            System.out.println("minimum balance 100 required!");
        }
    }


    public void displayBalance(){
        System.out.println("Saving account balance: " + balance);
    }

    protected void display(){
        System.out.println("saving account test");
    }
}
