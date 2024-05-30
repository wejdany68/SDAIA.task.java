package day2.section3;

public class Account {
    String name;
    private double balance;
    private static double interestRate = 0.04;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public static double getMonthlyInterestRate() {
        return interestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void deposit(double amount) {
        balance = balance+ amount;
    }

    public void withdraw(double amount) {
        balance = balance- amount;
    }

    public double getmonthInt() {
        return balance*getMonthlyInterestRate();
    }
}
