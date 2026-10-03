package inheritance.child;

import inheritance.Parent.BankAccount;

public class CurrentAccount extends BankAccount {

    CurrentAccount(String accountHolder, String accountNumber, double balance) {
        super(accountHolder , accountNumber , balance);
    }


}
