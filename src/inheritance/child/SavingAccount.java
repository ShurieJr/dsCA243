package inheritance.child;

import inheritance.Parent.BankAccount;

public class SavingAccount extends BankAccount {


   public SavingAccount(String accountHolder, String accountNumber, double balance) {
        super(accountHolder , accountNumber , balance);
    }

   public void displayBalance(){
        System.out.println("Saving account balance: " + balance);
    }

    protected void display(){
        System.out.println("saving account test");
    }
}
