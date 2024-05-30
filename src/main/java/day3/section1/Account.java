package day3.section1;

public abstract class Account {
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

    public static double getMonthlyIDate() {

        return interestRate / 12;
    }

    public double getMonthlyInt() {

        return balance * getMonthlyIDate();
    }

    public void deposit(double amount) {

        balance = balance + amount;
    }

    public void withdraw(double amount) {

        balance = balance - amount;
    }

    public double getmonthInt() {

        return balance * getMonthlyIDate();
    }

    public abstract void withDraw(double amount);
}