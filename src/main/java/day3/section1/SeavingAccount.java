package day3.section1;

public class SeavingAccount extends Account {
    private int Limet;
    public SeavingAccount(String name,double balance,int Limet){
        super(name, balance);
        this.Limet=Limet;
    }
    @Override
    public void withDraw(double amount){
        if(getBalance()-amount>=Limet){
            super.withdraw(amount);
        }
    }
}
