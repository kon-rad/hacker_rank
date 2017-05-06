import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        
        String returnDate = in.nextLine();   
        String dueDate = in.nextLine();
        String[] returnSplit = returnDate.split(" ");
        int[] returnNums = new int[returnSplit.length];
        for (int i = 0; i < returnSplit.length; i++) {
            returnNums[i] = Integer.parseInt(returnSplit[i]);
        }
        System.out.println(Arrays.toString(returnNums));

        String[] dueSplit = dueDate.split(" ");
        int[] dueNums = new int[dueSplit.length];
        for (int i = 0; i < dueSplit.length; i++) {
            dueNums[i] = Integer.parseInt(dueSplit[i]);
        }
        System.out.println(Arrays.toString(dueNums));
        System.out.println(returnDate);
        System.out.println(dueDate);
        
        
    }
}