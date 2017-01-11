/*
 * Created by Konrad Gnat
 * On: January 11, 2017 
 * Hacker Rank Challenge Day 20 Sorting
 * 
 * 
 */ 


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int temp, count = 0;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        for(int j = 0; j < n; j++) {
            //count = 0;
            for (int m = 0; m < n - 1; m++) {
                if (a[m] > a[m + 1]) {
                    temp = a[m];
                    a[m] = a[m+1];
                    a[m+1] = temp;
                    count++;
                }
            }
            if ( count == 0 ) 
                break;
        }
        
        
        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
    }
}