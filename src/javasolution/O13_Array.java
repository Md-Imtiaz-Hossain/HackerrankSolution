package javasolution;

import java.util.*;

public class O13_Array {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];

        for(int i = 0 ; i < n ; i++){
            int value = scan.nextInt();
            a[i] = value;
        }

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}


// https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true