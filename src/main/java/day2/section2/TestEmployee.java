package day2.section2;

public class TestEmployee {
    public static void main(String[] args) {
        Employee x=new Employee("Wejdan",30000,2022);
        System.out.print("name:"+x.name);
        System.out.print(", salary:"+x.salry);
        System.out.print(", hair year:"+x.hereld);

        System.out.print("\nAnnual Salary:"+x.AS()+" ,service priod: "+x.SP());
    }
}
