package java;

import java.util.Scanner;

public class O4_FirstLetterCapital {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        // get First letter of the string
        String firstLetStrA = A.substring(0, 1);
        // Get remaining letter using substring
        String remLetStrA = A.substring(1);
        firstLetStrA = firstLetStrA.toUpperCase();

        // get First letter of the string
        String firstLetStrB = B.substring(0, 1);
        // Get remaining letter using substring
        String remLetStrB = B.substring(1);
        firstLetStrB = firstLetStrB.toUpperCase();

        System.out.println(firstLetStrA+remLetStrA + " " + firstLetStrB+remLetStrB);


    }
}
