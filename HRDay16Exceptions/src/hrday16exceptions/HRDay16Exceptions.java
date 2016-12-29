/*
 * Completed 12/29/16
 */
package hrday16exceptions;
    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author konradgnat
 */
public class HRDay16Exceptions {



public class Solution {

    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int number;
        
        try {
            number = Integer.parseInt(S);
            System.out.println(number);
        }
        catch(Exception e) {
            System.out.println("Bad String");
        }
    }
}
    
}
