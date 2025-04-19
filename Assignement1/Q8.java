abstract class Account {
    private String accNum;
    protected double balance;

    public Account(String num, double bal) {
        this.accNum = num;
        this.balance = bal;
    }

    public String getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void display() {
        System.out.println("Account: " + accNum + " | Balance: $" + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String num, double bal, double rate) {
        super(num, bal);
        this.interestRate = rate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate / 100);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String num, double bal, double limit) {
        super(num, bal);
        this.overdraftLimit = limit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Exceeds overdraft limit!");
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Account[] accounts = {
                new SavingsAccount("SA001", 1000, 2.5),
                new CurrentAccount("CA001", 2000, 500)
        };

        // Polymorphic transactions
        accounts[0].deposit(500);
        accounts[0].withdraw(200);
        accounts[1].deposit(1000);
        accounts[1].withdraw(2500);

        // Display all accounts
        for (Account acc : accounts) {
            acc.display();
        }
    }
}