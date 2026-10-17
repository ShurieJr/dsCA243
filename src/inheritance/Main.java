package inheritance;

import inheritance.Parent.BankAccount;
import inheritance.child.CurrentAccount;
import inheritance.child.SavingAccount;

public class Main {
    static void main() {
        SavingAccount account1 = new SavingAccount("Mohamed abdullahi" , "12121" , 500);
        CurrentAccount account2 = new CurrentAccount("Warsame" , "10101" , 400);

        account1.withdraw(50);
        account2.withdraw(600);
    }
}
