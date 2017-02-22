
/*
 * Created by Konrad Gnat
 * Hacker rank challenge Day 25
 * Running Time and Complexity
 * Completed on 02/21/2017
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
        int all[] = new int[n];
        String result[] = new String[n];
        
        for (int i = 0; i < n; i++) {
            all[i] = in.nextInt();
            for(int j = 2; j < all[i]; j++) {
                if(all[i] % j == 0) {
                    System.out.println("Not prime");
                    break;
                }
                if(j == (all[i] - 1)) {
                    System.out.println("Prime");
                }
            }
        }
    }
}
