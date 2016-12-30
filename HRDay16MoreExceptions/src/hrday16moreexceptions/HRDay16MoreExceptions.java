/*
 * Hacker Rank Day 16 More Exceptions
 * Completed 12/30/16
 */
package hrday16moreexceptions;
import java.util.*;
import java.io.*;
/**
 *
 * @author konradgnat
 */
public class HRDay16MoreExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
//Write your code here

class Calculator {
    int n;
    int p;
    
    public int power(int n, int p) {
        if (n < 0 || p < 0) {
            throw new IllegalArgumentException("n and p should be non-negative");
        }
        else {
            return (int) Math.round(Math.pow(n, p)); 
        }   
    }

}

class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}

