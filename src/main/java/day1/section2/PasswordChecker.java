package day1.section2;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the phone number: ");
        String password = sc.nextLine();

        if (password.length() != 10) {
            System.out.println("Password must be exactly 10 characters.");
        } else {
            int digitCount = 0;
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isDigit(c)) {
                    digitCount++;
                }
            }
            if (digitCount < 3) {
                System.out.println("Password must contain at least 3 digits.");
            } else {
                System.out.println("Password is valid.");
            }
        }
    }
}
