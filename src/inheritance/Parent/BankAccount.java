package inheritance.Parent;

public class BankAccount {
    protected String accountHolder, accountNumber;
    protected double balance;

  public  BankAccount(){

    }
  public  BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    protected void display() {
        System.out.println("accountHolder= " + accountHolder);
        System.out.println("accountNumber= " + accountNumber);
        System.out.println("balance= " + balance);
    }
}
