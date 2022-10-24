package java;

import java.util.Arrays;
import java.util.Scanner;

public class O8_CharCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String formattedString = s.toString()
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim();

        String[] strArray = null;
        strArray = formattedString.split(" ");

        System.out.println(strArray.length);
        for (int i = 0; i< strArray.length; i++){
            System.out.println(strArray[i]);
        }
    }
}
