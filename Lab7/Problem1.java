import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal denied: insufficient balance.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = input.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = input.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = input.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolder, balance);

        System.out.print("Enter deposit amount: ");
        account.deposit(input.nextDouble());
        System.out.print("Enter withdrawal amount: ");
        account.withdraw(input.nextDouble());

        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());

        input.close();
    }
}
