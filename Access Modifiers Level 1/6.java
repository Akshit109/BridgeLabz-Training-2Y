class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
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

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("BA1001", "Akshit", 25000);
        acc1.displayAccountDetails();

        System.out.println();

        SavingsAccount sAcc = new SavingsAccount("SA2001", "Preeti", 50000, 4.5);
        sAcc.displaySavingsAccountDetails();

        System.out.println("\nDepositing 5000...");
        sAcc.deposit(5000);
        sAcc.displaySavingsAccountDetails();

        System.out.println("\nWithdrawing 7000...");
        sAcc.withdraw(7000);
        sAcc.displaySavingsAccountDetails();
    }
}
