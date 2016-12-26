/*
 * Haker rank challenge day 14 
 * Completed 12/26/16
 * Sample Input 3 ... 1 2 5
 * Sample Output 4
 */
package day14scope;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author konradgnat
 */
public class Day14Scope {



    class Difference {
            private int[] elements;
            public int maximumDifference;
            
    Difference(int[] arrayInput) {
        elements = arrayInput; 
    }

    public void computeDifference() {
        int diff = 0;
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                if (i != j) {
                    if (diff < Math.abs(elements[i] - elements[j])) 
                        diff = Math.abs(elements[i] - elements[j]); 
                }
            }
        }
        maximumDifference = diff;
    }
} // End of Difference class


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}