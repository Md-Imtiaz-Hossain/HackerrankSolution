package javasolution;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class O6_PatternCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String s = in.nextLine();
            Pattern p = Pattern.compile(s);
            Matcher m = p.matcher(s);
            boolean matchFound = m.matches();

            boolean b = Pattern.compile(s).matcher(s).find();
            if(b){
                System.out.println("Valid");
            }else {
                System.out.println("Invalid");
            }



        }
    }
}
// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true