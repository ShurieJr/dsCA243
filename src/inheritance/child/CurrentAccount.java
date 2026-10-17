package inheritance.child;

import inheritance.Parent.BankAccount;

public class CurrentAccount extends BankAccount {

  public  CurrentAccount(String accountHolder, String accountNumber, double balance) {
        super(accountHolder , accountNumber , balance);
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("withdrawn " + amount);
        }
        else{
            System.out.println("amount <= balance!");
        }

    }


}
