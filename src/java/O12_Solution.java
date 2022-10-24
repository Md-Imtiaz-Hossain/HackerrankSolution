package java;

import java.io.*;
import java.math.*;

public class O12_Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger ra = new BigInteger(n);
        boolean flag = ra.isProbablePrime(100000);

        if (flag)
            System.out.println("prime");
        else
            System.out.println("not prime");

        bufferedReader.close();
    }
}


// https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true