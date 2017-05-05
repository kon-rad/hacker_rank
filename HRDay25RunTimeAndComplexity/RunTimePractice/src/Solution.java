/*
 *  Konrad Gnat
 *  
 * 05/05/17
 */

/**
 *
 * @author konradgnat
 */
import java.io.*;
import java.util.*;


public class Solution {
    
    public static void main(String[] args) {
        int flag = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++) {
            int s = in.nextInt();
            if (s == 1 || s == 0) {
                System.out.println("Not prime");
                continue;
            }
            if (s == 2) {
                System.out.println("Prime");
                continue;
            }
            for (int j = 2; j * j <= 2; j++) 
                if (s% j == 0)
                    flag = 1;
            if (flag == 1)
                System.out.println("Not prime");
            else
                System.out.println("Prime");
            flag = 0;
              
        }
    }
}
