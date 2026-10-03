package inheritance;

import inheritance.child.SavingAccount;

public class Main {
    static void main() {
        SavingAccount sacc1  = new SavingAccount("Mohamed" , "1241234324" , 100);
        sacc1.deposit(100);
        sacc1.display();
    }
}
