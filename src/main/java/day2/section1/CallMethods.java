package day2.section1;

import java.util.Scanner;

public class CallMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Mark: ");
        double m = sc.nextDouble();
        System.out.print("Enter the Full Mark: ");
        double f = sc.nextDouble();

        double GradeCalculation = MyMethods.calcBMI(m, f);
        String status = MyMethods.getStatus(GradeCalculation);
        System.out.println("Your Grade Calculation: " + GradeCalculation);
        System.out.println("Your status: " + status);
    }
}
