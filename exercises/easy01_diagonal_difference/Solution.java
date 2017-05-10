import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
	int primary_diagonal = 0;
	int secondary_diagonal = 0;
	for(int a_i = 0; a_i < n; a_i++) {
		primary_diagonal += a[a_i][a_i];
		secondary_diagonal += a[n - a_i - 1][a_i];
	}
	System.out.println(Math.abs(primary_diagonal - secondary_diagonal));
    }
}
