class BankAccount1 {
    private int accountNumber;
    private double balance;

    static int count = 0;
    final int accountId;

    BankAccount1(int accNo, double bal) {
        if (bal < 0)
            throw new IllegalArgumentException("Invalid balance");

        accountNumber = accNo;
        balance = bal;
        accountId = ++count;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid deposit");
    }

    public void withdraw(double amount) {
        if (amount <= 0)
            System.out.println("Invalid withdrawal");
        else if (amount > balance)
            System.out.println("Insufficient balance");
        else
            balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount1 b1 = new BankAccount1(101, 5000);
        BankAccount1 b2 = new BankAccount1(102, 3000);

        b1.deposit(1000);
        b1.withdraw(2000);

        System.out.println("Balance: " + b1.getBalance());
        System.out.println("Account ID: " + b1.accountId);
        System.out.println("Total Accounts: " + BankAccount1.count);
    }
}
