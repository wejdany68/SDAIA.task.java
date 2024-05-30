package day3.section1;


public class checkingAccount extends Account {

    public checkingAccount (String name, double balance) {
        super(name, balance);
    }
    @Override
    public void withdraw(double amount) {

        if(getBalance()-amount >=0){
            super.withdraw(amount);
        }

    }




}
