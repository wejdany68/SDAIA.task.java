package day2.section2;

import java.time.Year;

public class Employee {
    String name;
    double salry;
    int hereld;

    public Employee(String n,double s,int h){
        name =n;
        salry =s;
        hereld =h;
    }
    public double AS(){
        return salry*12;
    }
    public int SP(){
        int cy=Year.now().getValue();
        return cy-hereld;
    }

}
