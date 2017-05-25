import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int max = 0;
            for(int b = 1; b <= n; b++){
                for(int a = 1; a < b; a++){
                    int m = a&b;
                    if(m < k && m > max){
                        max = m;
                    }
                }
            }
            System.out.println(max);
        }

    }
}
