package java;

import java.util.Arrays;
import java.util.Scanner;

public class O3_Loop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            for(int j=0;j<n;j++){
                int value = (int) (Math.pow(2,j)*b);
                sum = sum + value;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}


// https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
