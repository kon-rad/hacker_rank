/*
 * Hacker Rank Challenge Day 11
 * Completed on 12/20/16
 */
package pkg2darrays;

import java.util.Scanner;

/**
 *
 * @author konradgnat
 */
public class Main {

    public static void main(String[] args) {
        
        // Hacker Rank input cases here
//        Scanner in = new Scanner(System.in);
//        int arr[][] = new int[6][6];
//        for(int i=0; i < 6; i++){
//            for(int j=0; j < 6; j++){
//                arr[i][j] = in.nextInt();
//            }
//        }
        
       int arr[][] = new int[][]{
           {-1, -1, 0, -9, -2, -2},
           {-2, -1, -6, -8, -2, -5},
           {-1, -1, -1, -2, -3, -4},
           {-1, -9, -2, -4, -4, -5},
           {-7, -3, -3, -2, -9, -9},
           {-1, -3, -1, -2, -4, -5}
        };
       


       
       int result = -1000;
       
       for (int k = 0; k < 4; ++k) {
           for (int m = 0; m < 4; ++m) {
               int sum = 0;
               sum = (arr[k][m] + arr[k][m+1] + arr[k][m+2]);
               sum += arr[k+1][m+1];
               sum += arr[k+2][m] + arr[k+2][m+1] + arr[k+2][m+2];
               if(sum > result)
                   result = sum;
           }
       }
       System.out.println(result); // should return -6
        
    }
    
}
