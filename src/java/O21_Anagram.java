package java;

import java.util.Scanner;

public class O21_Anagram {

    static boolean isAnagram(String A, String B) {

        A=A.toLowerCase();
        B=B.toLowerCase();
        boolean f = false;

        char[] c = A.toCharArray();
        java.util.Arrays.sort(c);

        char[] d = B.toCharArray();
        java.util.Arrays.sort(d);

        String a = new String (c);
        String b = new String (d);
        if (a.equals(b)) {
            f=true;
        }
        return f;


    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
// https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true