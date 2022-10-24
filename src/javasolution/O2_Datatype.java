package javasolution;

import java.util.Scanner;

public class O2_Datatype {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }

        System.out.println("=================================================");
        System.out.println(
                "S.No.\t  Data Type\t  Size\t  Min. Value\t\t  Max. Value\t");
        System.out.println("1\t  Byte\t\t" + Byte.SIZE
                + "\t" + Byte.MIN_VALUE
                + "\t\t\t" + Byte.MAX_VALUE);
        System.out.println("2\t  Short\t\t" + Short.SIZE
                + "\t" + Short.MIN_VALUE
                + "\t\t\t" + Short.MAX_VALUE);
        System.out.println("3\t  Integer\t" + Integer.SIZE
                + "\t" + Integer.MIN_VALUE
                + "\t\t" + Integer.MAX_VALUE);
        System.out.println("4\t  Float\t\t" + Float.SIZE
                + "\t" + Float.MIN_VALUE
                + "\t\t\t" + Float.MAX_VALUE);
        System.out.println("5\t  Long\t\t" + Long.SIZE
                + "\t" + Long.MIN_VALUE + "\t"
                + Long.MAX_VALUE);
        System.out.println("6\t  Double\t" + Double.SIZE
                + "\t" + Double.MIN_VALUE
                + "\t\t" + Short.MAX_VALUE);
        System.out.println("7\t  Character\t"
                + Character.SIZE);
    }

}


// https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true