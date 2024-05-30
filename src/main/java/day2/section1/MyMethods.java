package day2.section1;

public class MyMethods {
    public static double calcBMI(double Mark, double FullMark){
        return (Mark /FullMark)*100;
    }

    public static String getStatus(double GradeCalculation){
        if(GradeCalculation > 85)
            return "Outstanding";
        else if(GradeCalculation > 75)
            return "Very Good";
        else if(GradeCalculation >65)
            return "Good";
        else if(GradeCalculation >= 50)
            return "Pass";
        else if(GradeCalculation >= 40)
            return "Fail";
        else
            return "Study harder for the next test!";
    }
}
