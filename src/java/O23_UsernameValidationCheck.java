package java;

import java.util.Scanner;

class UsernameValidator {
    public static final String regularExpression = "^[a-zA-Z][\\w]{7,29}$";
}


public class O23_UsernameValidationCheck {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}


// https://www.hackerrank.com/challenges/valid-username-checker/problem?isFullScreen=true