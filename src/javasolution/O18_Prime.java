package javasolution;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;


public class O18_Prime {
    public void checkPrime(int ... n) {
        for (int j=0;j<n.length;j++) {
            int c = 0;
            for (int i=2;i<n[j];i++) {
                if (n[j]%i==0) {
                    c++;
                }
            }
            if (c==0 && n[j]!=1) {
                System.out.print(n[j] + " ");
            }

        }  System.out.println();
    }
}


