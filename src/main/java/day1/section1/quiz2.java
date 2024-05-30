package day1.section1;

import java.util.Scanner;

public class quiz2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=(int) (Math.random() * 7);
        int y=(int) (Math.random() * 7);

        System.out.printf("what's %d * %d ?" , x, y);
        int answer=sc.nextInt();
        while (answer != x*y){
           System.out.print("Try again");
            System.out.printf("what's %d * %d ?" , x, y);
            answer=sc.nextInt();
        }



    }
}
