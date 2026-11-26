public class Question2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.deposit(500.0);
        account.withdraw(300.0);

        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Final balance: " + account.getBalance());
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {
        accountNumber = "0000";
        balance = 0.0;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}