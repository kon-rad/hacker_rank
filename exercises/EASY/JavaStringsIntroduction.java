/*
 * Created by Konrad Gnat
 * On: January 09, 2017 
 * Hacker Rank Challenges
 *
 * Easy
 * Java Strings Introduction
 * 
 * 
 */   
import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         String A=sc.next();
//         String B=sc.next();
        String A = "hello";
        String B = "java";
        /* Enter your code here. Print output to STDOUT. */
        int aLen = A.length();
        int bLen = B.length();
        int sum = aLen + bLen;
        String result = "" + sum;
        if(A.compareTo(B) > 0)
            result += "\nYes";
        else 
            result+= "\nNo";
        result += "\n" + (A.substring(0,1).toUpperCase() + A.substring(1))
            + " " + (B.substring(0,1).toUpperCase() + B.substring(1));
        
        System.out.println(result);
        
    }
}
