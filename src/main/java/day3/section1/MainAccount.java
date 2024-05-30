package day3.section1;

import day3.section1.Account;

public class MainAccount {
    public static void main(String[]args) {
        var x = new Account("wejdan", 36000) {

            @Override
            public void withDraw(double amount) {

            }
        };
       //  var y = new Account("Asma", 4000);

        System.out.println(x.name);
        System.out.println(x.getBalance());

        x.deposit(10);
        System.out.println(x.getBalance());
        x.withdraw(60);
        System.out.println(x.getBalance());
        System.out.println(x.getmonthInt());
        System.out.println(x.getMonthlyInt());
    }
}
