package java;

import java.util.Scanner;

public class O5_StringPalindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        StringBuffer buffer = new StringBuffer(A);
        // buffer.reverse();
        // String data = buffer.toString();

        if(A.equals(buffer.reverse().toString())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}


// https://www.hackerrank.com/challenges/java-string-reverse/problem