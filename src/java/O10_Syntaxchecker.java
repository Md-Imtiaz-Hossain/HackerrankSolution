package java;

import java.util.Scanner;
import java.util.StringTokenizer;

public class O10_Syntaxchecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  s= scan.nextLine();

        String formattedString = s.toString()
                .replace(",", " ")  //remove the commas
                .replace("[", " ")  //remove the right bracket
                .replace("]", " ")
                .replace("{-", " ")
                .replace("-}", " ")
                .replace("@", " ")
                .replace("-", " ")
                .replace("'", " ")
                .replace("?", " ")
                .replace("!", " ")
                .replace("_", " ")
                .replace(".", " ")
                .replace("/", " ")
                .replace("%", " ") //remove the left bracket
                .trim();

        StringTokenizer token = new StringTokenizer(formattedString);
        System.out.println(token.countTokens());
        while(token.hasMoreTokens()){
            System.out.println(token.nextToken());
        }

        scan.close();
    }
}


// https://www.hackerrank.com/challenges/java-loops/problem?h_r=profile