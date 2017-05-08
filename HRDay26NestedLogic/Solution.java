import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
	int fine = 0; 
        String returnDate = in.nextLine();   
        String dueDate = in.nextLine();
        String[] returnSplit = returnDate.split(" ");
        int[] returnNums = new int[returnSplit.length];

        for (int i = 0; i < returnSplit.length; i++) {
            returnNums[i] = Integer.parseInt(returnSplit[i]);
        }

        String[] dueSplit = dueDate.split(" ");
        int[] dueNums = new int[dueSplit.length];
        for (int i = 0; i < dueSplit.length; i++) {
            dueNums[i] = Integer.parseInt(dueSplit[i]);
        }
        if (dueNums[2] >= returnNums[2] && dueNums[0] >= returnNums[0] && dueNums[1] >= returnNums[1])
	{
		fine = 0; 
	} else if (dueNums[2] == returnNums[2] && dueNums[1] == returnNums[1] && dueNums[0] < returnNums[0])
	{
		fine = 15 * (returnNums[0] - dueNums[0]);
	} else if (dueNums[2] == returnNums[2] && dueNums[1] < returnNums[1])
	{
		fine = 500 * (returnNums[1] - dueNums[1]);
	} else if (dueNums[2] < returnNums[2])
	{
		fine = 10000;
	}
	System.out.println(fine);
    }
}
