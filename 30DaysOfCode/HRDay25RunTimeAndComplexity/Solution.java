
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
        int n = in.nextInt(), i = 0;
        int all[] = new int[n]; 
        String result[] = new String[n]; 

        for (i = 0; i < n; i++) {
            boolean prime = true;
            all[i] = in.nextInt();
            int top = (int)Math.sqrt(all[i]) + 1;
            
            if(all[i] > 2 && all[i] % 2 == 0) {
                System.out.println("Not prime");
            } else if ( all[0] == 1 && all.length == 1) {
                System.out.println("Not prime");
            } else if ((all[i] % 3 == 0 || all[i] % 5 == 0 || all[i] % 7 == 0 || all[i] % 11 == 0) && (all[i] != 5 && all[i] != 7)) {
                System.out.println("Not prime");
            } else {
                for(int j = 3; j < top; j += 2) {
                    if(all[i] % j == 0) {
                        System.out.println("Not prime");
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.println("Prime"); 
                }
            }
        } 
    }
}


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {
  public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        int n = 1, i = 0;
        int[] all = {1};
        String result[] = new String[n];
        //31 33

        for (i = 0; i < n; i++) {
            boolean prime = true;
            //all[i] = in.nextInt();
            
            if(all[i] > 2 && all[i] % 2 == 0) {
                System.out.println("Not prime");
            } else {
                for(int j = 3; j < all[i]; j += 2) {
                    if(all[i] % j == 0) {
                        System.out.println("Not prime");
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.println("Prime"); 
                }
            }
        }
        if ( all[0] == 1 && all.length == 1) 
            System.out.println("Not prime");

  }
}