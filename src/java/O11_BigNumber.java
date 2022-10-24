package java;

import java.math.BigInteger;
import java.util.Scanner;

public class O11_BigNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        // Convert the string input to BigInteger
        BigInteger ra = new BigInteger(input1);
        BigInteger rb = new BigInteger(input2);


        // Display the result in BigInteger
        System.out.println(ra.add(rb));
        System.out.println(ra.multiply(rb));
    }
}


// https://www.hackerrank.com/challenges/java-biginteger/problem