
package recursion;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Recursion {
    
        
    public static int factorial(int x) {
        if (x <= 1)
            return x;
        else 
            return x * factorial(x - 1);
    }


    public static void main(String[] args) {
     
//        Scanner scanner;
//        scanner = new Scanner(System.in);
//        int in = scanner.nextInt();
//        scanner.close();
        
        // Tests: input 3 should return 6
        System.out.println(factorial(3));
        
        
    }
    
}
